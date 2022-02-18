package JavaBasics3;

import java.io.FileWriter;
import java.io.IOException;

public class JavaBasics3A2 {
    public void appendText(String filePath, String textToAppend) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(filePath, true);
            fileWriter.write(textToAppend);
            fileWriter.close();
        } catch(IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
    public static void main (String[] args) {
        JavaBasics3A2 javaBasics3A2 = new JavaBasics3A2();
        String path;
        String text;
        if (args.length == 2 && args[0] != null && args[1] != null) {
            path = args[0];
            text = args[1];
        } else {
            path = "test.txt";
            text = "test";
        }
        javaBasics3A2.appendText(path, text);
    }
}
