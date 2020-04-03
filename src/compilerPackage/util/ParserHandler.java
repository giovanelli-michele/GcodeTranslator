package compilerPackage.util;

import org.antlr.runtime.NoViableAltException;
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
     * Codice errore semantico istruzione G non riconosciuta
     */
    public final int ERR_UNKNOWN_G_INSTRUCTION = 14;

    /**
     * Codice errore semantico istruzione M non riconosciuta
     */
    public final int ERR_UNKNOWN_M_INSTRUCTION = 15;


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
            msg += "The operation <" + tk.getText() + "> hasn't been identified and won't be handled";
        else if (code == ERR_UNAUTHORIZED_TOOL_CHANGE_OP)
            msg += "Change tool requested but no tool specified";
        else if (code == ERR_UNAUTHORIZED_TOOL_OP)
            msg += "Tool [" + tk.getText().substring(1,2) + ", "  + tk.getText().substring(3,4) + "] specified without change request";
        else if (code == ERR_UNKNOWN_G_INSTRUCTION)
            msg += "G Instruction [" + tk.getText() + "] hasn't been identified and won't be handled";
        else if (code == ERR_UNKNOWN_M_INSTRUCTION)
            msg += "M Instruction [" + tk.getText() + "] hasn't been identified and won't be handled";
        else
            msg += "Undefined error for token <" + tk.getText() + ">";

        errorList.add(msg);
    }

    public void newLine() {
        /*if (translation.length() > 0) {
            if (!translation.substring(translation.length() - 1).equals(")")) {
                translation.append(numberOfLine.toString() + ")\n");
            } else {
                System.out.println("Mi Vedi???");
                translation.append(numberOfLine.toString() + ")");
            }
        } else {
            translation.append(numberOfLine.toString() + ")\n");
        }*/
        translation.append(numberOfLine.toString() + ")\n");
        numberOfLine++;

    }

    /**
     * Questo metodo ci permette diimpaginare in modo corretto l'output rispettando la formattazione desiderata
     */
    private void checkTranslationFormat() {
        // cancellare i \n
        if (translation.substring(translation.length() - 2).equals(")\n")) {
            translation.deleteCharAt(translation.length() - 1);
        }
        // verificare la tabulazione
        if(numberOfLine > 99 && !translation.substring(translation.length() - 1).equals(")")){
            translation.append("\t");
        }
        if(numberOfLine > 999999 && !translation.substring(translation.length() - 1).equals(")")){
            translation.append("\t");
        }

    }

    public void evaluateM(Token mInstr, Token tInstr) {
        checkTranslationFormat();
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
                    translation.append("\tTool counterclockwise rotation\n");
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
                    translation.append("\t---------------------------------------------------------------------\n");
                    break;
                default:
                    translation.append("\t*** SEMANTIC ERROR [" + ERR_UNKNOWN_M_INSTRUCTION + "] " +
                            "in (" + mInstr.getLine() + "," + mInstr.getCharPositionInLine() + ") - M Instruction [" + mInstr.getText() + "] hasn't been identified and won't be handled\n");
                    addErrorMessage(mInstr, ERR_UNKNOWN_M_INSTRUCTION);
            }
        } else {
            // dobbiamo controllare che M sia 6 o 06, altrimenti errore
            if (mNumericInstruction.equals("06") || mNumericInstruction.equals("6")) {
                String tool = tInstr.getText();
                String tNumericInstruction = tool.substring(1);
                String position = tNumericInstruction.substring(0,2);
                String configuration = tNumericInstruction.substring(2,4);

                translation.append("\tChange tool with the one at position " + position + " with configuration " + configuration + "\n");
            } else {
                // gestione errore del cambio di strumento non consentito T....
                addErrorMessage(tInstr, ERR_UNAUTHORIZED_TOOL_OP);
            }
        }


    }

    public void evaluateS(Token sInstr) {
        checkTranslationFormat();
        // Speed rate
        if (sInstr != null) {
            String tool = sInstr.getText();
            String sNumericInstruction = tool.substring(1);
            translation.append("\tSpeed rate value = " + sNumericInstruction + "\n");
        }

    }

    public void evaluateE(Token eInstr) {
        checkTranslationFormat();
        // Precision feed rate
        if (eInstr != null) {
            String tool = eInstr.getText();
            String eNumericInstruction = tool.substring(1);
            translation.append("\tPrecision feed rate value  = " + eNumericInstruction + "\n");
        }
    }

    public void evaluateF(Token fInstr) {
        checkTranslationFormat();
        // Feed rate
        if (fInstr != null) {
            String tool = fInstr.getText();
            String fNumericInstruction = tool.substring(1);
            translation.append("\tFeed rate value  = " + fNumericInstruction + "\n");
        }
    }

    public void evaluateG0G1(Token g00, Token g01, Token x, Token y, Token z) {
        checkTranslationFormat();
        String message = "";
        if (g00 != null) {
            // supponiamo che in questo caso g01 sia null, e che non abbiamo controlli da fare perché ci pensa il Parser
            message += "\tRapid positioning to [";
        } else if (g01 != null) {
            message += "\tLinear interpolation positioning to [";
        }

        // Ora concateniamo le coordinate presenti
        if (x != null) {
            message +=  "x=" + x.getText().substring(1) + ", ";
        }
        if (y != null) {
            message += "y=" + y.getText().substring(1) + ", ";
        }
        if (z != null) {
            message += "z=" + z.getText().substring(1) + ", ";
        }

        int len = message.length();
        translation.append(message.substring(0, len - 2) + "]\n");

    }

    public void evaluateG2G3(Token g02, Token g03, Token x, Token y, Token z, Token i, Token j, Token k) {
        checkTranslationFormat();
        String message = "";
        if (g02 != null) {
            // supponiamo che in questo caso g01 sia null, e che non abbiamo controlli da fare perché ci pensa il Parser
            message += "\tCircular clockwise interpolation to [";
        } else if (g03 != null) {
            message += "\tCircular counterclockwise interpolation to [";
        }

        // Ora concateniamo le coordinate presenti
        // [x=12, y=23, z=56]
        if (x != null) {
            message += "x=" + x.getText().substring(1) + ", ";
        }
        if (y != null) {
            message += "y=" + y.getText().substring(1) + ", ";
        }
        if (z != null) {
            message += "z=" + z.getText().substring(1) + ", ";
        }

        // eliminiamo l'ultima seqenza ', '
        int len = message.length();
        message = message.substring(0, len - 3);

        message += "] with center in [";

        if (i != null) {
            message += "x=" + i.getText().substring(1) + ", ";
        }
        if (j != null) {
            message += "y=" + j.getText().substring(1) + ", ";
        }
        if (k != null) {
            message += "z=" + k.getText().substring(1) + ", ";
        }

        len = message.length();

        translation.append(message.substring(0, len - 2) + "]\n");

    }

    public void evaluateOtherG(Token otherG) {
        checkTranslationFormat();
        if (otherG == null) {
            // In teoria non dovrebbe mai succedere
            return;
        }

        String command = otherG.getText().substring(1); // codice

        switch (command) {
            case "40":
                translation.append("\tTool radius compensation disabled\n");
                break;
            case "41":
                translation.append("\tTool radius compensation left\n");
                break;
            case "42":
                translation.append("\tTool radius compensation right\n");
                break;
            case "90":
                translation.append("\tAbsolute programming\n");
                break;
            case "91":
                translation.append("\tIncremental programming\n");
                break;
            case "94":
                translation.append("\tMeasure unit for feed rate instruction set to [mm/min]\n");
                break;
            case "95":
                translation.append("\tMeasure unit for feed rate instruction set to [mm/rev]\n");
                break;
            case "96":
                translation.append("\tMeasure unit for speed rate instruction set to [m/min]\n");
                break;
            case "97":
                translation.append("\tMeasure unit for speed rate instruction set to [rev/min]\n");
                break;
            default:
                // G instruction not defined
                translation.append("\t*** SEMANTIC ERROR [" + ERR_UNKNOWN_G_INSTRUCTION + "] " +
                        "in (" + otherG.getLine() + "," + otherG.getCharPositionInLine() + ") - G Instruction [" + otherG.getText() + "] hasn't been identified and won't be handled\n");
                addErrorMessage(otherG, ERR_UNKNOWN_G_INSTRUCTION);
        }
    }

}
