// Generated from AREML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AREMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ARTICLE=9, 
		STRING=10, ID=11, WS=12;
	public static final int
		RULE_r = 0, RULE_connectionType = 1, RULE_person = 2, RULE_action = 3, 
		RULE_object = 4, RULE_lastLocation = 5;
	public static final String[] ruleNames = {
		"r", "connectionType", "person", "action", "object", "lastLocation"
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

	@Override
	public String getGrammarFileName() { return "AREML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AREMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
		}
		public List<TerminalNode> ARTICLE() { return getTokens(AREMLParser.ARTICLE); }
		public TerminalNode ARTICLE(int i) {
			return getToken(AREMLParser.ARTICLE, i);
		}
		public ConnectionTypeContext connectionType() {
			return getRuleContext(ConnectionTypeContext.class,0);
		}
		public LastLocationContext lastLocation() {
			return getRuleContext(LastLocationContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(12);
					person();
					}
					break;
				}
				setState(15);
				action();
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(16);
					match(ARTICLE);
					}
				}

				setState(19);
				object();
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
					{
					setState(20);
					connectionType();
					}
				}

				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(23);
					match(ARTICLE);
					}
				}

				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(26);
					lastLocation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				action();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
					{
					setState(30);
					connectionType();
					}
				}

				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(33);
					match(ARTICLE);
					}
				}

				setState(36);
				object();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(38);
					person();
					}
					break;
				}
				setState(41);
				action();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectionTypeContext extends ParserRuleContext {
		public ConnectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterConnectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitConnectionType(this);
		}
	}

	public final ConnectionTypeContext connectionType() throws RecognitionException {
		ConnectionTypeContext _localctx = new ConnectionTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_connectionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_person);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AREMLParser.STRING, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastLocationContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(AREMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AREMLParser.STRING, i);
		}
		public LastLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).enterLastLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AREMLListener ) ((AREMLListener)listener).exitLastLocation(this);
		}
	}

	public final LastLocationContext lastLocation() throws RecognitionException {
		LastLocationContext _localctx = new LastLocationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lastLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				match(STRING);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\5\2\20\n\2\3\2\3\2\5\2\24\n\2\3"+
		"\2\3\2\5\2\30\n\2\3\2\5\2\33\n\2\3\2\5\2\36\n\2\3\2\3\2\5\2\"\n\2\3\2"+
		"\5\2%\n\2\3\2\3\2\3\2\5\2*\n\2\3\2\5\2-\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\6\78\n\7\r\7\16\79\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\3\n\2@\2,"+
		"\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\67\3\2\2"+
		"\2\16\20\5\6\4\2\17\16\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\23\5\b\5"+
		"\2\22\24\7\13\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\27\5\n"+
		"\6\2\26\30\5\4\3\2\27\26\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\33\7\13"+
		"\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\36\5\f\7\2\35\34\3\2"+
		"\2\2\35\36\3\2\2\2\36-\3\2\2\2\37!\5\b\5\2 \"\5\4\3\2! \3\2\2\2!\"\3\2"+
		"\2\2\"$\3\2\2\2#%\7\13\2\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\5\n\6\2\'"+
		"-\3\2\2\2(*\5\6\4\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+-\5\b\5\2,\17\3\2\2"+
		"\2,\37\3\2\2\2,)\3\2\2\2-\3\3\2\2\2./\t\2\2\2/\5\3\2\2\2\60\61\7\f\2\2"+
		"\61\7\3\2\2\2\62\63\7\f\2\2\63\t\3\2\2\2\64\65\7\f\2\2\65\13\3\2\2\2\66"+
		"8\7\f\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\r\3\2\2\2\f\17"+
		"\23\27\32\35!$),9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}