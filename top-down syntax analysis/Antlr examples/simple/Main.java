import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main{
    public static void main(String[] args){
        String area = "ascbefd";
        simpleLexer lexer = new simpleLexer(CharStreams.fromString(area));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simpleParser parser = new simpleParser(tokens);

        ParseTree tree = parser.s();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();

        walker.walk(listener, tree);
    }
}