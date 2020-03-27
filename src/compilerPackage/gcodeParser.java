// $ANTLR 3.5.1 C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g 2020-03-27 12:12:56

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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:68:1: geometricInstruction : ( ( ( G00 | G01 ) coordinateLineari ) | ( ( G02 | G03 ) coordinateLineari coordinateCircolari ) | ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 ) );
	public final void geometricInstruction() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:69:2: ( ( ( G00 | G01 ) coordinateLineari ) | ( ( G02 | G03 ) coordinateLineari coordinateCircolari ) | ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 ) )
			int alt3=3;
			switch ( input.LA(1) ) {
			case G00:
			case G01:
				{
				alt3=1;
				}
				break;
			case G02:
			case G03:
				{
				alt3=2;
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
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:3: ( ( G00 | G01 ) coordinateLineari )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:3: ( ( G00 | G01 ) coordinateLineari )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:4: ( G00 | G01 ) coordinateLineari
					{
					if ( (input.LA(1) >= G00 && input.LA(1) <= G01) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_coordinateLineari_in_geometricInstruction118);
					coordinateLineari();
					state._fsp--;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:38: ( ( G02 | G03 ) coordinateLineari coordinateCircolari )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:38: ( ( G02 | G03 ) coordinateLineari coordinateCircolari )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:39: ( G02 | G03 ) coordinateLineari coordinateCircolari
					{
					if ( (input.LA(1) >= G02 && input.LA(1) <= G03) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_coordinateLineari_in_geometricInstruction133);
					coordinateLineari();
					state._fsp--;

					pushFollow(FOLLOW_coordinateCircolari_in_geometricInstruction135);
					coordinateCircolari();
					state._fsp--;

					}

					}
					break;
				case 3 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:70:93: ( G40 | G41 | G42 | G90 | G91 | G94 | G95 | G96 | G97 )
					{
					if ( (input.LA(1) >= G40 && input.LA(1) <= G97) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
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
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:74:1: technologicalInstruction : ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )* ;
	public final void technologicalInstruction() throws RecognitionException {
		Token sInstr=null;
		Token eInstr=null;
		Token fInstr=null;
		Token mInstr=null;
		Token tInstr=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:75:2: ( ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )* )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:3: ( (sInstr= S )? (eInstr= E )? (fInstr= F )? ) (mInstr= M (tInstr= T )? )*
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:3: ( (sInstr= S )? (eInstr= E )? (fInstr= F )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:4: (sInstr= S )? (eInstr= E )? (fInstr= F )?
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:4: (sInstr= S )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==S) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:5: sInstr= S
					{
					sInstr=(Token)match(input,S,FOLLOW_S_in_technologicalInstruction199); 
					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:16: (eInstr= E )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==E) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:17: eInstr= E
					{
					eInstr=(Token)match(input,E,FOLLOW_E_in_technologicalInstruction206); 
					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:28: (fInstr= F )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==F) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:76:29: fInstr= F
					{
					fInstr=(Token)match(input,F,FOLLOW_F_in_technologicalInstruction213); 
					}
					break;

			}

			}


						handler.evaluateS(sInstr);
						handler.evaluateE(eInstr);
						handler.evaluateF(fInstr);
					
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:84:3: (mInstr= M (tInstr= T )? )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==M) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:84:4: mInstr= M (tInstr= T )?
					{
					mInstr=(Token)match(input,M,FOLLOW_M_in_technologicalInstruction234); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:84:19: (tInstr= T )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==T) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:84:19: tInstr= T
							{
							tInstr=(Token)match(input,T,FOLLOW_T_in_technologicalInstruction238); 
							}
							break;

					}


									handler.evaluateM(mInstr, tInstr);
								
					}
					break;

				default :
					break loop8;
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



	// $ANTLR start "coordinateLineari"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:93:1: coordinateLineari : (x= X ( Y ( ( Z )? ) | Z ( ( Y )? ) )? | Y (x= X ( ( Z )? ) | Z ( (x= X )? ) )? | Z (x= X ( ( Y )? ) | Y ( (x= X )? ) )? );
	public final void coordinateLineari() throws RecognitionException {
		Token x=null;

		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:94:2: (x= X ( Y ( ( Z )? ) | Z ( ( Y )? ) )? | Y (x= X ( ( Z )? ) | Z ( (x= X )? ) )? | Z (x= X ( ( Y )? ) | Y ( (x= X )? ) )? )
			int alt18=3;
			switch ( input.LA(1) ) {
			case X:
				{
				alt18=1;
				}
				break;
			case Y:
				{
				alt18=2;
				}
				break;
			case Z:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:3: x= X ( Y ( ( Z )? ) | Z ( ( Y )? ) )?
					{
					x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari278); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:7: ( Y ( ( Z )? ) | Z ( ( Y )? ) )?
					int alt11=3;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Y) ) {
						alt11=1;
					}
					else if ( (LA11_0==Z) ) {
						alt11=2;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:9: Y ( ( Z )? )
							{
							match(input,Y,FOLLOW_Y_in_coordinateLineari282); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:11: ( ( Z )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:13: ( Z )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:13: ( Z )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==Z) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:13: Z
									{
									match(input,Z,FOLLOW_Z_in_coordinateLineari286); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:19: Z ( ( Y )? )
							{
							match(input,Z,FOLLOW_Z_in_coordinateLineari292); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:21: ( ( Y )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:23: ( Y )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:23: ( Y )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==Y) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:23: Y
									{
									match(input,Y,FOLLOW_Y_in_coordinateLineari296); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:32: Y (x= X ( ( Z )? ) | Z ( (x= X )? ) )?
					{
					match(input,Y,FOLLOW_Y_in_coordinateLineari305); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:34: (x= X ( ( Z )? ) | Z ( (x= X )? ) )?
					int alt14=3;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==X) ) {
						alt14=1;
					}
					else if ( (LA14_0==Z) ) {
						alt14=2;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:36: x= X ( ( Z )? )
							{
							x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari311); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:40: ( ( Z )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:41: ( Z )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:41: ( Z )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==Z) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:41: Z
									{
									match(input,Z,FOLLOW_Z_in_coordinateLineari314); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:47: Z ( (x= X )? )
							{
							match(input,Z,FOLLOW_Z_in_coordinateLineari320); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:49: ( (x= X )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:50: (x= X )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:51: (x= X )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==X) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:51: x= X
									{
									x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari325); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:60: Z (x= X ( ( Y )? ) | Y ( (x= X )? ) )?
					{
					match(input,Z,FOLLOW_Z_in_coordinateLineari333); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:62: (x= X ( ( Y )? ) | Y ( (x= X )? ) )?
					int alt17=3;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==X) ) {
						alt17=1;
					}
					else if ( (LA17_0==Y) ) {
						alt17=2;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:63: x= X ( ( Y )? )
							{
							x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari338); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:67: ( ( Y )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:68: ( Y )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:68: ( Y )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==Y) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:68: Y
									{
									match(input,Y,FOLLOW_Y_in_coordinateLineari341); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:74: Y ( (x= X )? )
							{
							match(input,Y,FOLLOW_Y_in_coordinateLineari347); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:76: ( (x= X )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:77: (x= X )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:78: (x= X )?
							int alt16=2;
							int LA16_0 = input.LA(1);
							if ( (LA16_0==X) ) {
								alt16=1;
							}
							switch (alt16) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:97:78: x= X
									{
									x=(Token)match(input,X,FOLLOW_X_in_coordinateLineari352); 
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
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "coordinateLineari"



	// $ANTLR start "coordinateCircolari"
	// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:103:1: coordinateCircolari : ( I ( J ( ( K )? ) | K ( ( J )? ) ) | J ( I ( ( K )? ) | K ( ( I )? ) ) | K ( I ( ( J )? ) | J ( ( I )? ) ) );
	public final void coordinateCircolari() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:104:2: ( I ( J ( ( K )? ) | K ( ( J )? ) ) | J ( I ( ( K )? ) | K ( ( I )? ) ) | K ( I ( ( J )? ) | J ( ( I )? ) ) )
			int alt28=3;
			switch ( input.LA(1) ) {
			case I:
				{
				alt28=1;
				}
				break;
			case J:
				{
				alt28=2;
				}
				break;
			case K:
				{
				alt28=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:3: I ( J ( ( K )? ) | K ( ( J )? ) )
					{
					match(input,I,FOLLOW_I_in_coordinateCircolari396); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:5: ( J ( ( K )? ) | K ( ( J )? ) )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==J) ) {
						alt21=1;
					}
					else if ( (LA21_0==K) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:7: J ( ( K )? )
							{
							match(input,J,FOLLOW_J_in_coordinateCircolari400); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:9: ( ( K )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:11: ( K )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:11: ( K )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==K) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:11: K
									{
									match(input,K,FOLLOW_K_in_coordinateCircolari404); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:17: K ( ( J )? )
							{
							match(input,K,FOLLOW_K_in_coordinateCircolari410); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:19: ( ( J )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:21: ( J )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:21: ( J )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==J) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:21: J
									{
									match(input,J,FOLLOW_J_in_coordinateCircolari414); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:29: J ( I ( ( K )? ) | K ( ( I )? ) )
					{
					match(input,J,FOLLOW_J_in_coordinateCircolari422); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:31: ( I ( ( K )? ) | K ( ( I )? ) )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==I) ) {
						alt24=1;
					}
					else if ( (LA24_0==K) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:33: I ( ( K )? )
							{
							match(input,I,FOLLOW_I_in_coordinateCircolari426); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:35: ( ( K )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:36: ( K )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:36: ( K )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==K) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:36: K
									{
									match(input,K,FOLLOW_K_in_coordinateCircolari429); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:42: K ( ( I )? )
							{
							match(input,K,FOLLOW_K_in_coordinateCircolari435); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:44: ( ( I )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:45: ( I )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:45: ( I )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==I) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:45: I
									{
									match(input,I,FOLLOW_I_in_coordinateCircolari438); 
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
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:52: K ( I ( ( J )? ) | J ( ( I )? ) )
					{
					match(input,K,FOLLOW_K_in_coordinateCircolari445); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:54: ( I ( ( J )? ) | J ( ( I )? ) )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==I) ) {
						alt27=1;
					}
					else if ( (LA27_0==J) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:55: I ( ( J )? )
							{
							match(input,I,FOLLOW_I_in_coordinateCircolari448); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:57: ( ( J )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:58: ( J )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:58: ( J )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==J) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:58: J
									{
									match(input,J,FOLLOW_J_in_coordinateCircolari451); 
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:64: J ( ( I )? )
							{
							match(input,J,FOLLOW_J_in_coordinateCircolari457); 
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:66: ( ( I )? )
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:67: ( I )?
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:67: ( I )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==I) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:110:67: I
									{
									match(input,I,FOLLOW_I_in_coordinateCircolari460); 
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
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "coordinateCircolari"

	// Delegated rules



	public static final BitSet FOLLOW_row_in_start67 = new BitSet(new long[]{0x00000000A8FFFB02L});
	public static final BitSet FOLLOW_geometricInstruction_in_row91 = new BitSet(new long[]{0x00000000A8000300L});
	public static final BitSet FOLLOW_technologicalInstruction_in_row94 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_WS_in_row96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_geometricInstruction110 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinateLineari_in_geometricInstruction118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_geometricInstruction125 = new BitSet(new long[]{0x0000000700000000L});
	public static final BitSet FOLLOW_coordinateLineari_in_geometricInstruction133 = new BitSet(new long[]{0x0000000007000000L});
	public static final BitSet FOLLOW_coordinateCircolari_in_geometricInstruction135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_geometricInstruction141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_S_in_technologicalInstruction199 = new BitSet(new long[]{0x0000000008000302L});
	public static final BitSet FOLLOW_E_in_technologicalInstruction206 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_F_in_technologicalInstruction213 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_M_in_technologicalInstruction234 = new BitSet(new long[]{0x0000000048000002L});
	public static final BitSet FOLLOW_T_in_technologicalInstruction238 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari278 = new BitSet(new long[]{0x0000000600000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari282 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari292 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari305 = new BitSet(new long[]{0x0000000500000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari311 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari320 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Z_in_coordinateLineari333 = new BitSet(new long[]{0x0000000300000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari338 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Y_in_coordinateLineari347 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_X_in_coordinateLineari352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari396 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari400 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari410 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari422 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari426 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari435 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_in_coordinateCircolari445 = new BitSet(new long[]{0x0000000003000000L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari448 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_J_in_coordinateCircolari457 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_I_in_coordinateCircolari460 = new BitSet(new long[]{0x0000000000000002L});
}
