import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            String source = "src/input.txt";
            CharStream cs = fromFileName(source);
            PolicyGrammarLexer lexer = new PolicyGrammarLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            PolicyGrammarParser parser = new PolicyGrammarParser(token);
            ParseTree tree = parser.program();

            Analyzer analyzer = new Analyzer();

            String outfile = "src/output.txt";
            BufferedWriter out = new BufferedWriter(new FileWriter(outfile));
            out.write(analyzer.analyze(tree.getChild(0)));
            out.close();

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}