import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by suneth on 7/13/2017.
 */
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("activityFile.txt"));
        String readRecognition;
        while((readRecognition = in.readLine()) != null)
        {
            new test().testPerson(readRecognition);
            System.out.println();
        }
        in.close();
    }

    private void testPerson(String recognition){
        // Get our lexer
        AREMLLexer lexer = new AREMLLexer(new ANTLRInputStream(recognition));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        AREMLParser parser = new AREMLParser(tokens);

        // Specify our entry point
        AREMLParser.RContext drinkSentenceContext = parser.r();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        TestAREMLlistener listener = new TestAREMLlistener();
        walker.walk(listener, drinkSentenceContext);
    }
}
