import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main{
    
  static String readFile(String path, Charset encoding) throws IOException{ 
      byte[] encoded = Files.readAllBytes(Paths.get(path));
  return new String(encoded, encoding);
  }

    public static void main(String[] args) throws IOException{
        String content = readFile("automata_de_prueba.txt", StandardCharsets.UTF_8);
        System.out.println(""+content);

        practicaAntlrLexer lexer = new practicaAntlrLexer(CharStreams.fromString(content));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        practicaAntlrParser parser = new practicaAntlrParser(tokens);

        ParseTree tree = parser.programa();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();

        walker.walk((ParseTreeListener) listener, tree);
    }
}