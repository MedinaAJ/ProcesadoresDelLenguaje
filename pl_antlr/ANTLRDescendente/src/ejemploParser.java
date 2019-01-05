// Generated from .\ejemplo.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejemploParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Cmp=12, Eventos=13, ID=14, COD=15, ALM=16, WS=17, COMMENT=18, 
		NUM=19, LINE_COMMENT=20, Llaves_ab=21, Llaves_ce=22;
	public static final int
		RULE_programa = 0, RULE_dec_comp = 1, RULE_automata = 2, RULE_cuerpo_automata = 3, 
		RULE_estados = 4, RULE_estado_ini = 5, RULE_alf_in = 6, RULE_alf_out = 7, 
		RULE_transicion = 8, RULE_transicion_def = 9, RULE_val_trans = 10, RULE_comportamientos = 11, 
		RULE_comp_def = 12, RULE_val_comp = 13;
	public static final String[] ruleNames = {
		"programa", "dec_comp", "automata", "cuerpo_automata", "estados", "estado_ini", 
		"alf_in", "alf_out", "transicion", "transicion_def", "val_trans", "comportamientos", 
		"comp_def", "val_comp"
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

	@Override
	public String getGrammarFileName() { return "ejemplo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ejemploParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Dec_compContext dec_comp() {
			return getRuleContext(Dec_compContext.class,0);
		}
		public List<AutomataContext> automata() {
			return getRuleContexts(AutomataContext.class);
		}
		public AutomataContext automata(int i) {
			return getRuleContext(AutomataContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			dec_comp();
			setState(29);
			automata();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(30);
				automata();
				}
				}
				setState(35);
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

	public static class Dec_compContext extends ParserRuleContext {
		public List<TerminalNode> Cmp() { return getTokens(ejemploParser.Cmp); }
		public TerminalNode Cmp(int i) {
			return getToken(ejemploParser.Cmp, i);
		}
		public List<TerminalNode> COD() { return getTokens(ejemploParser.COD); }
		public TerminalNode COD(int i) {
			return getToken(ejemploParser.COD, i);
		}
		public Dec_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterDec_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitDec_comp(this);
		}
	}

	public final Dec_compContext dec_comp() throws RecognitionException {
		Dec_compContext _localctx = new Dec_compContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Cmp);
			setState(37);
			match(COD);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Cmp) {
				{
				{
				setState(38);
				match(Cmp);
				setState(39);
				match(COD);
				}
				}
				setState(44);
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

	public static class AutomataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploParser.ID, 0); }
		public Cuerpo_automataContext cuerpo_automata() {
			return getRuleContext(Cuerpo_automataContext.class,0);
		}
		public AutomataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterAutomata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitAutomata(this);
		}
	}

	public final AutomataContext automata() throws RecognitionException {
		AutomataContext _localctx = new AutomataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_automata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(ID);
			setState(47);
			cuerpo_automata();
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

	public static class Cuerpo_automataContext extends ParserRuleContext {
		public TerminalNode Llaves_ab() { return getToken(ejemploParser.Llaves_ab, 0); }
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public Estado_iniContext estado_ini() {
			return getRuleContext(Estado_iniContext.class,0);
		}
		public Alf_inContext alf_in() {
			return getRuleContext(Alf_inContext.class,0);
		}
		public Alf_outContext alf_out() {
			return getRuleContext(Alf_outContext.class,0);
		}
		public ComportamientosContext comportamientos() {
			return getRuleContext(ComportamientosContext.class,0);
		}
		public TransicionContext transicion() {
			return getRuleContext(TransicionContext.class,0);
		}
		public TerminalNode Llaves_ce() { return getToken(ejemploParser.Llaves_ce, 0); }
		public Cuerpo_automataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_automata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterCuerpo_automata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitCuerpo_automata(this);
		}
	}

	public final Cuerpo_automataContext cuerpo_automata() throws RecognitionException {
		Cuerpo_automataContext _localctx = new Cuerpo_automataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo_automata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(Llaves_ab);
			setState(50);
			estados();
			setState(51);
			estado_ini();
			setState(52);
			alf_in();
			setState(53);
			alf_out();
			setState(54);
			comportamientos();
			setState(55);
			transicion();
			setState(56);
			match(Llaves_ce);
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

	public static class EstadosContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploParser.ID, i);
		}
		public EstadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterEstados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitEstados(this);
		}
	}

	public final EstadosContext estados() throws RecognitionException {
		EstadosContext _localctx = new EstadosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_estados);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(ID);
					setState(60);
					match(T__2);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(66);
			match(ID);
			setState(67);
			match(T__3);
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

	public static class Estado_iniContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploParser.ID, 0); }
		public Estado_iniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado_ini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterEstado_ini(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitEstado_ini(this);
		}
	}

	public final Estado_iniContext estado_ini() throws RecognitionException {
		Estado_iniContext _localctx = new Estado_iniContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estado_ini);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);
			setState(70);
			match(ID);
			setState(71);
			match(T__3);
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

	public static class Alf_inContext extends ParserRuleContext {
		public List<TerminalNode> Eventos() { return getTokens(ejemploParser.Eventos); }
		public TerminalNode Eventos(int i) {
			return getToken(ejemploParser.Eventos, i);
		}
		public Alf_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alf_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterAlf_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitAlf_in(this);
		}
	}

	public final Alf_inContext alf_in() throws RecognitionException {
		Alf_inContext _localctx = new Alf_inContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alf_in);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(Eventos);
					setState(75);
					match(T__2);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(81);
			match(Eventos);
			setState(82);
			match(T__3);
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

	public static class Alf_outContext extends ParserRuleContext {
		public List<TerminalNode> Cmp() { return getTokens(ejemploParser.Cmp); }
		public TerminalNode Cmp(int i) {
			return getToken(ejemploParser.Cmp, i);
		}
		public Alf_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alf_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterAlf_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitAlf_out(this);
		}
	}

	public final Alf_outContext alf_out() throws RecognitionException {
		Alf_outContext _localctx = new Alf_outContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alf_out);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__6);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(Cmp);
					setState(86);
					match(T__2);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(92);
			match(Cmp);
			setState(93);
			match(T__3);
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

	public static class TransicionContext extends ParserRuleContext {
		public TerminalNode Llaves_ab() { return getToken(ejemploParser.Llaves_ab, 0); }
		public List<Transicion_defContext> transicion_def() {
			return getRuleContexts(Transicion_defContext.class);
		}
		public Transicion_defContext transicion_def(int i) {
			return getRuleContext(Transicion_defContext.class,i);
		}
		public TerminalNode Llaves_ce() { return getToken(ejemploParser.Llaves_ce, 0); }
		public TransicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterTransicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitTransicion(this);
		}
	}

	public final TransicionContext transicion() throws RecognitionException {
		TransicionContext _localctx = new TransicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__7);
			setState(96);
			match(Llaves_ab);
			setState(97);
			transicion_def();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(98);
				transicion_def();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(Llaves_ce);
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

	public static class Transicion_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploParser.ID, 0); }
		public TerminalNode Eventos() { return getToken(ejemploParser.Eventos, 0); }
		public Val_transContext val_trans() {
			return getRuleContext(Val_transContext.class,0);
		}
		public Transicion_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transicion_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterTransicion_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitTransicion_def(this);
		}
	}

	public final Transicion_defContext transicion_def() throws RecognitionException {
		Transicion_defContext _localctx = new Transicion_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transicion_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__8);
			setState(107);
			match(ID);
			setState(108);
			match(T__2);
			setState(109);
			match(Eventos);
			setState(110);
			match(T__2);
			setState(111);
			val_trans();
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

	public static class Val_transContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploParser.ID, 0); }
		public Val_transContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_trans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterVal_trans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitVal_trans(this);
		}
	}

	public final Val_transContext val_trans() throws RecognitionException {
		Val_transContext _localctx = new Val_transContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_val_trans);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(ID);
				setState(114);
				match(T__9);
				setState(115);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(ID);
				setState(117);
				match(T__9);
				setState(118);
				match(T__3);
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

	public static class ComportamientosContext extends ParserRuleContext {
		public TerminalNode Llaves_ab() { return getToken(ejemploParser.Llaves_ab, 0); }
		public List<Comp_defContext> comp_def() {
			return getRuleContexts(Comp_defContext.class);
		}
		public Comp_defContext comp_def(int i) {
			return getRuleContext(Comp_defContext.class,i);
		}
		public TerminalNode Llaves_ce() { return getToken(ejemploParser.Llaves_ce, 0); }
		public ComportamientosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comportamientos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterComportamientos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitComportamientos(this);
		}
	}

	public final ComportamientosContext comportamientos() throws RecognitionException {
		ComportamientosContext _localctx = new ComportamientosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comportamientos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__10);
			setState(122);
			match(Llaves_ab);
			setState(123);
			comp_def();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(124);
				comp_def();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(Llaves_ce);
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

	public static class Comp_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploParser.ID, 0); }
		public Val_compContext val_comp() {
			return getRuleContext(Val_compContext.class,0);
		}
		public Comp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterComp_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitComp_def(this);
		}
	}

	public final Comp_defContext comp_def() throws RecognitionException {
		Comp_defContext _localctx = new Comp_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comp_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__8);
			setState(133);
			match(ID);
			setState(134);
			match(T__2);
			setState(135);
			val_comp();
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

	public static class Val_compContext extends ParserRuleContext {
		public TerminalNode Cmp() { return getToken(ejemploParser.Cmp, 0); }
		public Val_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).enterVal_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploListener ) ((ejemploListener)listener).exitVal_comp(this);
		}
	}

	public final Val_compContext val_comp() throws RecognitionException {
		Val_compContext _localctx = new Val_compContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_val_comp);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(Cmp);
				setState(138);
				match(T__9);
				setState(139);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(Cmp);
				setState(141);
				match(T__9);
				setState(142);
				match(T__3);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n"+
		"f\n\n\f\n\16\ni\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\r\7\r\u0080\n\r\f\r\16\r\u0083"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0092\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u008e"+
		"\2\36\3\2\2\2\4&\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n<\3\2\2\2\fG\3\2\2\2"+
		"\16K\3\2\2\2\20V\3\2\2\2\22a\3\2\2\2\24l\3\2\2\2\26y\3\2\2\2\30{\3\2\2"+
		"\2\32\u0086\3\2\2\2\34\u0091\3\2\2\2\36\37\5\4\3\2\37#\5\6\4\2 \"\5\6"+
		"\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&\'"+
		"\7\16\2\2\',\7\21\2\2()\7\16\2\2)+\7\21\2\2*(\3\2\2\2+.\3\2\2\2,*\3\2"+
		"\2\2,-\3\2\2\2-\5\3\2\2\2.,\3\2\2\2/\60\7\3\2\2\60\61\7\20\2\2\61\62\5"+
		"\b\5\2\62\7\3\2\2\2\63\64\7\27\2\2\64\65\5\n\6\2\65\66\5\f\7\2\66\67\5"+
		"\16\b\2\678\5\20\t\289\5\30\r\29:\5\22\n\2:;\7\30\2\2;\t\3\2\2\2<A\7\4"+
		"\2\2=>\7\20\2\2>@\7\5\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3"+
		"\2\2\2CA\3\2\2\2DE\7\20\2\2EF\7\6\2\2F\13\3\2\2\2GH\7\7\2\2HI\7\20\2\2"+
		"IJ\7\6\2\2J\r\3\2\2\2KP\7\b\2\2LM\7\17\2\2MO\7\5\2\2NL\3\2\2\2OR\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\17\2\2TU\7\6\2\2U\17\3"+
		"\2\2\2V[\7\t\2\2WX\7\16\2\2XZ\7\5\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\16\2\2_`\7\6\2\2`\21\3\2\2\2ab\7\n\2"+
		"\2bc\7\27\2\2cg\5\24\13\2df\5\24\13\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh"+
		"\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\30\2\2k\23\3\2\2\2lm\7\13\2\2mn\7\20"+
		"\2\2no\7\5\2\2op\7\17\2\2pq\7\5\2\2qr\5\26\f\2r\25\3\2\2\2st\7\20\2\2"+
		"tu\7\f\2\2uz\7\5\2\2vw\7\20\2\2wx\7\f\2\2xz\7\6\2\2ys\3\2\2\2yv\3\2\2"+
		"\2z\27\3\2\2\2{|\7\r\2\2|}\7\27\2\2}\u0081\5\32\16\2~\u0080\5\32\16\2"+
		"\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\30\2\2\u0085"+
		"\31\3\2\2\2\u0086\u0087\7\13\2\2\u0087\u0088\7\20\2\2\u0088\u0089\7\5"+
		"\2\2\u0089\u008a\5\34\17\2\u008a\33\3\2\2\2\u008b\u008c\7\16\2\2\u008c"+
		"\u008d\7\f\2\2\u008d\u0092\7\5\2\2\u008e\u008f\7\16\2\2\u008f\u0090\7"+
		"\f\2\2\u0090\u0092\7\6\2\2\u0091\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092"+
		"\35\3\2\2\2\13#,AP[gy\u0081\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}