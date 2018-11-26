import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main{
    public static void main(String[] args){
        String area = "public class SampleClass { void DoSomething(){} void notDoSomething() {} }";
        java8Lexer java8Lexer = new java8Lexer(CharStreams.fromString(area));

        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        java8Parser parser = new java8Parser(tokens);

        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();

        walker.walk(listener, tree);

        for (String error : listener.getErrors()){
            System.out.println(error);
        }
    }
}