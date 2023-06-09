// Generated from C:/Users/alberttmoura/Desktop/compilador/src\PolicyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PolicyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POLICY=1, TARGET=2, POLICY_RULE=3, CONDITION_KEY=4, STRING=5, ESPACO=6, 
		CONDITION_VALUE=7;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_policy = 2, RULE_target = 3, RULE_policyRule = 4, 
		RULE_condition = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "policy", "target", "policyRule", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Policy Name = '", "'Target = '", "'Rule Name = '", "'Condition Key = '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POLICY", "TARGET", "POLICY_RULE", "CONDITION_KEY", "STRING", "ESPACO", 
			"CONDITION_VALUE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "PolicyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolicyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolicyGrammarVisitor ) return ((PolicyGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				{
				setState(12);
				exp();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public PolicyContext policy() {
			return getRuleContext(PolicyContext.class,0);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public List<PolicyRuleContext> policyRule() {
			return getRuleContexts(PolicyRuleContext.class);
		}
		public PolicyRuleContext policyRule(int i) {
			return getRuleContext(PolicyRuleContext.class,i);
		}
		public TerminalNode TARGET() { return getToken(PolicyGrammarParser.TARGET, 0); }
		public List<TerminalNode> STRING() { return getTokens(PolicyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PolicyGrammarParser.STRING, i);
		}
		public TerminalNode CONDITION_KEY() { return getToken(PolicyGrammarParser.CONDITION_KEY, 0); }
		public TerminalNode CONDITION_VALUE() { return getToken(PolicyGrammarParser.CONDITION_VALUE, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolicyGrammarVisitor ) return ((PolicyGrammarVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			int _alt;
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLICY:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				policy();
				setState(19);
				target();
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(20);
						policyRule();
						}
						} 
					}
					setState(25);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case TARGET:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(TARGET);
				setState(27);
				match(STRING);
				}
				break;
			case POLICY_RULE:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				policyRule();
				}
				break;
			case CONDITION_KEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				match(CONDITION_KEY);
				setState(30);
				match(STRING);
				setState(31);
				match(CONDITION_VALUE);
				setState(32);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PolicyContext extends ParserRuleContext {
		public TerminalNode POLICY() { return getToken(PolicyGrammarParser.POLICY, 0); }
		public TerminalNode STRING() { return getToken(PolicyGrammarParser.STRING, 0); }
		public PolicyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).enterPolicy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).exitPolicy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolicyGrammarVisitor ) return ((PolicyGrammarVisitor<? extends T>)visitor).visitPolicy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicyContext policy() throws RecognitionException {
		PolicyContext _localctx = new PolicyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_policy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(POLICY);
			setState(36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TargetContext extends ParserRuleContext {
		public TerminalNode TARGET() { return getToken(PolicyGrammarParser.TARGET, 0); }
		public TerminalNode STRING() { return getToken(PolicyGrammarParser.STRING, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolicyGrammarVisitor ) return ((PolicyGrammarVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(TARGET);
			setState(39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PolicyRuleContext extends ParserRuleContext {
		public TerminalNode POLICY_RULE() { return getToken(PolicyGrammarParser.POLICY_RULE, 0); }
		public TerminalNode STRING() { return getToken(PolicyGrammarParser.STRING, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public PolicyRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policyRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).enterPolicyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).exitPolicyRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolicyGrammarVisitor ) return ((PolicyGrammarVisitor<? extends T>)visitor).visitPolicyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicyRuleContext policyRule() throws RecognitionException {
		PolicyRuleContext _localctx = new PolicyRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_policyRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(POLICY_RULE);
			setState(42);
			match(STRING);
			setState(43);
			condition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CONDITION_KEY() { return getToken(PolicyGrammarParser.CONDITION_KEY, 0); }
		public TerminalNode STRING() { return getToken(PolicyGrammarParser.STRING, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolicyGrammarListener ) ((PolicyGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolicyGrammarVisitor ) return ((PolicyGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CONDITION_KEY);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00071\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016\b"+
		"\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n"+
		"\u0000\u0000/\u0000\u000f\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004#\u0001\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b"+
		")\u0001\u0000\u0000\u0000\n-\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002"+
		"\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0017\u0003\u0006\u0003\u0000"+
		"\u0014\u0016\u0003\b\u0004\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\"\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\"\u0005"+
		"\u0005\u0000\u0000\u001c\"\u0003\b\u0004\u0000\u001d\u001e\u0005\u0004"+
		"\u0000\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f \u0005\u0007\u0000"+
		"\u0000 \"\u0005\u0005\u0000\u0000!\u0012\u0001\u0000\u0000\u0000!\u001a"+
		"\u0001\u0000\u0000\u0000!\u001c\u0001\u0000\u0000\u0000!\u001d\u0001\u0000"+
		"\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000"+
		"$%\u0005\u0005\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0005\u0002"+
		"\u0000\u0000\'(\u0005\u0005\u0000\u0000(\u0007\u0001\u0000\u0000\u0000"+
		")*\u0005\u0003\u0000\u0000*+\u0005\u0005\u0000\u0000+,\u0003\n\u0005\u0000"+
		",\t\u0001\u0000\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0005\u0005\u0000"+
		"\u0000/\u000b\u0001\u0000\u0000\u0000\u0003\u000f\u0017!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}