import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.System;



public class MyListener implements calculatorListener{
    @Override
    public void enterExpression(calculatorParser.ExpressionContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitExpression(calculatorParser.ExpressionContext ctx) {
        System.out.println("Salimos: " + ctx.getText());
    }

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEquation(calculatorParser.EquationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEquation(calculatorParser.EquationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMultiplyingExpression(calculatorParser.MultiplyingExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMultiplyingExpression(calculatorParser.MultiplyingExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPowExpression(calculatorParser.PowExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPowExpression(calculatorParser.PowExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSignedAtom(calculatorParser.SignedAtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSignedAtom(calculatorParser.SignedAtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAtom(calculatorParser.AtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAtom(calculatorParser.AtomContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterScientific(calculatorParser.ScientificContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitScientific(calculatorParser.ScientificContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstant(calculatorParser.ConstantContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConstant(calculatorParser.ConstantContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterVariable(calculatorParser.VariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitVariable(calculatorParser.VariableContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunc(calculatorParser.FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunc(calculatorParser.FuncContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFuncname(calculatorParser.FuncnameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFuncname(calculatorParser.FuncnameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRelop(calculatorParser.RelopContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRelop(calculatorParser.RelopContext ctx) {
		// TODO Auto-generated method stub
		
	}
}