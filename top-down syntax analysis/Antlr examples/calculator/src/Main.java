import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main{
    public static void main(String[] args){
        String area = "A = pi*r^2";
        calculatorLexer lexer = new calculatorLexer(CharStreams.fromString(area));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calculatorParser parser = new calculatorParser(tokens);

        ParseTree tree = parser.equation();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();

        walker.walk(listener, tree);
    }
}