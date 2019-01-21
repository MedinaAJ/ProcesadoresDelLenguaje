// Generated from .\practicaAntlr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link practicaAntlrParser}.
 */
public interface practicaAntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(practicaAntlrParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(practicaAntlrParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#dec_comp}.
	 * @param ctx the parse tree
	 */
	void enterDec_comp(practicaAntlrParser.Dec_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#dec_comp}.
	 * @param ctx the parse tree
	 */
	void exitDec_comp(practicaAntlrParser.Dec_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#automata}.
	 * @param ctx the parse tree
	 */
	void enterAutomata(practicaAntlrParser.AutomataContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#automata}.
	 * @param ctx the parse tree
	 */
	void exitAutomata(practicaAntlrParser.AutomataContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#cuerpo_automata}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_automata(practicaAntlrParser.Cuerpo_automataContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#cuerpo_automata}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_automata(practicaAntlrParser.Cuerpo_automataContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#estados}.
	 * @param ctx the parse tree
	 */
	void enterEstados(practicaAntlrParser.EstadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#estados}.
	 * @param ctx the parse tree
	 */
	void exitEstados(practicaAntlrParser.EstadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#estado_ini}.
	 * @param ctx the parse tree
	 */
	void enterEstado_ini(practicaAntlrParser.Estado_iniContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#estado_ini}.
	 * @param ctx the parse tree
	 */
	void exitEstado_ini(practicaAntlrParser.Estado_iniContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#alf_in}.
	 * @param ctx the parse tree
	 */
	void enterAlf_in(practicaAntlrParser.Alf_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#alf_in}.
	 * @param ctx the parse tree
	 */
	void exitAlf_in(practicaAntlrParser.Alf_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#alf_out}.
	 * @param ctx the parse tree
	 */
	void enterAlf_out(practicaAntlrParser.Alf_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#alf_out}.
	 * @param ctx the parse tree
	 */
	void exitAlf_out(practicaAntlrParser.Alf_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#transicion}.
	 * @param ctx the parse tree
	 */
	void enterTransicion(practicaAntlrParser.TransicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#transicion}.
	 * @param ctx the parse tree
	 */
	void exitTransicion(practicaAntlrParser.TransicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#transicion_def}.
	 * @param ctx the parse tree
	 */
	void enterTransicion_def(practicaAntlrParser.Transicion_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#transicion_def}.
	 * @param ctx the parse tree
	 */
	void exitTransicion_def(practicaAntlrParser.Transicion_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#val_trans}.
	 * @param ctx the parse tree
	 */
	void enterVal_trans(practicaAntlrParser.Val_transContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#val_trans}.
	 * @param ctx the parse tree
	 */
	void exitVal_trans(practicaAntlrParser.Val_transContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#comportamientos}.
	 * @param ctx the parse tree
	 */
	void enterComportamientos(practicaAntlrParser.ComportamientosContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#comportamientos}.
	 * @param ctx the parse tree
	 */
	void exitComportamientos(practicaAntlrParser.ComportamientosContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#comp_def}.
	 * @param ctx the parse tree
	 */
	void enterComp_def(practicaAntlrParser.Comp_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#comp_def}.
	 * @param ctx the parse tree
	 */
	void exitComp_def(practicaAntlrParser.Comp_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link practicaAntlrParser#val_comp}.
	 * @param ctx the parse tree
	 */
	void enterVal_comp(practicaAntlrParser.Val_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link practicaAntlrParser#val_comp}.
	 * @param ctx the parse tree
	 */
	void exitVal_comp(practicaAntlrParser.Val_compContext ctx);
}