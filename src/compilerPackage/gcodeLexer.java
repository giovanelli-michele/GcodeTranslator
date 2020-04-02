// $ANTLR 3.5.1 C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g 2020-04-02 16:13:45

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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:12: ( ';' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:16: ';' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match(';'); 
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:21: (~ ( '\\n' | '\\r' ) )*
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

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:35: ( '\\r' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:154:35: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:5: ( ( ' ' | '\\t' | '\\r' ( '\\n' )? | '\\n' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:9: ( ' ' | '\\t' | '\\r' ( '\\n' )? | '\\n' )
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:9: ( ' ' | '\\t' | '\\r' ( '\\n' )? | '\\n' )
			int alt4=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt4=1;
				}
				break;
			case '\t':
				{
				alt4=2;
				}
				break;
			case '\r':
				{
				alt4=3;
				}
				break;
			case '\n':
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:11: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:17: '\\t'
					{
					match('\t'); 
					}
					break;
				case 3 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:24: '\\r' ( '\\n' )?
					{
					match('\r'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:29: ( '\\n' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='\n') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:29: '\\n'
							{
							match('\n'); 
							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:156:37: '\\n'
					{
					match('\n'); 
					}
					break;

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

	// $ANTLR start "G00"
	public final void mG00() throws RecognitionException {
		try {
			int _type = G00;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:161:5: ( ( 'g' | 'G' ) ( ( '0' )? '0' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:161:7: ( 'g' | 'G' ) ( ( '0' )? '0' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:161:17: ( ( '0' )? '0' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:161:18: ( '0' )? '0'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:161:18: ( '0' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='0') ) {
					alt5=1;
				}
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:161:18: '0'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:162:5: ( ( 'g' | 'G' ) ( ( '0' )? '1' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:162:7: ( 'g' | 'G' ) ( ( '0' )? '1' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:162:17: ( ( '0' )? '1' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:162:18: ( '0' )? '1'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:162:18: ( '0' )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:162:18: '0'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:163:5: ( ( 'g' | 'G' ) ( ( '0' )? '2' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:163:7: ( 'g' | 'G' ) ( ( '0' )? '2' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:163:17: ( ( '0' )? '2' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:163:18: ( '0' )? '2'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:163:18: ( '0' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:163:18: '0'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:164:5: ( ( 'g' | 'G' ) ( ( '0' )? '3' ) )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:164:7: ( 'g' | 'G' ) ( ( '0' )? '3' )
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:164:17: ( ( '0' )? '3' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:164:18: ( '0' )? '3'
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:164:18: ( '0' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='0') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:164:18: '0'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:165:5: ( ( 'g' | 'G' ) '90' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:165:7: ( 'g' | 'G' ) '90'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:166:5: ( ( 'g' | 'G' ) '91' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:166:7: ( 'g' | 'G' ) '91'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:169:5: ( ( 'g' | 'G' ) '40' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:169:7: ( 'g' | 'G' ) '40'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:170:5: ( ( 'g' | 'G' ) '41' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:170:7: ( 'g' | 'G' ) '41'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:171:5: ( ( 'g' | 'G' ) '42' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:171:7: ( 'g' | 'G' ) '42'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:174:5: ( ( 'g' | 'G' ) '94' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:174:7: ( 'g' | 'G' ) '94'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:175:5: ( ( 'g' | 'G' ) '95' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:175:7: ( 'g' | 'G' ) '95'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:176:5: ( ( 'g' | 'G' ) '96' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:176:7: ( 'g' | 'G' ) '96'
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:177:5: ( ( 'g' | 'G' ) '97' )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:177:7: ( 'g' | 'G' ) '97'
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

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			int _type = X;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:3: ( ( 'x' | 'X' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:184:5: ( 'x' | 'X' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:185:3: ( ( 'y' | 'Y' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:185:5: ( 'y' | 'Y' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:186:3: ( ( 'z' | 'Z' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:186:5: ( 'z' | 'Z' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:187:3: ( ( 'i' | 'I' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:187:5: ( 'i' | 'I' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:188:3: ( ( 'j' | 'J' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:188:5: ( 'j' | 'J' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:189:3: ( ( 'k' | 'K' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:189:5: ( 'k' | 'K' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:192:3: ( ( 'm' | 'M' ) DIGIT DIGIT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:192:5: ( 'm' | 'M' ) DIGIT DIGIT
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

			mDIGIT(); 

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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:193:3: ( ( 's' | 'S' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:193:5: ( 's' | 'S' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:194:3: ( ( 'e' | 'E' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:194:5: ( 'e' | 'E' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:195:3: ( ( 'f' | 'F' ) FLOAT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:195:5: ( 'f' | 'F' ) FLOAT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:196:3: ( ( 't' | 'T' ) POS ( CONF )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:196:5: ( 't' | 'T' ) POS ( CONF )?
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

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:196:19: ( CONF )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:196:19: CONF
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

	// $ANTLR start "POS"
	public final void mPOS() throws RecognitionException {
		try {
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:203:5: ( DIGIT DIGIT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:203:7: DIGIT DIGIT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:206:6: ( DIGIT DIGIT )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:206:8: DIGIT DIGIT
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:211:7: ( ( '0' .. '9' ) )
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:214:7: ( ( '1' .. '9' ) )
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
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:7: ( ( '0' | D0GIT ( ( DIGIT )+ )? ) ( '.' ( DIGIT )+ )? )
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:9: ( '0' | D0GIT ( ( DIGIT )+ )? ) ( '.' ( DIGIT )+ )?
			{
			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:9: ( '0' | D0GIT ( ( DIGIT )+ )? )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='0') ) {
				alt12=1;
			}
			else if ( ((LA12_0 >= '1' && LA12_0 <= '9')) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:11: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:17: D0GIT ( ( DIGIT )+ )?
					{
					mD0GIT(); 

					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:23: ( ( DIGIT )+ )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:24: ( DIGIT )+
							{
							// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:24: ( DIGIT )+
							int cnt10=0;
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
									alt10=1;
								}

								switch (alt10) {
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
									if ( cnt10 >= 1 ) break loop10;
									EarlyExitException eee = new EarlyExitException(10, input);
									throw eee;
								}
								cnt10++;
							}

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:35: ( '.' ( DIGIT )+ )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='.') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:36: '.' ( DIGIT )+
					{
					match('.'); 
					// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:218:40: ( DIGIT )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
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
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
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
		// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:8: ( COMMENT | WS | G00 | G01 | G02 | G03 | G90 | G91 | G40 | G41 | G42 | G94 | G95 | G96 | G97 | X | Y | Z | I | J | K | M | S | E | F | T )
		int alt15=26;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt15=1;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt15=2;
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
					alt15=7;
					}
					break;
				case '1':
					{
					alt15=8;
					}
					break;
				case '4':
					{
					alt15=12;
					}
					break;
				case '5':
					{
					alt15=13;
					}
					break;
				case '6':
					{
					alt15=14;
					}
					break;
				case '7':
					{
					alt15=15;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '4':
				{
				switch ( input.LA(3) ) {
				case '0':
					{
					alt15=9;
					}
					break;
				case '1':
					{
					alt15=10;
					}
					break;
				case '2':
					{
					alt15=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case '0':
				{
				switch ( input.LA(3) ) {
				case '1':
					{
					alt15=4;
					}
					break;
				case '2':
					{
					alt15=5;
					}
					break;
				case '3':
					{
					alt15=6;
					}
					break;
				default:
					alt15=3;
				}
				}
				break;
			case '1':
				{
				alt15=4;
				}
				break;
			case '2':
				{
				alt15=5;
				}
				break;
			case '3':
				{
				alt15=6;
				}
				break;
			default:
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 15, 3, input);
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
			alt15=16;
			}
			break;
		case 'Y':
		case 'y':
			{
			alt15=17;
			}
			break;
		case 'Z':
		case 'z':
			{
			alt15=18;
			}
			break;
		case 'I':
		case 'i':
			{
			alt15=19;
			}
			break;
		case 'J':
		case 'j':
			{
			alt15=20;
			}
			break;
		case 'K':
		case 'k':
			{
			alt15=21;
			}
			break;
		case 'M':
		case 'm':
			{
			alt15=22;
			}
			break;
		case 'S':
		case 's':
			{
			alt15=23;
			}
			break;
		case 'E':
		case 'e':
			{
			alt15=24;
			}
			break;
		case 'F':
		case 'f':
			{
			alt15=25;
			}
			break;
		case 'T':
		case 't':
			{
			alt15=26;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 15, 0, input);
			throw nvae;
		}
		switch (alt15) {
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
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:21: G00
				{
				mG00(); 

				}
				break;
			case 4 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:25: G01
				{
				mG01(); 

				}
				break;
			case 5 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:29: G02
				{
				mG02(); 

				}
				break;
			case 6 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:33: G03
				{
				mG03(); 

				}
				break;
			case 7 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:37: G90
				{
				mG90(); 

				}
				break;
			case 8 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:41: G91
				{
				mG91(); 

				}
				break;
			case 9 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:45: G40
				{
				mG40(); 

				}
				break;
			case 10 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:49: G41
				{
				mG41(); 

				}
				break;
			case 11 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:53: G42
				{
				mG42(); 

				}
				break;
			case 12 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:57: G94
				{
				mG94(); 

				}
				break;
			case 13 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:61: G95
				{
				mG95(); 

				}
				break;
			case 14 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:65: G96
				{
				mG96(); 

				}
				break;
			case 15 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:69: G97
				{
				mG97(); 

				}
				break;
			case 16 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:73: X
				{
				mX(); 

				}
				break;
			case 17 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:75: Y
				{
				mY(); 

				}
				break;
			case 18 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:77: Z
				{
				mZ(); 

				}
				break;
			case 19 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:79: I
				{
				mI(); 

				}
				break;
			case 20 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:81: J
				{
				mJ(); 

				}
				break;
			case 21 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:83: K
				{
				mK(); 

				}
				break;
			case 22 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:85: M
				{
				mM(); 

				}
				break;
			case 23 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:87: S
				{
				mS(); 

				}
				break;
			case 24 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:89: E
				{
				mE(); 

				}
				break;
			case 25 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:91: F
				{
				mF(); 

				}
				break;
			case 26 :
				// C:\\Users\\mikyg\\Google Drive\\Progetto Linguaggi\\Code\\ANTWorks\\gcode.g:1:93: T
				{
				mT(); 

				}
				break;

		}
	}



}
