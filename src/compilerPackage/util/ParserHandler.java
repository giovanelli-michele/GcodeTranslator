package compilerPackage.util;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import java.util.ArrayList;

/**
 * Gestore del parser
 */
public class ParserHandler {
    /**
     * Codice errore sintattico
     */
    public final int ERR_ON_SYNTAX = 1;
    /**
     * Codice errore semantico no value
     */
    public final int ERR_NO_VALUE = 10;
    /**
     * Codice errore sematico operazione non definita
     */
    public final int ERR_UNDEFINED_OP = 11;
    /**
     * Codice errore sematico cambio tool non consentito
     * Quando specificato M06 senza tool
     */
    public final int ERR_UNAUTHORIZED_TOOL_CHANGE_OP = 12;
    /**
     * Codice errore sematico tool non consentito
     * Quando specificato il tool senza cambio
     */
    public final int ERR_UNAUTHORIZED_TOOL_OP = 13;

    /**
     * translation è messo nel file di output
     */
    public StringBuffer translation;

    private static Integer numberOfLine;
    /**
     * errorList verrà messo nella console e nel file di errori
     */
    public ArrayList<String> errorList;

    /**
     * Costruttore del Parser Handler
     */
    public ParserHandler() {
        this.translation = new StringBuffer();
        this.errorList = new ArrayList<>();
        numberOfLine = 1;
    }

    /**
     * Metodo che gestisce gli errori sintattici
     *
     * @param tokenNames Array con i token
     * @param e          Eccezione
     * @param h          not used
     * @param m          message
     */
    public void handleError(String[] tokenNames,
                            RecognitionException e, String h, String m) {

        String st = "*** SINTAX ERROR [" + ERR_ON_SYNTAX + "] in " +
                "(" + e.token.getLine() + ", " + e.token.getCharPositionInLine() + ") - " +
                "Found ";
        if (e.token.getType() >= 0)
            st += tokenNames[e.token.getType()];
        st += " ('" + e.token.getText() + "')" + m;

        errorList.add(st);
    }

    public void addErrorMessage (Token tk, int code) {
        String msg = "*** SEMANTIC ERROR [" + code + "] "
                + "in (" + tk.getLine() + "," + tk.getCharPositionInLine() + ") - ";

        if (code == ERR_NO_VALUE)
            // TODO
            msg += "La variabile <" + tk.getText() + "> è già stata dichiarata";
        else if (code == ERR_UNDEFINED_OP)
            // TODO
            msg += "La variabile <" + tk.getText() + "> non è stata dichiarata";
        else if (code == ERR_UNAUTHORIZED_TOOL_CHANGE_OP)
            msg += "Change tool requested but no tool specified";
        else if (code == ERR_UNAUTHORIZED_TOOL_OP)
            msg += "Tool [" + tk.getText().substring(1,2) + ", "  + tk.getText().substring(3,4) + "] specified without change request";
        else
            msg += "Undefined error for token <" + tk.getText() + ">";

        errorList.add(msg);
    }

    public void newLine() {
        translation.append(numberOfLine.toString() + ")");
        numberOfLine++;
    }

    public void evaluateM(Token mInstr, Token tInstr) {
        String token = mInstr.getText();
        String mNumericInstruction = token.substring(1);

        if (tInstr == null) {
            switch (mNumericInstruction) {
                case "00":
                case "0":
                    //translation.append(numberOfLine).append(") Stop Programma\n");
                    translation.append("\tPause Program\n");
                    break;
                case "03":
                case "3":
                    translation.append("\tTool clockwise rotation\n");
                    break;
                case "04":
                case "4":
                    translation.append("\tTool anticlockwise rotation\n");
                    break;
                case "05":
                case "5":
                    translation.append("\tStop tool\n");
                    break;
                case "06":
                case "6":
                    // Serve per mostrare un errore
                    addErrorMessage(tInstr, ERR_UNAUTHORIZED_TOOL_CHANGE_OP);
                    break;
                case "08":
                case "8":
                    translation.append("\tActivate cooling lubrificant\n");
                    break;
                case "09":
                case "9":
                    translation.append("\tDeactivate cooling lubrificant\n");
                    break;
                case "10":
                    translation.append("\tBlock workpiece\n");
                    break;
                case "11":
                    translation.append("\tUnblock workpiece\n");
                    break;
                case "30":
                    translation.append("\tEnd of Program\n");
                    break;
                default:

            }
        } else {
            // dobbiamo controllare che M sia 6 o 06, altrimenti errore
            if (mNumericInstruction.equals("06") || mNumericInstruction.equals("6")) {
                String tool = tInstr.getText();
                String tNumericInstruction = tool.substring(1);
                String position = tNumericInstruction.substring(0,1);
                String configuration = tNumericInstruction.substring(2,3);

                translation.append("\tChange tool with the one at position " + position + " with configuration " + configuration + "\n");
            } else {
                // gestione errore del cambio di strumento non consentito T....
                addErrorMessage(tInstr, ERR_UNAUTHORIZED_TOOL_OP);
            }
        }


    }

    public void evaluateS(Token sInstr) {
        // Speed rate
        if (sInstr != null) {
            String tool = sInstr.getText();
            String sNumericInstruction = tool.substring(1);
            translation.append("\tSpeed rate value = " + sNumericInstruction + "\n");
        }

    }

    public void evaluateE(Token eInstr) {
        // Precision feed rate
        if (eInstr != null) {
            String tool = eInstr.getText();
            String eNumericInstruction = tool.substring(1);
            translation.append("\tPrecision feed rate value  = " + eNumericInstruction + "\n");
        }
    }

    public void evaluateF(Token fInstr) {
        // Feed rate
        if (fInstr != null) {
            String tool = fInstr.getText();
            String fNumericInstruction = tool.substring(1);
            translation.append("\tFeed rate value  = " + fNumericInstruction + "\n");
        }
    }
}
