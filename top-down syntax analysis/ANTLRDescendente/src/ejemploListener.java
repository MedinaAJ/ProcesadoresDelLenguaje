// Generated from .\ejemplo.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ejemploParser}.
 */
public interface ejemploListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ejemploParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ejemploParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ejemploParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#dec_comp}.
	 * @param ctx the parse tree
	 */
	void enterDec_comp(ejemploParser.Dec_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#dec_comp}.
	 * @param ctx the parse tree
	 */
	void exitDec_comp(ejemploParser.Dec_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#automata}.
	 * @param ctx the parse tree
	 */
	void enterAutomata(ejemploParser.AutomataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#automata}.
	 * @param ctx the parse tree
	 */
	void exitAutomata(ejemploParser.AutomataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#cuerpo_automata}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_automata(ejemploParser.Cuerpo_automataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#cuerpo_automata}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_automata(ejemploParser.Cuerpo_automataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#estados}.
	 * @param ctx the parse tree
	 */
	void enterEstados(ejemploParser.EstadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#estados}.
	 * @param ctx the parse tree
	 */
	void exitEstados(ejemploParser.EstadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#estado_ini}.
	 * @param ctx the parse tree
	 */
	void enterEstado_ini(ejemploParser.Estado_iniContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#estado_ini}.
	 * @param ctx the parse tree
	 */
	void exitEstado_ini(ejemploParser.Estado_iniContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#alf_in}.
	 * @param ctx the parse tree
	 */
	void enterAlf_in(ejemploParser.Alf_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#alf_in}.
	 * @param ctx the parse tree
	 */
	void exitAlf_in(ejemploParser.Alf_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#alf_out}.
	 * @param ctx the parse tree
	 */
	void enterAlf_out(ejemploParser.Alf_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#alf_out}.
	 * @param ctx the parse tree
	 */
	void exitAlf_out(ejemploParser.Alf_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#transicion}.
	 * @param ctx the parse tree
	 */
	void enterTransicion(ejemploParser.TransicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#transicion}.
	 * @param ctx the parse tree
	 */
	void exitTransicion(ejemploParser.TransicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#transicion_def}.
	 * @param ctx the parse tree
	 */
	void enterTransicion_def(ejemploParser.Transicion_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#transicion_def}.
	 * @param ctx the parse tree
	 */
	void exitTransicion_def(ejemploParser.Transicion_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#val_trans}.
	 * @param ctx the parse tree
	 */
	void enterVal_trans(ejemploParser.Val_transContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#val_trans}.
	 * @param ctx the parse tree
	 */
	void exitVal_trans(ejemploParser.Val_transContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#comportamientos}.
	 * @param ctx the parse tree
	 */
	void enterComportamientos(ejemploParser.ComportamientosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#comportamientos}.
	 * @param ctx the parse tree
	 */
	void exitComportamientos(ejemploParser.ComportamientosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#comp_def}.
	 * @param ctx the parse tree
	 */
	void enterComp_def(ejemploParser.Comp_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#comp_def}.
	 * @param ctx the parse tree
	 */
	void exitComp_def(ejemploParser.Comp_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejemploParser#val_comp}.
	 * @param ctx the parse tree
	 */
	void enterVal_comp(ejemploParser.Val_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejemploParser#val_comp}.
	 * @param ctx the parse tree
	 */
	void exitVal_comp(ejemploParser.Val_compContext ctx);
}