// $ANTLR 3.5.1 C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g 2020-04-02 16:13:45

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
		"E", "F", "FLOAT", "G00", "G01", "G02", "G03", "G40", "G41", "G42", "G90", 
		"G91", "G94", "G95", "G96", "G97", "I", "J", "K", "M", "POS", "S", "T", 
		"WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int CONF=5;
	public static final int D0GIT=6;
	public static final int DIGIT=7;
	public static final int E=8;
	public static final int F=9;
	public static final int FLOAT=10;
	public static final int G00=11;
	public static final int G01=12;
	public static final int G02=13;
	public static final int G03=14;
	public static final int G40=15;
	public static final int G41=16;
	public static final int G42=17;
	public static final int G90=18;
	public static final int G91=19;
	public static final int G94=20;
	public static final int G95=21;
	public static final int G96=22;
	public static final int G97=23;
	public static final int I=24;
	public static final int J=25;
	public static final int K=26;
	public static final int M=27;
	public static final int POS=28;
	public static final int S=29;
	public static final int T=30;
	public static final int WS=31;
	public static final int X=32;
	public static final int Y=33;
	public static final int Z=34;

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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:57:1: start : ( row )+ ;
	public final void start() throws RecognitionException {
		 init (/*Qui credo ci si possa inserire del codice da eseguire nel metodo init(). Da verificare*/); 
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:57:116: ( ( row )+ )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:58:3: ( row )+
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:58:3: ( row )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= E && LA1_0 <= F)||(LA1_0 >= G00 && LA1_0 <= G97)||LA1_0==M||LA1_0==S||LA1_0==WS) ) {
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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:62:1: row : ( geometricInstruction )? technologicalInstruction WS ;
	public final void row() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:62:5: ( ( geometricInstruction )? technologicalInstruction WS )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:63:2: ( geometricInstruction )? technologicalInstruction WS
			{

					handler.newLine();
				
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:66:2: ( geometricInstruction )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= G00 && LA2_0 <= G97)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:66:2: geometricInstruction
					{
					pushFollow(FOLLOW_geometricInstruction_in_row91);
					geometricInstruction();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_technologicalInstruction_in_row94);
			technologicalInstruction();
			state._fsp--;

			match(input,WS,FOLLOW_WS_in_row96); 
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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:68:1: geometricInstruction : ( ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari ) | ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari ) |otherG= ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 ) );
	public final void geometricInstruction() throws RecognitionException {
		Token g00=null;
		Token g01=null;
		Token g02=null;
		Token g03=null;
		Token otherG=null;
		ParserRuleReturnScope coordLin =null;
		ParserRuleReturnScope coordCirc =null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:69:2: ( ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari ) | ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari ) |otherG= ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 ) )
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:3: ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:3: ( (g00= G00 |g01= G01 ) coordLin= coordinateLineari )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:4: (g00= G00 |g01= G01 ) coordLin= coordinateLineari
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:4: (g00= G00 |g01= G01 )
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:5: g00= G00
							{
							g00=(Token)match(input,G00,FOLLOW_G00_in_geometricInstruction113); 
							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:15: g01= G01
							{
							g01=(Token)match(input,G01,FOLLOW_G01_in_geometricInstruction119); 
							}
							break;

					}

					pushFollow(FOLLOW_coordinateLineari_in_geometricInstruction124);
					coordLin=coordinateLineari();
					state._fsp--;

					}


								handler.evaluateG0G1(g00, g01, (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk1:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk2:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk3:null));
							
					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:75:3: ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:75:3: ( (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:75:4: (g02= G02 |g03= G03 ) coordLin= coordinateLineari coordCirc= coordinateCircolari
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:75:4: (g02= G02 |g03= G03 )
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:75:5: g02= G02
							{
							g02=(Token)match(input,G02,FOLLOW_G02_in_geometricInstruction143); 
							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:75:15: g03= G03
							{
							g03=(Token)match(input,G03,FOLLOW_G03_in_geometricInstruction149); 
							}
							break;

					}

					pushFollow(FOLLOW_coordinateLineari_in_geometricInstruction154);
					coordLin=coordinateLineari();
					state._fsp--;

					pushFollow(FOLLOW_coordinateCircolari_in_geometricInstruction158);
					coordCirc=coordinateCircolari();
					state._fsp--;

					}


								handler.evaluateG2G3(g02, g03, (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk1:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk2:null), (coordLin!=null?((gcodeParser.coordinateLineari_return)coordLin).tk3:null), (coordCirc!=null?((gcodeParser.coordinateCircolari_return)coordCirc).tk1:null), (coordCirc!=null?((gcodeParser.coordinateCircolari_return)coordCirc).tk2:null), (coordCirc!=null?((gcodeParser.coordinateCircolari_return)coordCirc).tk3:null));
							
					}
					break;
				case 3 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:80:3: otherG= ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 )
					{
					otherG=input.LT(1);
					if ( (input.LA(1) >= G40 && input.LA(1) <= G97) ) {
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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:88:1: technologicalInstruction : ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )* ;
	public final void technologicalInstruction() throws RecognitionException {
		Token sInstr=null;
		Token eInstr=null;
		Token fInstr=null;
		Token mInstr=null;
		Token tInstr=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:89:2: ( ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )* )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:3: ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )*
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:3: ( (sInstr= S )? (eInstr= E )? (fInstr= F )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:4: (sInstr= S )? (eInstr= E )? (fInstr= F )?
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:4: (sInstr= S )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==S) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:5: sInstr= S
					{
					sInstr=(Token)match(input,S,FOLLOW_S_in_technologicalInstruction236); 
					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:16: (eInstr= E )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==E) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:17: eInstr= E
					{
					eInstr=(Token)match(input,E,FOLLOW_E_in_technologicalInstruction243); 
					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:28: (fInstr= F )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==F) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:90:29: fInstr= F
					{
					fInstr=(Token)match(input,F,FOLLOW_F_in_technologicalInstruction250); 
					}
					break;

			}

			}


						handler.evaluateS(sInstr);
						handler.evaluateE(eInstr);
						handler.evaluateF(fInstr);
					
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:98:3: (mInstr= M (tInstr= T )? )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==M) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:98:4: mInstr= M (tInstr= T )?
					{
					mInstr=(Token)match(input,M,FOLLOW_M_in_technologicalInstruction271); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:98:19: (tInstr= T )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==T) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:98:19: tInstr= T
							{
							tInstr=(Token)match(input,T,FOLLOW_T_in_technologicalInstruction275); 
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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:107:1: coordinateLineari returns [Token tk1, Token tk2, Token tk3] : (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? ) ;
	public final gcodeParser.coordinateLineari_return coordinateLineari() throws RecognitionException {
		gcodeParser.coordinateLineari_return retval = new gcodeParser.coordinateLineari_return();
		retval.start = input.LT(1);

		Token x=null;
		Token y=null;
		Token z=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:108:2: ( (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:3: (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? )
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:3: (x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )? |y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )? |z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )? )
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:4: x= X (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )?
					{
					x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari322); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:9: (y= Y ( (z= Z )? ) |z= Z ( (y= Y )? ) )?
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:11: y= Y ( (z= Z )? )
							{
							y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari329); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:15: ( (z= Z )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:17: (z= Z )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:18: (z= Z )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==Z) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:18: z= Z
									{
									z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari335); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:25: z= Z ( (y= Y )? )
							{
							z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari343); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:29: ( (y= Y )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:31: (y= Y )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:32: (y= Y )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==Y) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:112:32: y= Y
									{
									y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari349); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:5: y= Y (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )?
					{
					y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari364); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:9: (x= X ( (z= Z )? ) |z= Z ( (x= X )? ) )?
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:11: x= X ( (z= Z )? )
							{
							x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari370); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:15: ( (z= Z )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:16: (z= Z )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:17: (z= Z )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==Z) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:17: z= Z
									{
									z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari375); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:24: z= Z ( (x= X )? )
							{
							z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari383); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:28: ( (x= X )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:29: (x= X )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:30: (x= X )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==X) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:114:30: x= X
									{
									x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari388); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:5: z= Z (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )?
					{
					z=(Token)match(input,Z,FOLLOW_Z_in_coordinateLineari402); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:9: (x= X ( (y= Y )? ) |y= Y ( (x= X )? ) )?
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:10: x= X ( (y= Y )? )
							{
							x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari407); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:14: ( (y= Y )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:15: (y= Y )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:16: (y= Y )?
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0==Y) ) {
								alt17=1;
							}
							switch (alt17) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:16: y= Y
									{
									y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari412); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:23: y= Y ( (x= X )? )
							{
							y=(Token)match(input,Y,FOLLOW_Y_in_coordinateLineari420); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:27: ( (x= X )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:28: (x= X )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:29: (x= X )?
							int alt18=2;
							int LA18_0 = input.LA(1);
							if ( (LA18_0==X) ) {
								alt18=1;
							}
							switch (alt18) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:116:29: x= X
									{
									x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari425); 
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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:131:1: coordinateCircolari returns [Token tk1, Token tk2, Token tk3] : (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) ) ;
	public final gcodeParser.coordinateCircolari_return coordinateCircolari() throws RecognitionException {
		gcodeParser.coordinateCircolari_return retval = new gcodeParser.coordinateCircolari_return();
		retval.start = input.LT(1);

		Token x=null;
		Token y=null;
		Token z=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:132:2: ( (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:3: (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) )
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:3: (x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) ) |y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) ) |z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) ) )
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:4: x= I (y= J ( (z= K )? ) |z= K ( (y= J )? ) )
					{
					x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari486); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:8: (y= J ( (z= K )? ) |z= K ( (y= J )? ) )
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:10: y= J ( (z= K )? )
							{
							y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari492); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:14: ( (z= K )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:16: (z= K )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:17: (z= K )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==K) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:17: z= K
									{
									z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari498); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:24: z= K ( (y= J )? )
							{
							z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari506); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:28: ( (y= J )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:30: (y= J )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:31: (y= J )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==J) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:31: y= J
									{
									y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari512); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:40: y= J (x= I ( (z= K )? ) |z= K ( (x= I )? ) )
					{
					y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari522); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:44: (x= I ( (z= K )? ) |z= K ( (x= I )? ) )
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:46: x= I ( (z= K )? )
							{
							x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari528); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:50: ( (z= K )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:51: (z= K )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:52: (z= K )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==K) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:52: z= K
									{
									z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari533); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:59: z= K ( (x= I )? )
							{
							z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari541); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:63: ( (x= I )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:64: (x= I )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:65: (x= I )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==I) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:65: x= I
									{
									x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari546); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:73: z= K (x= I ( (y= J )? ) |y= J ( (x= I )? ) )
					{
					z=(Token)match(input,K,FOLLOW_K_in_coordinateCircolari555); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:77: (x= I ( (y= J )? ) |y= J ( (x= I )? ) )
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
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:78: x= I ( (y= J )? )
							{
							x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari560); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:82: ( (y= J )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:83: (y= J )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:84: (y= J )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==J) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:84: y= J
									{
									y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari565); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:91: y= J ( (x= I )? )
							{
							y=(Token)match(input,J,FOLLOW_J_in_coordinateCircolari573); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:95: ( (x= I )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:96: (x= I )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:97: (x= I )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==I) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:138:97: x= I
									{
									x=(Token)match(input,I,FOLLOW_I_in_coordinateCircolari578); 
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



	public static final BitSet FOLLOW_row_in_start67 = new BitSet(new long[]{0x00000000A8FFFB02L});
	public static final BitSet FOLLOW_geometricInstruction_in_row91 = new BitSet(new long[]{0x00000000A8000300L});
	public static final BitSet FOLLOW_technologicalInstruction_in_row94 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_WS_in_row96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_G00_in_geometricInstruction113 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_G01_in_geometricInstruction119 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinateLineari_in_geometricInstruction124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_G02_in_geometricInstruction143 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_G03_in_geometricInstruction149 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinateLineari_in_geometricInstruction154 = new BitSet(new long[]{0x0000000007000000L});
	public static final BitSet FOLLOW_coordinateCircolari_in_geometricInstruction158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_geometricInstruction174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_in_technologicalInstruction236 = new BitSet(new long[]{0x0000000008000302L});
	public static final BitSet FOLLOW_E_in_technologicalInstruction243 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_F_in_technologicalInstruction250 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_M_in_technologicalInstruction271 = new BitSet(new long[]{0x0000000048000002L});
	public static final BitSet FOLLOW_T_in_technologicalInstruction275 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari322 = new BitSet(new long[]{0x0000000600000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari329 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari343 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari364 = new BitSet(new long[]{0x0000000500000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari370 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari383 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari402 = new BitSet(new long[]{0x0000000300000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari407 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari420 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari486 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari492 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari506 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari522 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari528 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari541 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari555 = new BitSet(new long[]{0x0000000003000000L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari560 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari573 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari578 = new BitSet(new long[]{0x0000000000000002L});
}
