// Generated from AREML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AREMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ARTICLE=15, STRING=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "ARTICLE", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'on'", "'in'", "'under'", "'next to'", "'in front of'", "'behind'", 
		"'with'", "'into'", "' in to'", "'down'", "'up'", "'to'", "'from'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ARTICLE", "STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AREMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AREML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"v\n\20\3\21\6\21y\n\21\r\21\16\21z\3\22\6\22~\n\22\r\22\16\22\177\3\22"+
		"\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0086\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3%\3\2\2\2\5(\3\2\2\2\7+\3\2\2\2\t\61\3\2\2\2\139\3\2\2\2\rE\3\2\2"+
		"\2\17L\3\2\2\2\21Q\3\2\2\2\23V\3\2\2\2\25]\3\2\2\2\27b\3\2\2\2\31e\3\2"+
		"\2\2\33h\3\2\2\2\35m\3\2\2\2\37u\3\2\2\2!x\3\2\2\2#}\3\2\2\2%&\7q\2\2"+
		"&\'\7p\2\2\'\4\3\2\2\2()\7k\2\2)*\7p\2\2*\6\3\2\2\2+,\7w\2\2,-\7p\2\2"+
		"-.\7f\2\2./\7g\2\2/\60\7t\2\2\60\b\3\2\2\2\61\62\7p\2\2\62\63\7g\2\2\63"+
		"\64\7z\2\2\64\65\7v\2\2\65\66\7\"\2\2\66\67\7v\2\2\678\7q\2\28\n\3\2\2"+
		"\29:\7k\2\2:;\7p\2\2;<\7\"\2\2<=\7h\2\2=>\7t\2\2>?\7q\2\2?@\7p\2\2@A\7"+
		"v\2\2AB\7\"\2\2BC\7q\2\2CD\7h\2\2D\f\3\2\2\2EF\7d\2\2FG\7g\2\2GH\7j\2"+
		"\2HI\7k\2\2IJ\7p\2\2JK\7f\2\2K\16\3\2\2\2LM\7y\2\2MN\7k\2\2NO\7v\2\2O"+
		"P\7j\2\2P\20\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2TU\7q\2\2U\22\3\2\2\2V"+
		"W\7\"\2\2WX\7k\2\2XY\7p\2\2YZ\7\"\2\2Z[\7v\2\2[\\\7q\2\2\\\24\3\2\2\2"+
		"]^\7f\2\2^_\7q\2\2_`\7y\2\2`a\7p\2\2a\26\3\2\2\2bc\7w\2\2cd\7r\2\2d\30"+
		"\3\2\2\2ef\7v\2\2fg\7q\2\2g\32\3\2\2\2hi\7h\2\2ij\7t\2\2jk\7q\2\2kl\7"+
		"o\2\2l\34\3\2\2\2mn\7/\2\2n\36\3\2\2\2op\7v\2\2pq\7j\2\2qv\7g\2\2rs\7"+
		"c\2\2sv\7p\2\2tv\7c\2\2uo\3\2\2\2ur\3\2\2\2ut\3\2\2\2v \3\2\2\2wy\t\2"+
		"\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\"\3\2\2\2|~\t\3\2\2}|\3"+
		"\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0082\b\22\2\2\u0082$\3\2\2\2\6\2uz\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}