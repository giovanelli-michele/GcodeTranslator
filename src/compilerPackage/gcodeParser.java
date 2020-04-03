// $ANTLR 3.5.1 C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g 2020-04-03 12:11:50

  // Questo è il codice inserito fuori dalla classe del Parser
  package compilerPackage;

  import compilerPackage.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gcodeParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "CONF", "D0GIT", "DIGIT", 
		"E", "EOL", "F", "FLOAT", "G00", "G01", "G02", "G03", "G40", "G41", "G42", 
		"G90", "G91", "G94", "G95", "G96", "G97", "I", "J", "K", "M", "OTHERG", 
		"POS", "S", "T", "WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int CONF=5;
	public static final int D0GIT=6;
	public static final int DIGIT=7;
	public static final int E=8;
	public static final int EOL=9;
	public static final int F=10;
	public static final int FLOAT=11;
	public static final int G00=12;
	public static final int G01=13;
	public static final int G02=14;
	public static final int G03=15;
	public static final int G40=16;
	public static final int G41=17;
	public static final int G42=18;
	public static final int G90=19;
	public static final int G91=20;
	public static final int G94=21;
	public static final int G95=22;
	public static final int G96=23;
	public static final int G97=24;
	public static final int I=25;
	public static final int J=26;
	public static final int K=27;
	public static final int M=28;
	public static final int OTHERG=29;
	public static final int POS=30;
	public static final int S=31;
	public static final int T=32;
	public static final int WS=33;
	public static final int X=34;
	public static final int Y=35;
	public static final int Z=36;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public gcodeParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public gcodeParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return gcodeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g"; }


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




	// $ANTLR start "start"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:57:1: start : ( row )+ EOF ;
	public final void start() throws RecognitionException {
		 init (/*Inizializzazione del parser handler*/); 
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:57:65: ( ( row )+ EOF )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:58:3: ( row )+ EOF
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:58:3: ( row )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= E && LA1_0 <= F)||(LA1_0 >= G00 && LA1_0 <= G97)||(LA1_0 >= M && LA1_0 <= OTHERG)||LA1_0==S) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:58:4: row
					{
					pushFollow(FOLLOW_row_in_start67);
					row();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_start71); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "row"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:62:1: row : ( geometricInstruction )? technologicalInstruction ( EOL ) ;
	public final void row() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:62:5: ( ( geometricInstruction )? technologicalInstruction ( EOL ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:63:2: ( geometricInstruction )? technologicalInstruction ( EOL )
			{

					handler.newLine();
				
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:68:2: ( geometricInstruction )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= G00 && LA2_0 <= G97)||LA2_0==OTHERG) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:68:2: geometricInstruction
					{
					pushFollow(FOLLOW_geometricInstruction_in_row106);
					geometricInstruction();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_technologicalInstruction_in_row109);
			technologicalInstruction();
			state._fsp--;

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:68:49: ( EOL )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:68:50: EOL
			{
			match(input,EOL,FOLLOW_EOL_in_row112); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "row"



	// $ANTLR start "geometricInstruction"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:71:1: geometricInstruction : ( ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari ) | ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari ) |otherG= ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 | OTHERG ) );
	public final void geometricInstruction() throws RecognitionException {
		Token g00=null;
		Token g01=null;
		Token g02=null;
		Token g03=null;
		Token otherG=null;
		ParserRuleReturnScope coordLin =null;
		ParserRuleReturnScope coordCirc =null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:72:2: ( ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari ) | ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari ) |otherG= ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 | OTHERG ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case G00:
			case G01:
				{
				alt5=1;
				}
				break;
			case G02:
			case G03:
				{
				alt5=2;
				}
				break;
			case G40:
			case G41:
			case G42:
			case G90:
			case G91:
			case G94:
			case G95:
			case G96:
			case G97:
			case OTHERG:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:73:3: ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:73:3: ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:73:4: (g00= G00 |g01= G01 ) coordLin= coordinateLineari
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:73:4: (g00= G00 |g01= G01 )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==G00) ) {
						alt3=1;
					}
					else if ( (LA3_0==G01) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:73:5: g00= G00
							{
							g00=(Token)match(input,G00,FOLLOW_G00_in_geometricInstruction132); 
							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:73:15: g01= G01
							{
							g01=(Token)match(input,G01,FOLLOW_G01_in_geometricInstruction138); 
							}
							break;

					}

					pushFollow(FOLLOW_coordinateLineari_in_geometricInstruction143);
					coordLin=coordinateLineari();
					state._fsp--;

					}


								handler.evaluateG0G1(g00, g01, (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk1:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk2:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk3:null));
							
					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:78:3: ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:78:3: ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:78:4: (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:78:4: (g02= G02 |g03= G03 )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==G02) ) {
						alt4=1;
					}
					else if ( (LA4_0==G03) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:78:5: g02= G02
							{
							g02=(Token)match(input,G02,FOLLOW_G02_in_geometricInstruction162); 
							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:78:15: g03= G03
							{
							g03=(Token)match(input,G03,FOLLOW_G03_in_geometricInstruction168); 
							}
							break;

					}

					pushFollow(FOLLOW_coordinateLineari_in_geometricInstruction173);
					coordLin=coordinateLineari();
					state._fsp--;

					pushFollow(FOLLOW_coordinateCircolari_in_geometricInstruction177);
					coordCirc=coordinateCircolari();
					state._fsp--;

					}


								handler.evaluateG2G3(g02, g03, (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk1:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk2:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk3:null), (coordCirc!=null?((gcodeParser.coordinateCircolari_return)coordCirc).tk1:null), (coordCirc!=null?((gcodeParser.coordinateCircolari_return)coordCirc).tk2:null), (coordCirc!=null?((gcodeParser.coordinateCircolari_return)coordCirc).tk3:null));
							
					}
					break;
				case 3 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:83:3: otherG= ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 | OTHERG )
					{
					otherG=input.LT(1);
					if ( (input.LA(1) >= G40 && input.LA(1) <= G97)||input.LA(1)==OTHERG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

								// Verificare che qui becchi la scelta tra le varie G
								handler.evaluateOtherG(otherG);
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "geometricInstruction"



	// $ANTLR start "technologicalInstruction"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:91:1: technologicalInstruction : ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )* ;
	public final void technologicalInstruction() throws RecognitionException {
		Token sInstr=null;
		Token eInstr=null;
		Token fInstr=null;
		Token mInstr=null;
		Token tInstr=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:92:2: ( ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )* )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:93:3: ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )*
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:93:3: ( (sInstr= S )? (eInstr= E )? (fInstr= F )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:93:4: (sInstr= S )? (eInstr= E )? (fInstr= F )?
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:93:4: (sInstr= S )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==S) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:93:5: sInstr= S
					{
					sInstr=(Token)match(input,S,FOLLOW_S_in_technologicalInstruction259); 
					 
								// Chiamata solo se c'è il token.
								handler.evaluateS(sInstr);
							
					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:99:3: (eInstr= E )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==E) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:99:4: eInstr= E
					{
					eInstr=(Token)match(input,E,FOLLOW_E_in_technologicalInstruction276); 

								// Chiamata solo se c'è il token.
								handler.evaluateE(eInstr);
							
					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:105:3: (fInstr= F )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==F) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:105:4: fInstr= F
					{
					fInstr=(Token)match(input,F,FOLLOW_F_in_technologicalInstruction292); 

								// Chiamata solo se c'è il token.
								handler.evaluateF(fInstr);
							
					}
					break;

			}

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:3: (mInstr= M (tInstr= T )? )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==M) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:4: mInstr= M (tInstr= T )?
					{
					mInstr=(Token)match(input,M,FOLLOW_M_in_technologicalInstruction319); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:19: (tInstr= T )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==T) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:19: tInstr= T
							{
							tInstr=(Token)match(input,T,FOLLOW_T_in_technologicalInstruction323); 
							}
							break;

					}


									handler.evaluateM(mInstr, tInstr);
								
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "technologicalInstruction"


	public static class coordinateLineari_return extends ParserRuleReturnScope {
		public Token tk1;
		public Token tk2;
		public Token tk3;
	};


	// $ANTLR start "coordinateLineari"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:124:1: coordinateLineari returns [Token tk1, Token tk2, Token tk3] : (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? ) ;
	public final gcodeParser.coordinateLineari_return coordinateLineari() throws RecognitionException {
		gcodeParser.coordinateLineari_return retval = new gcodeParser.coordinateLineari_return();
		retval.start = input.LT(1);

		Token x=null;
		Token y=null;
		Token z=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:125:2: ( (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:3: (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? )
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:3: (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? )
			int alt20=3;
			switch ( input.LA(1) ) {
			case X:
				{
				alt20=1;
				}
				break;
			case Y:
				{
				alt20=2;
				}
				break;
			case Z:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:4: x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )?
					{
					x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari373); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:9: (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )?
					int alt13=3;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==Y) ) {
						alt13=1;
					}
					else if ( (LA13_0==Z) ) {
						alt13=2;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:11: y= Y ( (z= Z )? )
							{
							y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari380); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:15: ( (z= Z )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:17: (z= Z )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:18: (z= Z )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==Z) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:18: z= Z
									{
									z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari386); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:25: z= Z ( (y= Y )? )
							{
							z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari394); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:29: ( (y= Y )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:31: (y= Y )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:32: (y= Y )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==Y) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:129:32: y= Y
									{
									y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari400); 
									}
									break;

							}

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:5: y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )?
					{
					y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari415); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:9: (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )?
					int alt16=3;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==X) ) {
						alt16=1;
					}
					else if ( (LA16_0==Z) ) {
						alt16=2;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:11: x= X ( (z= Z )? )
							{
							x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari421); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:15: ( (z= Z )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:16: (z= Z )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:17: (z= Z )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==Z) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:17: z= Z
									{
									z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari426); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:24: z= Z ( (x= X )? )
							{
							z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari434); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:28: ( (x= X )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:29: (x= X )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:30: (x= X )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==X) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:30: x= X
									{
									x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari439); 
									}
									break;

							}

							}

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:5: z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )?
					{
					z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari453); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:9: (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )?
					int alt19=3;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==X) ) {
						alt19=1;
					}
					else if ( (LA19_0==Y) ) {
						alt19=2;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:10: x= X ( (y= Y )? )
							{
							x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari458); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:14: ( (y= Y )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:15: (y= Y )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:16: (y= Y )?
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0==Y) ) {
								alt17=1;
							}
							switch (alt17) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:16: y= Y
									{
									y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari463); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:23: y= Y ( (x= X )? )
							{
							y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari471); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:27: ( (x= X )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:28: (x= X )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:29: (x= X )?
							int alt18=2;
							int LA18_0 = input.LA(1);
							if ( (LA18_0==X) ) {
								alt18=1;
							}
							switch (alt18) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:133:29: x= X
									{
									x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari476); 
									}
									break;

							}

							}

							}
							break;

					}

					}
					break;

			}


						// andiamo a controllare se è null
						retval.tk1 =x;
						retval.tk2 =y;
						retval.tk3 =z;
						
					
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coordinateLineari"


	public static class coordinateCircolari_return extends ParserRuleReturnScope {
		public Token tk1;
		public Token tk2;
		public Token tk3;
	};


	// $ANTLR start "coordinateCircolari"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:147:1: coordinateCircolari returns [Token tk1, Token tk2, Token tk3] : (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) ) ;
	public final gcodeParser.coordinateCircolari_return coordinateCircolari() throws RecognitionException {
		gcodeParser.coordinateCircolari_return retval = new gcodeParser.coordinateCircolari_return();
		retval.start = input.LT(1);

		Token x=null;
		Token y=null;
		Token z=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:148:2: ( (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:3: (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) )
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:3: (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) )
			int alt30=3;
			switch ( input.LA(1) ) {
			case I:
				{
				alt30=1;
				}
				break;
			case J:
				{
				alt30=2;
				}
				break;
			case K:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:4: x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) )
					{
					x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari534); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:8: (y= J ( (z= K )? ) |z= K ( (y= J )? ) )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==J) ) {
						alt23=1;
					}
					else if ( (LA23_0==K) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:10: y= J ( (z= K )? )
							{
							y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari540); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:14: ( (z= K )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:16: (z= K )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:17: (z= K )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==K) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:17: z= K
									{
									z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari546); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:24: z= K ( (y= J )? )
							{
							z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari554); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:28: ( (y= J )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:30: (y= J )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:31: (y= J )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==J) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:31: y= J
									{
									y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari560); 
									}
									break;

							}

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:40: y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) )
					{
					y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari570); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:44: (x= I ( (z= K )? ) |z= K ( (x= I )? ) )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==I) ) {
						alt26=1;
					}
					else if ( (LA26_0==K) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:46: x= I ( (z= K )? )
							{
							x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari576); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:50: ( (z= K )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:51: (z= K )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:52: (z= K )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==K) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:52: z= K
									{
									z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari581); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:59: z= K ( (x= I )? )
							{
							z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari589); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:63: ( (x= I )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:64: (x= I )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:65: (x= I )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==I) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:65: x= I
									{
									x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari594); 
									}
									break;

							}

							}

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:73: z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) )
					{
					z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari603); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:77: (x= I ( (y= J )? ) |y= J ( (x= I )? ) )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==I) ) {
						alt29=1;
					}
					else if ( (LA29_0==J) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:78: x= I ( (y= J )? )
							{
							x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari608); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:82: ( (y= J )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:83: (y= J )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:84: (y= J )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==J) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:84: y= J
									{
									y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari613); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:91: y= J ( (x= I )? )
							{
							y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari621); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:95: ( (x= I )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:96: (x= I )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:97: (x= I )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==I) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:97: x= I
									{
									x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari626); 
									}
									break;

							}

							}

							}
							break;

					}

					}
					break;

			}


						// andiamo a controllare se è null
						retval.tk1 =x;
						retval.tk2 =y;
						retval.tk3 =z;
						
					
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coordinateCircolari"

	// Delegated rules



	public static final BitSet FOLLOW_row_in_start67 = new BitSet(new long[]{0x00000000B1FFF700L});
	public static final BitSet FOLLOW_EOF_in_start71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_geometricInstruction_in_row106 = new BitSet(new long[]{0x0000000090000700L});
	public static final BitSet FOLLOW_technologicalInstruction_in_row109 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EOL_in_row112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_G00_in_geometricInstruction132 = new BitSet(new long[]{0x0000001C00000000L});
	public static final BitSet FOLLOW_G01_in_geometricInstruction138 = new BitSet(new long[]{0x0000001C00000000L});
	public static final BitSet FOLLOW_coordinateLineari_in_geometricInstruction143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_G02_in_geometricInstruction162 = new BitSet(new long[]{0x0000001C00000000L});
	public static final BitSet FOLLOW_G03_in_geometricInstruction168 = new BitSet(new long[]{0x0000001C00000000L});
	public static final BitSet FOLLOW_coordinateLineari_in_geometricInstruction173 = new BitSet(new long[]{0x000000000E000000L});
	public static final BitSet FOLLOW_coordinateCircolari_in_geometricInstruction177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_geometricInstruction193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_in_technologicalInstruction259 = new BitSet(new long[]{0x0000000010000502L});
	public static final BitSet FOLLOW_E_in_technologicalInstruction276 = new BitSet(new long[]{0x0000000010000402L});
	public static final BitSet FOLLOW_F_in_technologicalInstruction292 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_M_in_technologicalInstruction319 = new BitSet(new long[]{0x0000000110000002L});
	public static final BitSet FOLLOW_T_in_technologicalInstruction323 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari373 = new BitSet(new long[]{0x0000001800000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari380 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari394 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari415 = new BitSet(new long[]{0x0000001400000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari421 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari434 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari453 = new BitSet(new long[]{0x0000000C00000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari458 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari471 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari534 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari540 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari554 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari570 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari576 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari589 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari603 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari608 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari621 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari626 = new BitSet(new long[]{0x0000000000000002L});
}
