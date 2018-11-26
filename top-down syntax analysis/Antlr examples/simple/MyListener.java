import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.System;



public class MyListener implements simpleListener{
	private int count;
	public MyListener(){
		this.count = 0;
	}

	@Override
	public void enterS(simpleParser.SContext ctx) {

	}

	@Override
	public void exitS(simpleParser.SContext ctx) {

	}

	@Override
	public void enterA(simpleParser.AContext ctx) {
		System.out.println("Entramos en A: " + ctx.getText() + " Y es la " + this.count + " vez");
	}

	@Override
	public void exitA(simpleParser.AContext ctx) {

	}

	@Override
	public void enterB(simpleParser.BContext ctx) {

	}

	@Override
	public void exitB(simpleParser.BContext ctx) {

	}

	@Override
	public void visitTerminal(TerminalNode terminalNode) {
		System.out.println(terminalNode.getSymbol().getText());
	}

	@Override
	public void visitErrorNode(ErrorNode errorNode) {

	}

	@Override
	public void enterEveryRule(ParserRuleContext parserRuleContext) {

	}

	@Override
	public void exitEveryRule(ParserRuleContext parserRuleContext) {

	}
}