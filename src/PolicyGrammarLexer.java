// Generated from C:/Users/alberttmoura/Desktop/compilador/src\PolicyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PolicyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POLICY=1, TARGET=2, POLICY_RULE=3, CONDITION_KEY=4, CONDITION_VALUE=5, 
		ACTION=6, STRING=7, ESPACO=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POLICY", "TARGET", "POLICY_RULE", "CONDITION_KEY", "CONDITION_VALUE", 
			"ACTION", "STRING", "ESPACO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Policy Name = '", "'Target = '", "'Rule Name = '", "'Condition Key = '", 
			"'Condition Value = '", "'Action = '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POLICY", "TARGET", "POLICY_RULE", "CONDITION_KEY", "CONDITION_VALUE", 
			"ACTION", "STRING", "ESPACO"
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


	public PolicyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PolicyGrammar.g4"; }

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
		"\u0004\u0000\bq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0004\u0006g\b\u0006\u000b\u0006\f\u0006h\u0001"+
		"\u0007\u0004\u0007l\b\u0007\u000b\u0007\f\u0007m\u0001\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0002\u0004\u0000  .:AZaz\u0003"+
		"\u0000\t\n\r\r  r\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003 \u0001\u0000\u0000\u0000"+
		"\u0005*\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\tH\u0001"+
		"\u0000\u0000\u0000\u000b[\u0001\u0000\u0000\u0000\rf\u0001\u0000\u0000"+
		"\u0000\u000fk\u0001\u0000\u0000\u0000\u0011\u0012\u0005P\u0000\u0000\u0012"+
		"\u0013\u0005o\u0000\u0000\u0013\u0014\u0005l\u0000\u0000\u0014\u0015\u0005"+
		"i\u0000\u0000\u0015\u0016\u0005c\u0000\u0000\u0016\u0017\u0005y\u0000"+
		"\u0000\u0017\u0018\u0005 \u0000\u0000\u0018\u0019\u0005N\u0000\u0000\u0019"+
		"\u001a\u0005a\u0000\u0000\u001a\u001b\u0005m\u0000\u0000\u001b\u001c\u0005"+
		"e\u0000\u0000\u001c\u001d\u0005 \u0000\u0000\u001d\u001e\u0005=\u0000"+
		"\u0000\u001e\u001f\u0005 \u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000"+
		" !\u0005T\u0000\u0000!\"\u0005a\u0000\u0000\"#\u0005r\u0000\u0000#$\u0005"+
		"g\u0000\u0000$%\u0005e\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005 \u0000"+
		"\u0000\'(\u0005=\u0000\u0000()\u0005 \u0000\u0000)\u0004\u0001\u0000\u0000"+
		"\u0000*+\u0005R\u0000\u0000+,\u0005u\u0000\u0000,-\u0005l\u0000\u0000"+
		"-.\u0005e\u0000\u0000./\u0005 \u0000\u0000/0\u0005N\u0000\u000001\u0005"+
		"a\u0000\u000012\u0005m\u0000\u000023\u0005e\u0000\u000034\u0005 \u0000"+
		"\u000045\u0005=\u0000\u000056\u0005 \u0000\u00006\u0006\u0001\u0000\u0000"+
		"\u000078\u0005C\u0000\u000089\u0005o\u0000\u00009:\u0005n\u0000\u0000"+
		":;\u0005d\u0000\u0000;<\u0005i\u0000\u0000<=\u0005t\u0000\u0000=>\u0005"+
		"i\u0000\u0000>?\u0005o\u0000\u0000?@\u0005n\u0000\u0000@A\u0005 \u0000"+
		"\u0000AB\u0005K\u0000\u0000BC\u0005e\u0000\u0000CD\u0005y\u0000\u0000"+
		"DE\u0005 \u0000\u0000EF\u0005=\u0000\u0000FG\u0005 \u0000\u0000G\b\u0001"+
		"\u0000\u0000\u0000HI\u0005C\u0000\u0000IJ\u0005o\u0000\u0000JK\u0005n"+
		"\u0000\u0000KL\u0005d\u0000\u0000LM\u0005i\u0000\u0000MN\u0005t\u0000"+
		"\u0000NO\u0005i\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005n\u0000\u0000"+
		"QR\u0005 \u0000\u0000RS\u0005V\u0000\u0000ST\u0005a\u0000\u0000TU\u0005"+
		"l\u0000\u0000UV\u0005u\u0000\u0000VW\u0005e\u0000\u0000WX\u0005 \u0000"+
		"\u0000XY\u0005=\u0000\u0000YZ\u0005 \u0000\u0000Z\n\u0001\u0000\u0000"+
		"\u0000[\\\u0005A\u0000\u0000\\]\u0005c\u0000\u0000]^\u0005t\u0000\u0000"+
		"^_\u0005i\u0000\u0000_`\u0005o\u0000\u0000`a\u0005n\u0000\u0000ab\u0005"+
		" \u0000\u0000bc\u0005=\u0000\u0000cd\u0005 \u0000\u0000d\f\u0001\u0000"+
		"\u0000\u0000eg\u0007\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u000e\u0001\u0000\u0000\u0000jl\u0007\u0001\u0000\u0000kj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0006\u0007\u0000\u0000"+
		"p\u0010\u0001\u0000\u0000\u0000\u0003\u0000hm\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}