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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ARTICLE=15, STRING=16, 
		WS=17;
	public static final int
		RULE_r = 0, RULE_connectionType = 1, RULE_person = 2, RULE_action = 3, 
		RULE_object = 4, RULE_lastLocation = 5;
	public static final String[] ruleNames = {
		"r", "connectionType", "person", "action", "object", "lastLocation"
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
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<ConnectionTypeContext> connectionType() {
			return getRuleContexts(ConnectionTypeContext.class);
		}
		public ConnectionTypeContext connectionType(int i) {
			return getRuleContext(ConnectionTypeContext.class,i);
		}
		public List<TerminalNode> ARTICLE() { return getTokens(AREMLParser.ARTICLE); }
		public TerminalNode ARTICLE(int i) {
			return getToken(AREMLParser.ARTICLE, i);
		}
		public LastLocationContext lastLocation() {
			return getRuleContext(LastLocationContext.class,0);
		}
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
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
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				action();
				setState(14);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(13);
					object();
					}
					break;
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(16);
					connectionType();
					}
				}

				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(19);
					match(ARTICLE);
					}
				}

				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22);
					object();
					}
					}
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				object();
				setState(29);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(28);
					object();
					}
					break;
				}
				setState(31);
				action();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(32);
					connectionType();
					}
				}

				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(35);
					match(ARTICLE);
					}
				}

				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(38);
					object();
					}
					break;
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(41);
					lastLocation();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(44);
					person();
					}
					break;
				}
				setState(47);
				action();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(48);
					match(ARTICLE);
					}
				}

				setState(52); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(51);
						object();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(54); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(56);
					connectionType();
					}
				}

				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(59);
					match(ARTICLE);
					}
				}

				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(62);
					lastLocation();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(65);
					person();
					}
					break;
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(68);
						object();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(73);
				action();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(74);
					connectionType();
					}
				}

				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(77);
					match(ARTICLE);
					}
				}

				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(80);
					lastLocation();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				action();
				setState(84);
				connectionType();
				setState(85);
				action();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(87);
					person();
					}
					break;
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(90);
						action();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(93); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(95);
					match(ARTICLE);
					}
				}

				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(98);
					object();
					}
				}

				setState(101);
				connectionType();
				setState(102);
				match(ARTICLE);
				setState(103);
				lastLocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(105);
					person();
					}
					break;
				}
				setState(109); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(108);
						action();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(111); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(113);
					match(ARTICLE);
					}
					break;
				}
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(116);
					object();
					}
					break;
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(119);
					connectionType();
					}
				}

				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(122);
					match(ARTICLE);
					}
				}

				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						object();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(130);
					connectionType();
					}
				}

				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(133);
					match(ARTICLE);
					}
				}

				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(136);
					lastLocation();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(140); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(139);
						action();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(144);
					connectionType();
					}
				}

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARTICLE) {
					{
					setState(147);
					match(ARTICLE);
					}
				}

				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(150);
					object();
					}
				}

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
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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
			setState(157);
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
		public List<TerminalNode> STRING() { return getTokens(AREMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AREMLParser.STRING, i);
		}
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(STRING);
				setState(161);
				match(T__13);
				setState(162);
				match(STRING);
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
			setState(165);
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
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(STRING);
				}
				}
				setState(170); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00af\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\2\5\2\24"+
		"\n\2\3\2\5\2\27\n\2\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\5\2 \n\2\3\2\3"+
		"\2\5\2$\n\2\3\2\5\2\'\n\2\3\2\5\2*\n\2\3\2\5\2-\n\2\3\2\5\2\60\n\2\3\2"+
		"\3\2\5\2\64\n\2\3\2\6\2\67\n\2\r\2\16\28\3\2\5\2<\n\2\3\2\5\2?\n\2\3\2"+
		"\5\2B\n\2\3\2\5\2E\n\2\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\5\2N\n\2\3\2\5\2"+
		"Q\n\2\3\2\5\2T\n\2\3\2\3\2\3\2\3\2\3\2\5\2[\n\2\3\2\6\2^\n\2\r\2\16\2"+
		"_\3\2\5\2c\n\2\3\2\5\2f\n\2\3\2\3\2\3\2\3\2\3\2\5\2m\n\2\3\2\6\2p\n\2"+
		"\r\2\16\2q\3\2\5\2u\n\2\3\2\5\2x\n\2\3\2\5\2{\n\2\3\2\5\2~\n\2\3\2\6\2"+
		"\u0081\n\2\r\2\16\2\u0082\3\2\5\2\u0086\n\2\3\2\5\2\u0089\n\2\3\2\5\2"+
		"\u008c\n\2\3\2\6\2\u008f\n\2\r\2\16\2\u0090\3\2\5\2\u0094\n\2\3\2\5\2"+
		"\u0097\n\2\3\2\5\2\u009a\n\2\5\2\u009c\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5\u00a6\n\5\3\6\3\6\3\7\6\7\u00ab\n\7\r\7\16\7\u00ac\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\3\3\2\3\17\2\u00d7\2\u009b\3\2\2\2\4\u009d\3\2\2\2\6\u009f"+
		"\3\2\2\2\b\u00a5\3\2\2\2\n\u00a7\3\2\2\2\f\u00aa\3\2\2\2\16\20\5\b\5\2"+
		"\17\21\5\n\6\2\20\17\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\24\5\4\3\2"+
		"\23\22\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\27\7\21\2\2\26\25\3\2\2"+
		"\2\26\27\3\2\2\2\27\31\3\2\2\2\30\32\5\n\6\2\31\30\3\2\2\2\32\33\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34\u009c\3\2\2\2\35\37\5\n\6\2\36 \5\n"+
		"\6\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\5\b\5\2\"$\5\4\3\2#\"\3\2\2"+
		"\2#$\3\2\2\2$&\3\2\2\2%\'\7\21\2\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(*\5"+
		"\n\6\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\f\7\2,+\3\2\2\2,-\3\2\2\2-\u009c"+
		"\3\2\2\2.\60\5\6\4\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\63\5\b\5\2"+
		"\62\64\7\21\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\n\6"+
		"\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\4\3\2"+
		";:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\7\21\2\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2"+
		"\2@B\5\f\7\2A@\3\2\2\2AB\3\2\2\2B\u009c\3\2\2\2CE\5\6\4\2DC\3\2\2\2DE"+
		"\3\2\2\2EG\3\2\2\2FH\5\n\6\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J"+
		"K\3\2\2\2KM\5\b\5\2LN\5\4\3\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\7\21\2\2"+
		"PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\5\f\7\2SR\3\2\2\2ST\3\2\2\2T\u009c\3"+
		"\2\2\2UV\5\b\5\2VW\5\4\3\2WX\5\b\5\2X\u009c\3\2\2\2Y[\5\6\4\2ZY\3\2\2"+
		"\2Z[\3\2\2\2[]\3\2\2\2\\^\5\b\5\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`b\3\2\2\2ac\7\21\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\n\6\2ed\3"+
		"\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5\4\3\2hi\7\21\2\2ij\5\f\7\2j\u009c\3\2\2"+
		"\2km\5\6\4\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\b\5\2on\3\2\2\2pq\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\7\21\2\2ts\3\2\2\2tu\3\2\2\2uw\3\2"+
		"\2\2vx\5\n\6\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\5\4\3\2zy\3\2\2\2z{\3\2"+
		"\2\2{}\3\2\2\2|~\7\21\2\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081"+
		"\5\n\6\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\7\21\2\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u008c\5\f"+
		"\7\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u009c\3\2\2\2\u008d"+
		"\u008f\5\b\5\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\5\4\3\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\7\21"+
		"\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u009a\5\n\6\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\16\3\2\2\2\u009b\35\3\2\2\2\u009b/\3\2\2\2\u009bD\3\2\2\2\u009b"+
		"U\3\2\2\2\u009bZ\3\2\2\2\u009bl\3\2\2\2\u009b\u008e\3\2\2\2\u009c\3\3"+
		"\2\2\2\u009d\u009e\t\2\2\2\u009e\5\3\2\2\2\u009f\u00a0\7\22\2\2\u00a0"+
		"\7\3\2\2\2\u00a1\u00a6\7\22\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\7\20"+
		"\2\2\u00a4\u00a6\7\22\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6"+
		"\t\3\2\2\2\u00a7\u00a8\7\22\2\2\u00a8\13\3\2\2\2\u00a9\u00ab\7\22\2\2"+
		"\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\r\3\2\2\2+\20\23\26\33\37#&),/\638;>ADIMPSZ_belqtwz}\u0082"+
		"\u0085\u0088\u008b\u0090\u0093\u0096\u0099\u009b\u00a5\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}