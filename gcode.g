grammar gcode;

options {
  language = Java;
  k = 1;
}

@header{
  // Questo è il codice inserito fuori dalla classe del Parser
  package compilerPackage;

  import compilerPackage.util.*;
}

@lexer::header{
  // Questo è il codice inserito fuori dalla classe del Lexer
  package compilerPackage;
}

@members {
  // Questo è il codice inserito dentro la classe del Parser
  ParserHandler handler;
  
  void init () {
    handler = new ParserHandler ();
  }
  
  public String getTranslation () {
    return handler.translation.toString();
  }
  
  public ArrayList<String> getErrors () {
    return handler.errorList;
  }


  //@Override
  public void displayRecognitionError(String[] tokenNames, // Override di questo metodo presente in Parser
                                       RecognitionException e) {
		String hdr = " * " + getErrorHeader(e); // Metodi automatici definiti da AntLR
		String msg = " - " + getErrorMessage(e, tokenNames); // Metodi automatici definiti da AntLR
		  
		Token tk = input.LT(1);
		handler.handleError(tokenNames, e, hdr, msg);
  }  

}


/* -------------------------------------------------------------------------
   |                 This will be the entry point of our parser.           |
   ------------------------------------------------------------------------- */

/* "start" è il super assioma! 
occhio a non usare la ricorsione sul super assioma. Non la accetta!*/

start @init { init (/*Inizializzazione del parser handler*/); } :
  (row)+ EOF; // In questo modo abbiamo vincolato che alla fine del file deve esserci PER FORZA una riga vuota
  	      // Lato utente, l'ultima riga deve terminare con EOL EOF, in soldoni vai a capo all'ultima riga
 
    
row	:  
	{
		handler.newLine();
	}
	
	
	geometricInstruction? technologicalInstruction (EOL) // Ogni row finisce con fine riga (EOL) e non può essere l'ultima riga del file
	;

geometricInstruction
	:	
		((g00=G00 | g01=G01) coordLin=coordinateLineari )
		{
			handler.evaluateG0G1($g00, $g01, $coordLin.tk1, $coordLin.tk2, $coordLin.tk3);
		}
		| 
		((g02=G02 | g03=G03) coordLin=coordinateLineari coordCirc=coordinateCircolari )
		{
			handler.evaluateG2G3($g02, $g03, $coordLin.tk1, $coordLin.tk2, $coordLin.tk3, $coordCirc.tk1, $coordCirc.tk2, $coordCirc.tk3);
		}
		|
		otherG=(G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 | OTHERG )
		{
			// Verificare che qui becchi la scelta tra le varie G
			handler.evaluateOtherG($otherG);
		}
		 
	;
	
technologicalInstruction
	:	
		((sInstr=S 
		{ 
			// Chiamata solo se c'è il token.
			handler.evaluateS($sInstr);
		}
		)?
		(eInstr=E
		{
			// Chiamata solo se c'è il token.
			handler.evaluateE($eInstr);
		}
		)?
		(fInstr=F
		{
			// Chiamata solo se c'è il token.
			handler.evaluateF($fInstr);
		}
		)?) 
		
		// verificare che la seguente notazione chiama il metodo ad ogni token M -- VERIFICATO 02/04/2020
		// Verificare che non serve controllare token M null -- VERIFICATO 02/04/2020
		(mInstr=M tInstr=T? 
			{
				handler.evaluateM($mInstr, $tInstr);
			}
		)* 
	
	
	;	
	

coordinateLineari returns [Token tk1, Token tk2, Token tk3]
	:	
		// Qui stiamo rendendo valide coordinate circolari su 1 o 2 o 3 dimensioni.
		// Abbiamo gestito anche le possibili disposizioni delle coordinate
		
		(x=X  ( y=Y ( z=Z?) | z=Z ( y=Y? ))? 

		| y=Y ( x=X (z=Z?) | z=Z (x=X?))? 

		| z=Z (x=X (y=Y?) | y=Y (x=X?))? )
		{
			// andiamo a controllare se è null
			$tk1=$x;
			$tk2=$y;
			$tk3=$z;
			
		}
		
		
		
	;
	
	
coordinateCircolari returns [Token tk1, Token tk2, Token tk3]
	:	
		// Qui stiamo rendendo valide coordinate circolari su 2 o 3 dimensioni.
		// Non ha senso una coordinata circolare su una sola dimensione
		// Inoltre stiamo rendendo obbligatoria la presenza di almeno 2 dimensioni nel caso di una istruzione G02 o G03
		
		// Abbiamo gestito anche le possibili disposizioni delle coordinate
		(x=I ( y=J ( z=K?) | z=K ( y=J? )) | y=J ( x=I (z=K?) | z=K (x=I?)) | z=K (x=I (y=J?) | y=J (x=I?)))
		{
			// andiamo a controllare se è null
			$tk1=$x;
			$tk2=$y;
			$tk3=$z;
			
		}
		
	;
    
/* -------------------------------------------------------------------------
   |                 This will be the entry point of our lexer.            |
   ------------------------------------------------------------------------- */    


COMMENT    :   ';'  ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}; // questo è appurato corretto

WS  :   ( ' ' | '\t' ) {$channel=HIDDEN;}; 

EOL	: ('\r' '\n'? | '\n');


G00	: ('g'|'G') ('0'? '0'); // non funziona se deve leggere G0
G01	: ('g'|'G') ('0'? '1'); // non funziona se deve leggere G1
G02	: ('g'|'G') ('0'? '2');
G03	: ('g'|'G') ('0'? '3');
G90	: ('g'|'G') '90';
G91	: ('g'|'G') '91'; // ora non posso esserci spazi tra i token.

// Compensazioni utensile
G40	: ('g'|'G') '40';
G41	: ('g'|'G') '41';
G42	: ('g'|'G') '42';

// Riferite a istruzioni S e F
G94	: ('g'|'G') '94';
G95	: ('g'|'G') '95';
G96	: ('g'|'G') '96';
G97	: ('g'|'G') '97';


// istruzione G specifica non trattata ne riconosciuta
OTHERG  : ('g'|'G') 	(
			  ('0' '0'+ '0')
			| ('0' '0'+ '1')
			| ('0' '0'+ '2')
			| ('0' '0'+ '3')
			| ('0'* '4')
			| ('0'* '5')
			| ('0'* '6')
			| ('0'* '7')
			| ('0'* '8')
			| ('0'* '9')
			| '0'* '1' DIGIT 
		   	| '0'* '2' DIGIT 
		   	| '0'* '3' DIGIT 
		   	| '0'+ '40'
			| '0'+ '41'
			| '0'+ '42'
			| '0'* '43'
			| '0'* '44'
			| '0'* '45'
			| '0'* '46'
			| '0'* '47'
			| '0'* '48'
			| '0'* '49'
			| '0'* '5' DIGIT 
			| '0'* '6' DIGIT 
			| '0'* '7' DIGIT 
			| '0'* '8' DIGIT 
			| '0'+ '90'
			| '0'+ '91'
			| '0'* '92'
			| '0'* '93'
			| '0'+ '94' // questa identifica un'istruzione che senza zeri all'inizio sarebbe corretta
			| '0'+ '95' // questa identifica un'istruzione che senza zeri all'inizio sarebbe corretta
			| '0'+ '96' // questa identifica un'istruzione che senza zeri all'inizio sarebbe corretta
			| '0'+ '97' // questa identifica un'istruzione che senza zeri all'inizio sarebbe corretta
			| '0'* '98'
			| '0'* '99'
			| D0GIT DIGIT DIGIT+
			
	);   // strategia CEROTTO che non funziona se trova, ad esempio, G15

//	|	 '43'..'89' | '92'..'93' | '98'..'99'
// Coordinate
X	: ('x'|'X') FLOAT;
Y	: ('y'|'Y') FLOAT;
Z	: ('z'|'Z') FLOAT;
I	: ('i'|'I') FLOAT;
J	: ('j'|'J') FLOAT;
K	: ('k'|'K') FLOAT;

// Comandi tecnologici
M	: ('m'|'M') DIGIT DIGIT;
S	: ('s'|'S') FLOAT;
E	: ('e'|'E') FLOAT;
F	: ('f'|'F') FLOAT;
T	: ('t'|'T') POS CONF?;

EOF	: '<EOF>';

/* Questi fragment sono pezzi di token da inserire nel lexer */
fragment
POS	: DIGIT DIGIT;

fragment
CONF	: DIGIT DIGIT;



fragment
DIGIT	:	('0'..'9');

fragment
D0GIT	:	('1'..'9');

/* Numero decimale */
fragment
FLOAT	:	( '0' | D0GIT (DIGIT+)? ) ('.' DIGIT+)?;

