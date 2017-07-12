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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ARTICLE=9, 
		STRING=10, ID=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ARTICLE", 
		"STRING", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'on'", "'in'", "'under'", "'next to'", "'in front of'", "'behind'", 
		"'with'", "'into'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ARTICLE", "STRING", 
		"ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3\13\6\13V\n\13\r\13\16\13W\3"+
		"\f\6\f[\n\f\r\f\16\f\\\3\r\6\r`\n\r\r\r\16\ra\3\r\3\r\2\2\16\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\4\2C\\c|\3\2c|\5"+
		"\2\13\f\17\17\"\"\2i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7!\3\2\2\2"+
		"\t\'\3\2\2\2\13/\3\2\2\2\r;\3\2\2\2\17B\3\2\2\2\21G\3\2\2\2\23R\3\2\2"+
		"\2\25U\3\2\2\2\27Z\3\2\2\2\31_\3\2\2\2\33\34\7q\2\2\34\35\7p\2\2\35\4"+
		"\3\2\2\2\36\37\7k\2\2\37 \7p\2\2 \6\3\2\2\2!\"\7w\2\2\"#\7p\2\2#$\7f\2"+
		"\2$%\7g\2\2%&\7t\2\2&\b\3\2\2\2\'(\7p\2\2()\7g\2\2)*\7z\2\2*+\7v\2\2+"+
		",\7\"\2\2,-\7v\2\2-.\7q\2\2.\n\3\2\2\2/\60\7k\2\2\60\61\7p\2\2\61\62\7"+
		"\"\2\2\62\63\7h\2\2\63\64\7t\2\2\64\65\7q\2\2\65\66\7p\2\2\66\67\7v\2"+
		"\2\678\7\"\2\289\7q\2\29:\7h\2\2:\f\3\2\2\2;<\7d\2\2<=\7g\2\2=>\7j\2\2"+
		">?\7k\2\2?@\7p\2\2@A\7f\2\2A\16\3\2\2\2BC\7y\2\2CD\7k\2\2DE\7v\2\2EF\7"+
		"j\2\2F\20\3\2\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2JK\7q\2\2K\22\3\2\2\2LM\7"+
		"v\2\2MN\7j\2\2NS\7g\2\2OP\7c\2\2PS\7p\2\2QS\7c\2\2RL\3\2\2\2RO\3\2\2\2"+
		"RQ\3\2\2\2S\24\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2X\26\3\2\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\30"+
		"\3\2\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2c"+
		"d\b\r\2\2d\32\3\2\2\2\7\2RW\\a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}