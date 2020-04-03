package testerPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

import compilerPackage.*;

public class ParserTester {
    static gcodeParser parser;

    public static void main(String[] args) {
        CommonTokenStream tokens;
        String fileIn = ".\\resources\\input.file"; // questo è lo stream di input
        String fileOut1 = ".\\resources\\parser.ANTLR.out.txt";
        String fileErr1 = ".\\resources\\parser.ANTLR.err.txt";

        try {
//			SimpleLanguageLexer lexer = new SimpleLanguageLexer(new ANTLRReaderStream(new FileReader(fileIn)));
            gcodeLexer lexer = new gcodeLexer(new ANTLRReaderStream(new FileReader(fileIn)));
            tokens = new CommonTokenStream(lexer); // genera iìlo stream di token con il quale istanziamo poi il parser
            parse(tokens, fileOut1, fileErr1);
        } catch (Exception e) {
            System.out.println ("Parsing aborted\n\n");
            e.printStackTrace();
        }

    }

    static void parse (CommonTokenStream tokens, String fileOut, String fileErr) throws IOException, RecognitionException {
        FileWriter fOut;
//	  	parser = new SimpleLanguageParser(tokens);
        parser = new gcodeParser(tokens);
        parser.start(); // questo serve per lanciare il primo token e quindi successivamente tutto il parser

        if (parser.getErrors().size() == 0) {
            System.out.println ("--------------------------------");
            System.out.println ("Parsing successfully completed!");
            System.out.println ("--------------------------------");
            System.out.println ("\nTranslation:");
            System.out.println (parser.getTranslation());
            fOut = new FileWriter (fileOut);
            fOut.append(parser.getTranslation());
            fOut.close();
        }
        else {
            System.out.println ("Parsing completato con " + parser.getErrors().size() + " errori\n\n");
            fOut = new FileWriter (fileErr);
            for (int i=0; i<parser.getErrors().size(); i++) {
                fOut.append((i+1) + ":" + parser.getErrors().get(i) + "\n");
                System.out.println ((i+1) + ":" + parser.getErrors().get(i));
            }
            fOut.close();
            fOut = new FileWriter (fileOut);
            fOut.write("");
            fOut.close();
        }

    }
}
