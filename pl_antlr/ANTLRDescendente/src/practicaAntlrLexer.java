// Generated from .\practicaAntlr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class practicaAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Cmp=12, Eventos=13, ID=14, COD=15, ALM=16, WS=17, COMMENT=18, 
		NUM=19, LINE_COMMENT=20, Llaves_ab=21, Llaves_ce=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "Cmp", "Eventos", "ID", "COD", "ALM", "WS", "COMMENT", 
		"NUM", "LINE_COMMENT", "Llaves_ab", "Llaves_ce"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'moore'", "'estados'", "','", "';'", "'estado_in'", "'alf_in'", 
		"'alf_out'", "'transicion'", "'('", "')'", "'comportamiento'", null, null, 
		null, null, "'#'", null, null, null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Cmp", "Eventos", "ID", "COD", "ALM", "WS", "COMMENT", "NUM", "LINE_COMMENT", 
		"Llaves_ab", "Llaves_ce"
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


	public practicaAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "practicaAntlr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\6\r{\n\r\r\r\16\r|\3\16\3\16\6\16\u0081\n\16\r\16\16\16\u0082"+
		"\3\17\6\17\u0086\n\17\r\17\16\17\u0087\3\20\3\20\7\20\u008c\n\20\f\20"+
		"\16\20\u008f\13\20\3\20\3\20\3\21\3\21\3\22\6\22\u0096\n\22\r\22\16\22"+
		"\u0097\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00a0\n\23\f\23\16\23\u00a3"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\6\24\u00ac\n\24\r\24\16\24\u00ad"+
		"\3\25\3\25\3\25\3\25\7\25\u00b4\n\25\f\25\16\25\u00b7\13\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\4\u008d\u00a1\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30\3\2\6\3\2\62;\5\2\62;C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u00c5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2"+
		"\2\5\65\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rK\3\2\2\2\17R\3\2\2"+
		"\2\21Z\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31x\3\2\2\2\33~\3\2"+
		"\2\2\35\u0085\3\2\2\2\37\u0089\3\2\2\2!\u0092\3\2\2\2#\u0095\3\2\2\2%"+
		"\u009b\3\2\2\2\'\u00a9\3\2\2\2)\u00af\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3"+
		"\2\2\2/\60\7o\2\2\60\61\7q\2\2\61\62\7q\2\2\62\63\7t\2\2\63\64\7g\2\2"+
		"\64\4\3\2\2\2\65\66\7g\2\2\66\67\7u\2\2\678\7v\2\289\7c\2\29:\7f\2\2:"+
		";\7q\2\2;<\7u\2\2<\6\3\2\2\2=>\7.\2\2>\b\3\2\2\2?@\7=\2\2@\n\3\2\2\2A"+
		"B\7g\2\2BC\7u\2\2CD\7v\2\2DE\7c\2\2EF\7f\2\2FG\7q\2\2GH\7a\2\2HI\7k\2"+
		"\2IJ\7p\2\2J\f\3\2\2\2KL\7c\2\2LM\7n\2\2MN\7h\2\2NO\7a\2\2OP\7k\2\2PQ"+
		"\7p\2\2Q\16\3\2\2\2RS\7c\2\2ST\7n\2\2TU\7h\2\2UV\7a\2\2VW\7q\2\2WX\7w"+
		"\2\2XY\7v\2\2Y\20\3\2\2\2Z[\7v\2\2[\\\7t\2\2\\]\7c\2\2]^\7p\2\2^_\7u\2"+
		"\2_`\7k\2\2`a\7e\2\2ab\7k\2\2bc\7q\2\2cd\7p\2\2d\22\3\2\2\2ef\7*\2\2f"+
		"\24\3\2\2\2gh\7+\2\2h\26\3\2\2\2ij\7e\2\2jk\7q\2\2kl\7o\2\2lm\7r\2\2m"+
		"n\7q\2\2no\7t\2\2op\7v\2\2pq\7c\2\2qr\7o\2\2rs\7k\2\2st\7g\2\2tu\7p\2"+
		"\2uv\7v\2\2vw\7q\2\2w\30\3\2\2\2xz\7e\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\32\3\2\2\2~\u0080\7g\2\2\177\u0081\t\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\34\3\2\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\36\3\2\2\2\u0089"+
		"\u008d\5!\21\2\u008a\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\5!\21\2\u0091 \3\2\2\2\u0092\u0093\7%\2\2\u0093"+
		"\"\3\2\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\b\22\2\2\u009a$\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7,\2\2\u009d"+
		"\u00a1\3\2\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\b\23\2\2\u00a8&\3\2\2\2\u00a9\u00ab\7e\2\2\u00aa\u00ac"+
		"\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae(\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7\61\2"+
		"\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4\n\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\b\25\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7}\2\2"+
		"\u00bb,\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd.\3\2\2\2\13\2|\u0082\u0087"+
		"\u008d\u0097\u00a1\u00ad\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}