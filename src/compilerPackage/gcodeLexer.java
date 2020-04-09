// $ANTLR 3.5.1 C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g 2020-04-09 14:09:00

  // Questo è il codice inserito fuori dalla classe del Lexer
  package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class gcodeLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public gcodeLexer() {} 
	public gcodeLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public gcodeLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g"; }

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:174:12: ( ';' (~ ( '\\n' | '\\r' ) )* )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:174:16: ';' (~ ( '\\n' | '\\r' ) )*
			{
			match(';'); 
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:174:21: (~ ( '\\n' | '\\r' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:176:5: ( ( ' ' | '\\t' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:176:9: ( ' ' | '\\t' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:178:5: ( ( '\\r' ( '\\n' )? | '\\n' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:178:7: ( '\\r' ( '\\n' )? | '\\n' )
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:178:7: ( '\\r' ( '\\n' )? | '\\n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:178:8: '\\r' ( '\\n' )?
					{
					match('\r'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:178:13: ( '\\n' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='\n') ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:178:13: '\\n'
							{
							match('\n'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:178:21: '\\n'
					{
					match('\n'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOL"

	// $ANTLR start "G00"
	public final void mG00() throws RecognitionException {
		try {
			int _type = G00;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:181:5: ( ( 'g' | 'G' ) ( ( '0' )? '0' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:181:7: ( 'g' | 'G' ) ( ( '0' )? '0' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:181:17: ( ( '0' )? '0' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:181:18: ( '0' )? '0'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:181:18: ( '0' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='0') ) {
					alt4=1;
				}
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:181:18: '0'
					{
					match('0'); 
					}
					break;

			}

			match('0'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G00"

	// $ANTLR start "G01"
	public final void mG01() throws RecognitionException {
		try {
			int _type = G01;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:182:5: ( ( 'g' | 'G' ) ( ( '0' )? '1' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:182:7: ( 'g' | 'G' ) ( ( '0' )? '1' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:182:17: ( ( '0' )? '1' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:182:18: ( '0' )? '1'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:182:18: ( '0' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:182:18: '0'
					{
					match('0'); 
					}
					break;

			}

			match('1'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G01"

	// $ANTLR start "G02"
	public final void mG02() throws RecognitionException {
		try {
			int _type = G02;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:183:5: ( ( 'g' | 'G' ) ( ( '0' )? '2' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:183:7: ( 'g' | 'G' ) ( ( '0' )? '2' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:183:17: ( ( '0' )? '2' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:183:18: ( '0' )? '2'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:183:18: ( '0' )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:183:18: '0'
					{
					match('0'); 
					}
					break;

			}

			match('2'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G02"

	// $ANTLR start "G03"
	public final void mG03() throws RecognitionException {
		try {
			int _type = G03;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:5: ( ( 'g' | 'G' ) ( ( '0' )? '3' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:7: ( 'g' | 'G' ) ( ( '0' )? '3' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:17: ( ( '0' )? '3' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:18: ( '0' )? '3'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:18: ( '0' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:18: '0'
					{
					match('0'); 
					}
					break;

			}

			match('3'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G03"

	// $ANTLR start "G90"
	public final void mG90() throws RecognitionException {
		try {
			int _type = G90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:185:5: ( ( 'g' | 'G' ) '90' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:185:7: ( 'g' | 'G' ) '90'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("90"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G90"

	// $ANTLR start "G91"
	public final void mG91() throws RecognitionException {
		try {
			int _type = G91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:186:5: ( ( 'g' | 'G' ) '91' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:186:7: ( 'g' | 'G' ) '91'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("91"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G91"

	// $ANTLR start "G40"
	public final void mG40() throws RecognitionException {
		try {
			int _type = G40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:189:5: ( ( 'g' | 'G' ) '40' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:189:7: ( 'g' | 'G' ) '40'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("40"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G40"

	// $ANTLR start "G41"
	public final void mG41() throws RecognitionException {
		try {
			int _type = G41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:190:5: ( ( 'g' | 'G' ) '41' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:190:7: ( 'g' | 'G' ) '41'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("41"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G41"

	// $ANTLR start "G42"
	public final void mG42() throws RecognitionException {
		try {
			int _type = G42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:191:5: ( ( 'g' | 'G' ) '42' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:191:7: ( 'g' | 'G' ) '42'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("42"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G42"

	// $ANTLR start "G94"
	public final void mG94() throws RecognitionException {
		try {
			int _type = G94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:194:5: ( ( 'g' | 'G' ) '94' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:194:7: ( 'g' | 'G' ) '94'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("94"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G94"

	// $ANTLR start "G95"
	public final void mG95() throws RecognitionException {
		try {
			int _type = G95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:195:5: ( ( 'g' | 'G' ) '95' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:195:7: ( 'g' | 'G' ) '95'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("95"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G95"

	// $ANTLR start "G96"
	public final void mG96() throws RecognitionException {
		try {
			int _type = G96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:196:5: ( ( 'g' | 'G' ) '96' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:196:7: ( 'g' | 'G' ) '96'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("96"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G96"

	// $ANTLR start "G97"
	public final void mG97() throws RecognitionException {
		try {
			int _type = G97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:197:5: ( ( 'g' | 'G' ) '97' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:197:7: ( 'g' | 'G' ) '97'
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match("97"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G97"

	// $ANTLR start "OTHERG"
	public final void mOTHERG() throws RecognitionException {
		try {
			int _type = OTHERG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:201:9: ( ( 'g' | 'G' ) ( ( '0' ( '0' )+ '0' ) | ( '0' ( '0' )+ '1' ) | ( '0' ( '0' )+ '2' ) | ( '0' ( '0' )+ '3' ) | ( ( '0' )* '4' ) | ( ( '0' )* '5' ) | ( ( '0' )* '6' ) | ( ( '0' )* '7' ) | ( ( '0' )* '8' ) | ( ( '0' )* '9' ) | ( '0' )* '1' DIGIT | ( '0' )* '2' DIGIT | ( '0' )* '3' DIGIT | ( '0' )+ '40' | ( '0' )+ '41' | ( '0' )+ '42' | ( '0' )* '43' | ( '0' )* '44' | ( '0' )* '45' | ( '0' )* '46' | ( '0' )* '47' | ( '0' )* '48' | ( '0' )* '49' | ( '0' )* '5' DIGIT | ( '0' )* '6' DIGIT | ( '0' )* '7' DIGIT | ( '0' )* '8' DIGIT | ( '0' )+ '90' | ( '0' )+ '91' | ( '0' )* '92' | ( '0' )* '93' | ( '0' )+ '94' | ( '0' )+ '95' | ( '0' )+ '96' | ( '0' )+ '97' | ( '0' )* '98' | ( '0' )* '99' | D0GIT DIGIT ( DIGIT )+ ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:201:11: ( 'g' | 'G' ) ( ( '0' ( '0' )+ '0' ) | ( '0' ( '0' )+ '1' ) | ( '0' ( '0' )+ '2' ) | ( '0' ( '0' )+ '3' ) | ( ( '0' )* '4' ) | ( ( '0' )* '5' ) | ( ( '0' )* '6' ) | ( ( '0' )* '7' ) | ( ( '0' )* '8' ) | ( ( '0' )* '9' ) | ( '0' )* '1' DIGIT | ( '0' )* '2' DIGIT | ( '0' )* '3' DIGIT | ( '0' )+ '40' | ( '0' )+ '41' | ( '0' )+ '42' | ( '0' )* '43' | ( '0' )* '44' | ( '0' )* '45' | ( '0' )* '46' | ( '0' )* '47' | ( '0' )* '48' | ( '0' )* '49' | ( '0' )* '5' DIGIT | ( '0' )* '6' DIGIT | ( '0' )* '7' DIGIT | ( '0' )* '8' DIGIT | ( '0' )+ '90' | ( '0' )+ '91' | ( '0' )* '92' | ( '0' )* '93' | ( '0' )+ '94' | ( '0' )+ '95' | ( '0' )+ '96' | ( '0' )+ '97' | ( '0' )* '98' | ( '0' )* '99' | D0GIT DIGIT ( DIGIT )+ )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:201:22: ( ( '0' ( '0' )+ '0' ) | ( '0' ( '0' )+ '1' ) | ( '0' ( '0' )+ '2' ) | ( '0' ( '0' )+ '3' ) | ( ( '0' )* '4' ) | ( ( '0' )* '5' ) | ( ( '0' )* '6' ) | ( ( '0' )* '7' ) | ( ( '0' )* '8' ) | ( ( '0' )* '9' ) | ( '0' )* '1' DIGIT | ( '0' )* '2' DIGIT | ( '0' )* '3' DIGIT | ( '0' )+ '40' | ( '0' )+ '41' | ( '0' )+ '42' | ( '0' )* '43' | ( '0' )* '44' | ( '0' )* '45' | ( '0' )* '46' | ( '0' )* '47' | ( '0' )* '48' | ( '0' )* '49' | ( '0' )* '5' DIGIT | ( '0' )* '6' DIGIT | ( '0' )* '7' DIGIT | ( '0' )* '8' DIGIT | ( '0' )+ '90' | ( '0' )+ '91' | ( '0' )* '92' | ( '0' )* '93' | ( '0' )+ '94' | ( '0' )+ '95' | ( '0' )+ '96' | ( '0' )+ '97' | ( '0' )* '98' | ( '0' )* '99' | D0GIT DIGIT ( DIGIT )+ )
			int alt46=38;
			alt46 = dfa46.predict(input);
			switch (alt46) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:202:6: ( '0' ( '0' )+ '0' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:202:6: ( '0' ( '0' )+ '0' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:202:7: '0' ( '0' )+ '0'
					{
					match('0'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:202:11: ( '0' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='0') ) {
							int LA8_1 = input.LA(2);
							if ( (LA8_1=='0') ) {
								alt8=1;
							}

						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:202:11: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('0'); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:203:6: ( '0' ( '0' )+ '1' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:203:6: ( '0' ( '0' )+ '1' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:203:7: '0' ( '0' )+ '1'
					{
					match('0'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:203:11: ( '0' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0=='0') ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:203:11: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match('1'); 
					}

					}
					break;
				case 3 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:204:6: ( '0' ( '0' )+ '2' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:204:6: ( '0' ( '0' )+ '2' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:204:7: '0' ( '0' )+ '2'
					{
					match('0'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:204:11: ( '0' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0=='0') ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:204:11: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					match('2'); 
					}

					}
					break;
				case 4 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:205:6: ( '0' ( '0' )+ '3' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:205:6: ( '0' ( '0' )+ '3' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:205:7: '0' ( '0' )+ '3'
					{
					match('0'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:205:11: ( '0' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0=='0') ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:205:11: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match('3'); 
					}

					}
					break;
				case 5 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:206:6: ( ( '0' )* '4' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:206:6: ( ( '0' )* '4' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:206:7: ( '0' )* '4'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:206:7: ( '0' )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='0') ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:206:7: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop12;
						}
					}

					match('4'); 
					}

					}
					break;
				case 6 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:207:6: ( ( '0' )* '5' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:207:6: ( ( '0' )* '5' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:207:7: ( '0' )* '5'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:207:7: ( '0' )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0=='0') ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:207:7: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop13;
						}
					}

					match('5'); 
					}

					}
					break;
				case 7 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:208:6: ( ( '0' )* '6' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:208:6: ( ( '0' )* '6' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:208:7: ( '0' )* '6'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:208:7: ( '0' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0=='0') ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:208:7: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop14;
						}
					}

					match('6'); 
					}

					}
					break;
				case 8 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:209:6: ( ( '0' )* '7' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:209:6: ( ( '0' )* '7' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:209:7: ( '0' )* '7'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:209:7: ( '0' )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0=='0') ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:209:7: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop15;
						}
					}

					match('7'); 
					}

					}
					break;
				case 9 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:210:6: ( ( '0' )* '8' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:210:6: ( ( '0' )* '8' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:210:7: ( '0' )* '8'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:210:7: ( '0' )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='0') ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:210:7: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop16;
						}
					}

					match('8'); 
					}

					}
					break;
				case 10 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:211:6: ( ( '0' )* '9' )
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:211:6: ( ( '0' )* '9' )
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:211:7: ( '0' )* '9'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:211:7: ( '0' )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0=='0') ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:211:7: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop17;
						}
					}

					match('9'); 
					}

					}
					break;
				case 11 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:212:6: ( '0' )* '1' DIGIT
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:212:6: ( '0' )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0=='0') ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:212:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop18;
						}
					}

					match('1'); 
					mDIGIT(); 

					}
					break;
				case 12 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:213:9: ( '0' )* '2' DIGIT
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:213:9: ( '0' )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0=='0') ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:213:9: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop19;
						}
					}

					match('2'); 
					mDIGIT(); 

					}
					break;
				case 13 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:214:9: ( '0' )* '3' DIGIT
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:214:9: ( '0' )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0=='0') ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:214:9: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop20;
						}
					}

					match('3'); 
					mDIGIT(); 

					}
					break;
				case 14 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:215:9: ( '0' )+ '40'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:215:9: ( '0' )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0=='0') ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:215:9: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					match("40"); 

					}
					break;
				case 15 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:216:6: ( '0' )+ '41'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:216:6: ( '0' )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0=='0') ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:216:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					match("41"); 

					}
					break;
				case 16 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:217:6: ( '0' )+ '42'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:217:6: ( '0' )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0=='0') ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:217:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					match("42"); 

					}
					break;
				case 17 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:6: ( '0' )* '43'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:6: ( '0' )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0=='0') ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop24;
						}
					}

					match("43"); 

					}
					break;
				case 18 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:219:6: ( '0' )* '44'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:219:6: ( '0' )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0=='0') ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:219:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop25;
						}
					}

					match("44"); 

					}
					break;
				case 19 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:220:6: ( '0' )* '45'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:220:6: ( '0' )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0=='0') ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:220:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop26;
						}
					}

					match("45"); 

					}
					break;
				case 20 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:221:6: ( '0' )* '46'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:221:6: ( '0' )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0=='0') ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:221:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop27;
						}
					}

					match("46"); 

					}
					break;
				case 21 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:222:6: ( '0' )* '47'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:222:6: ( '0' )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0=='0') ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:222:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop28;
						}
					}

					match("47"); 

					}
					break;
				case 22 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:223:6: ( '0' )* '48'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:223:6: ( '0' )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0=='0') ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:223:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop29;
						}
					}

					match("48"); 

					}
					break;
				case 23 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:224:6: ( '0' )* '49'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:224:6: ( '0' )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0=='0') ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:224:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop30;
						}
					}

					match("49"); 

					}
					break;
				case 24 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:225:6: ( '0' )* '5' DIGIT
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:225:6: ( '0' )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0=='0') ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:225:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop31;
						}
					}

					match('5'); 
					mDIGIT(); 

					}
					break;
				case 25 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:226:6: ( '0' )* '6' DIGIT
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:226:6: ( '0' )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0=='0') ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:226:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop32;
						}
					}

					match('6'); 
					mDIGIT(); 

					}
					break;
				case 26 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:227:6: ( '0' )* '7' DIGIT
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:227:6: ( '0' )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0=='0') ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:227:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop33;
						}
					}

					match('7'); 
					mDIGIT(); 

					}
					break;
				case 27 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:228:6: ( '0' )* '8' DIGIT
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:228:6: ( '0' )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0=='0') ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:228:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop34;
						}
					}

					match('8'); 
					mDIGIT(); 

					}
					break;
				case 28 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:229:6: ( '0' )+ '90'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:229:6: ( '0' )+
					int cnt35=0;
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0=='0') ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:229:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt35 >= 1 ) break loop35;
							EarlyExitException eee = new EarlyExitException(35, input);
							throw eee;
						}
						cnt35++;
					}

					match("90"); 

					}
					break;
				case 29 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:230:6: ( '0' )+ '91'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:230:6: ( '0' )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0=='0') ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:230:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					match("91"); 

					}
					break;
				case 30 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:231:6: ( '0' )* '92'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:231:6: ( '0' )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0=='0') ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:231:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop37;
						}
					}

					match("92"); 

					}
					break;
				case 31 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:232:6: ( '0' )* '93'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:232:6: ( '0' )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0=='0') ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:232:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop38;
						}
					}

					match("93"); 

					}
					break;
				case 32 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:233:6: ( '0' )+ '94'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:233:6: ( '0' )+
					int cnt39=0;
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0=='0') ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:233:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					match("94"); 

					}
					break;
				case 33 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:234:6: ( '0' )+ '95'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:234:6: ( '0' )+
					int cnt40=0;
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0=='0') ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:234:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt40 >= 1 ) break loop40;
							EarlyExitException eee = new EarlyExitException(40, input);
							throw eee;
						}
						cnt40++;
					}

					match("95"); 

					}
					break;
				case 34 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:235:6: ( '0' )+ '96'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:235:6: ( '0' )+
					int cnt41=0;
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0=='0') ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:235:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt41 >= 1 ) break loop41;
							EarlyExitException eee = new EarlyExitException(41, input);
							throw eee;
						}
						cnt41++;
					}

					match("96"); 

					}
					break;
				case 35 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:236:6: ( '0' )+ '97'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:236:6: ( '0' )+
					int cnt42=0;
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0=='0') ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:236:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							if ( cnt42 >= 1 ) break loop42;
							EarlyExitException eee = new EarlyExitException(42, input);
							throw eee;
						}
						cnt42++;
					}

					match("97"); 

					}
					break;
				case 36 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:237:6: ( '0' )* '98'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:237:6: ( '0' )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0=='0') ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:237:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop43;
						}
					}

					match("98"); 

					}
					break;
				case 37 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:238:6: ( '0' )* '99'
					{
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:238:6: ( '0' )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0=='0') ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:238:6: '0'
							{
							match('0'); 
							}
							break;

						default :
							break loop44;
						}
					}

					match("99"); 

					}
					break;
				case 38 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:239:6: D0GIT DIGIT ( DIGIT )+
					{
					mD0GIT(); 

					mDIGIT(); 

					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:239:18: ( DIGIT )+
					int cnt45=0;
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( ((LA45_0 >= '0' && LA45_0 <= '9')) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt45 >= 1 ) break loop45;
							EarlyExitException eee = new EarlyExitException(45, input);
							throw eee;
						}
						cnt45++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHERG"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			int _type = X;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:245:3: ( ( 'x' | 'X' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:245:5: ( 'x' | 'X' ) FLOAT
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			int _type = Y;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:246:3: ( ( 'y' | 'Y' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:246:5: ( 'y' | 'Y' ) FLOAT
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			int _type = Z;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:247:3: ( ( 'z' | 'Z' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:247:5: ( 'z' | 'Z' ) FLOAT
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			int _type = I;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:248:3: ( ( 'i' | 'I' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:248:5: ( 'i' | 'I' ) FLOAT
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			int _type = J;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:249:3: ( ( 'j' | 'J' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:249:5: ( 'j' | 'J' ) FLOAT
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			int _type = K;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:250:3: ( ( 'k' | 'K' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:250:5: ( 'k' | 'K' ) FLOAT
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			int _type = M;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:253:3: ( ( 'm' | 'M' ) DIGIT ( DIGIT )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:253:5: ( 'm' | 'M' ) DIGIT ( DIGIT )?
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mDIGIT(); 

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:253:21: ( DIGIT )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( ((LA47_0 >= '0' && LA47_0 <= '9')) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			int _type = S;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:254:3: ( ( 's' | 'S' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:254:5: ( 's' | 'S' ) FLOAT
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			int _type = E;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:255:3: ( ( 'e' | 'E' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:255:5: ( 'e' | 'E' ) FLOAT
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			int _type = F;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:256:3: ( ( 'f' | 'F' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:256:5: ( 'f' | 'F' ) FLOAT
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mFLOAT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			int _type = T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:257:3: ( ( 't' | 'T' ) POS ( CONF )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:257:5: ( 't' | 'T' ) POS ( CONF )?
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mPOS(); 

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:257:19: ( CONF )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( ((LA48_0 >= '0' && LA48_0 <= '9')) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:257:19: CONF
					{
					mCONF(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "EOF"
	public final void mEOF() throws RecognitionException {
		try {
			int _type = EOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:259:5: ( '<EOF>' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:259:7: '<EOF>'
			{
			match("<EOF>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOF"

	// $ANTLR start "POS"
	public final void mPOS() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:264:5: ( DIGIT DIGIT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:264:7: DIGIT DIGIT
			{
			mDIGIT(); 

			mDIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POS"

	// $ANTLR start "CONF"
	public final void mCONF() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:267:6: ( DIGIT DIGIT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:267:8: DIGIT DIGIT
			{
			mDIGIT(); 

			mDIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONF"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:272:7: ( ( '0' .. '9' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "D0GIT"
	public final void mD0GIT() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:275:7: ( ( '1' .. '9' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D0GIT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:7: ( ( '0' | D0GIT ( ( DIGIT )+ )? ) ( '.' ( DIGIT )+ )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:9: ( '0' | D0GIT ( ( DIGIT )+ )? ) ( '.' ( DIGIT )+ )?
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:9: ( '0' | D0GIT ( ( DIGIT )+ )? )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0=='0') ) {
				alt51=1;
			}
			else if ( ((LA51_0 >= '1' && LA51_0 <= '9')) ) {
				alt51=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:11: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:17: D0GIT ( ( DIGIT )+ )?
					{
					mD0GIT(); 

					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:23: ( ( DIGIT )+ )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( ((LA50_0 >= '0' && LA50_0 <= '9')) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:24: ( DIGIT )+
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:24: ( DIGIT )+
							int cnt49=0;
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( ((LA49_0 >= '0' && LA49_0 <= '9')) ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt49 >= 1 ) break loop49;
									EarlyExitException eee = new EarlyExitException(49, input);
									throw eee;
								}
								cnt49++;
							}

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:35: ( '.' ( DIGIT )+ )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0=='.') ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:36: '.' ( DIGIT )+
					{
					match('.'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:279:40: ( DIGIT )+
					int cnt52=0;
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( ((LA52_0 >= '0' && LA52_0 <= '9')) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt52 >= 1 ) break loop52;
							EarlyExitException eee = new EarlyExitException(52, input);
							throw eee;
						}
						cnt52++;
					}

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:8: ( COMMENT | WS | EOL | G00 | G01 | G02 | G03 | G90 | G91 | G40 | G41 | G42 | G94 | G95 | G96 | G97 | OTHERG | X | Y | Z | I | J | K | M | S | E | F | T | EOF )
		int alt54=29;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt54=1;
			}
			break;
		case '\t':
		case ' ':
			{
			alt54=2;
			}
			break;
		case '\n':
		case '\r':
			{
			alt54=3;
			}
			break;
		case 'G':
		case 'g':
			{
			switch ( input.LA(2) ) {
			case '9':
				{
				switch ( input.LA(3) ) {
				case '0':
					{
					int LA54_24 = input.LA(4);
					if ( ((LA54_24 >= '0' && LA54_24 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=8;
					}

					}
					break;
				case '1':
					{
					int LA54_25 = input.LA(4);
					if ( ((LA54_25 >= '0' && LA54_25 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=9;
					}

					}
					break;
				case '4':
					{
					int LA54_26 = input.LA(4);
					if ( ((LA54_26 >= '0' && LA54_26 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=13;
					}

					}
					break;
				case '5':
					{
					int LA54_27 = input.LA(4);
					if ( ((LA54_27 >= '0' && LA54_27 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=14;
					}

					}
					break;
				case '6':
					{
					int LA54_28 = input.LA(4);
					if ( ((LA54_28 >= '0' && LA54_28 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=15;
					}

					}
					break;
				case '7':
					{
					int LA54_29 = input.LA(4);
					if ( ((LA54_29 >= '0' && LA54_29 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=16;
					}

					}
					break;
				default:
					alt54=17;
				}
				}
				break;
			case '4':
				{
				switch ( input.LA(3) ) {
				case '0':
					{
					int LA54_30 = input.LA(4);
					if ( ((LA54_30 >= '0' && LA54_30 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=10;
					}

					}
					break;
				case '1':
					{
					int LA54_31 = input.LA(4);
					if ( ((LA54_31 >= '0' && LA54_31 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=11;
					}

					}
					break;
				case '2':
					{
					int LA54_32 = input.LA(4);
					if ( ((LA54_32 >= '0' && LA54_32 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=12;
					}

					}
					break;
				default:
					alt54=17;
				}
				}
				break;
			case '0':
				{
				switch ( input.LA(3) ) {
				case '0':
					{
					int LA54_33 = input.LA(4);
					if ( ((LA54_33 >= '0' && LA54_33 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=4;
					}

					}
					break;
				case '1':
					{
					int LA54_35 = input.LA(4);
					if ( ((LA54_35 >= '0' && LA54_35 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=5;
					}

					}
					break;
				case '2':
					{
					int LA54_36 = input.LA(4);
					if ( ((LA54_36 >= '0' && LA54_36 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=6;
					}

					}
					break;
				case '3':
					{
					int LA54_37 = input.LA(4);
					if ( ((LA54_37 >= '0' && LA54_37 <= '9')) ) {
						alt54=17;
					}

					else {
						alt54=7;
					}

					}
					break;
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt54=17;
					}
					break;
				default:
					alt54=4;
				}
				}
				break;
			case '1':
				{
				int LA54_20 = input.LA(3);
				if ( ((LA54_20 >= '0' && LA54_20 <= '9')) ) {
					alt54=17;
				}

				else {
					alt54=5;
				}

				}
				break;
			case '2':
				{
				int LA54_21 = input.LA(3);
				if ( ((LA54_21 >= '0' && LA54_21 <= '9')) ) {
					alt54=17;
				}

				else {
					alt54=6;
				}

				}
				break;
			case '3':
				{
				int LA54_22 = input.LA(3);
				if ( ((LA54_22 >= '0' && LA54_22 <= '9')) ) {
					alt54=17;
				}

				else {
					alt54=7;
				}

				}
				break;
			case '5':
			case '6':
			case '7':
			case '8':
				{
				alt54=17;
				}
				break;
			default:
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 54, 4, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
			}
			break;
		case 'X':
		case 'x':
			{
			alt54=18;
			}
			break;
		case 'Y':
		case 'y':
			{
			alt54=19;
			}
			break;
		case 'Z':
		case 'z':
			{
			alt54=20;
			}
			break;
		case 'I':
		case 'i':
			{
			alt54=21;
			}
			break;
		case 'J':
		case 'j':
			{
			alt54=22;
			}
			break;
		case 'K':
		case 'k':
			{
			alt54=23;
			}
			break;
		case 'M':
		case 'm':
			{
			alt54=24;
			}
			break;
		case 'S':
		case 's':
			{
			alt54=25;
			}
			break;
		case 'E':
		case 'e':
			{
			alt54=26;
			}
			break;
		case 'F':
		case 'f':
			{
			alt54=27;
			}
			break;
		case 'T':
		case 't':
			{
			alt54=28;
			}
			break;
		case '<':
			{
			alt54=29;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 54, 0, input);
			throw nvae;
		}
		switch (alt54) {
			case 1 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:10: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 2 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:18: WS
				{
				mWS(); 

				}
				break;
			case 3 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:21: EOL
				{
				mEOL(); 

				}
				break;
			case 4 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:25: G00
				{
				mG00(); 

				}
				break;
			case 5 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:29: G01
				{
				mG01(); 

				}
				break;
			case 6 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:33: G02
				{
				mG02(); 

				}
				break;
			case 7 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:37: G03
				{
				mG03(); 

				}
				break;
			case 8 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:41: G90
				{
				mG90(); 

				}
				break;
			case 9 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:45: G91
				{
				mG91(); 

				}
				break;
			case 10 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:49: G40
				{
				mG40(); 

				}
				break;
			case 11 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:53: G41
				{
				mG41(); 

				}
				break;
			case 12 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:57: G42
				{
				mG42(); 

				}
				break;
			case 13 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:61: G94
				{
				mG94(); 

				}
				break;
			case 14 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:65: G95
				{
				mG95(); 

				}
				break;
			case 15 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:69: G96
				{
				mG96(); 

				}
				break;
			case 16 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:73: G97
				{
				mG97(); 

				}
				break;
			case 17 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:77: OTHERG
				{
				mOTHERG(); 

				}
				break;
			case 18 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:84: X
				{
				mX(); 

				}
				break;
			case 19 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:86: Y
				{
				mY(); 

				}
				break;
			case 20 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:88: Z
				{
				mZ(); 

				}
				break;
			case 21 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:90: I
				{
				mI(); 

				}
				break;
			case 22 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:92: J
				{
				mJ(); 

				}
				break;
			case 23 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:94: K
				{
				mK(); 

				}
				break;
			case 24 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:96: M
				{
				mM(); 

				}
				break;
			case 25 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:98: S
				{
				mS(); 

				}
				break;
			case 26 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:100: E
				{
				mE(); 

				}
				break;
			case 27 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:102: F
				{
				mF(); 

				}
				break;
			case 28 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:104: T
				{
				mT(); 

				}
				break;
			case 29 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:106: EOF
				{
				match(EOF); 

				}
				break;

		}
	}


	protected DFA46 dfa46 = new DFA46(this);
	static final String DFA46_eotS =
		"\2\uffff\1\34\1\36\1\40\1\42\1\44\1\52\4\uffff\1\34\1\36\1\40\1\42\1\44"+
		"\1\52\3\uffff\1\65\1\66\1\67\1\70\1\71\1\72\1\73\3\uffff\1\74\1\uffff"+
		"\1\75\1\uffff\1\76\1\uffff\1\77\1\102\1\103\1\110\1\111\1\uffff\1\22\1"+
		"\23\1\24\1\112\1\113\1\114\1\115\34\uffff";
	static final String DFA46_eofS =
		"\116\uffff";
	static final String DFA46_minS =
		"\22\60\3\uffff\7\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\5\60"+
		"\1\uffff\7\60\34\uffff";
	static final String DFA46_maxS =
		"\22\71\3\uffff\7\71\3\uffff\1\71\1\uffff\1\71\1\uffff\1\71\1\uffff\5\71"+
		"\1\uffff\7\71\34\uffff";
	static final String DFA46_acceptS =
		"\22\uffff\1\13\1\14\1\15\7\uffff\1\5\1\46\1\6\1\uffff\1\7\1\uffff\1\10"+
		"\1\uffff\1\11\5\uffff\1\12\7\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
		"\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
		"\1\43\1\44\1\45\1\1\1\2\1\3\1\4";
	static final String DFA46_specialS =
		"\116\uffff}>";
	static final String[] DFA46_transitionS = {
			"\1\1\1\10\1\11\1\12\1\2\1\3\1\4\1\5\1\6\1\7",
			"\1\13\1\22\1\23\1\24\1\14\1\15\1\16\1\17\1\20\1\21",
			"\3\35\1\25\1\26\1\27\1\30\1\31\1\32\1\33",
			"\12\37",
			"\12\41",
			"\12\43",
			"\12\45",
			"\2\35\1\46\1\47\4\35\1\50\1\51",
			"\12\53",
			"\12\54",
			"\12\55",
			"\1\56\1\57\1\60\1\61\1\14\1\15\1\16\1\17\1\20\1\21",
			"\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73",
			"\12\74",
			"\12\75",
			"\12\76",
			"\12\77",
			"\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111",
			"",
			"",
			"",
			"\12\35",
			"\12\35",
			"\12\35",
			"\12\35",
			"\12\35",
			"\12\35",
			"\12\35",
			"",
			"",
			"",
			"\12\35",
			"",
			"\12\35",
			"",
			"\12\35",
			"",
			"\12\35",
			"\12\35",
			"\12\35",
			"\12\35",
			"\12\35",
			"",
			"\12\35",
			"\12\35",
			"\12\35",
			"\1\56\1\57\1\60\1\61\1\14\1\15\1\16\1\17\1\20\1\21",
			"\12\22",
			"\12\23",
			"\12\24",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
	static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
	static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
	static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
	static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
	static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
	static final short[][] DFA46_transition;

	static {
		int numStates = DFA46_transitionS.length;
		DFA46_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
		}
	}

	protected class DFA46 extends DFA {

		public DFA46(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 46;
			this.eot = DFA46_eot;
			this.eof = DFA46_eof;
			this.min = DFA46_min;
			this.max = DFA46_max;
			this.accept = DFA46_accept;
			this.special = DFA46_special;
			this.transition = DFA46_transition;
		}
		@Override
		public String getDescription() {
			return "201:22: ( ( '0' ( '0' )+ '0' ) | ( '0' ( '0' )+ '1' ) | ( '0' ( '0' )+ '2' ) | ( '0' ( '0' )+ '3' ) | ( ( '0' )* '4' ) | ( ( '0' )* '5' ) | ( ( '0' )* '6' ) | ( ( '0' )* '7' ) | ( ( '0' )* '8' ) | ( ( '0' )* '9' ) | ( '0' )* '1' DIGIT | ( '0' )* '2' DIGIT | ( '0' )* '3' DIGIT | ( '0' )+ '40' | ( '0' )+ '41' | ( '0' )+ '42' | ( '0' )* '43' | ( '0' )* '44' | ( '0' )* '45' | ( '0' )* '46' | ( '0' )* '47' | ( '0' )* '48' | ( '0' )* '49' | ( '0' )* '5' DIGIT | ( '0' )* '6' DIGIT | ( '0' )* '7' DIGIT | ( '0' )* '8' DIGIT | ( '0' )+ '90' | ( '0' )+ '91' | ( '0' )* '92' | ( '0' )* '93' | ( '0' )+ '94' | ( '0' )+ '95' | ( '0' )+ '96' | ( '0' )+ '97' | ( '0' )* '98' | ( '0' )* '99' | D0GIT DIGIT ( DIGIT )+ )";
		}
	}

}
