import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaBasics3A3 {
    public int countLetters(String filePath, char c) {
        int count = 0;
        try {
            File f = new File(filePath);
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char checkChar = line.charAt(i);
                    if (checkChar == c) {
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException err) {
            System.out.println("FileNotFoundException: "+err.getMessage());
        }
        return count;
    }
    public static void main (String[] args) {
        JavaBasics3A3 javaBasics3A3 = new JavaBasics3A3();
        String path;
        char c;
        if (args.length == 2 && args[0] != null && args[1] != null) {
            path = args[0];
            c = args[1].charAt(0);
        } else {
            path = "test.txt";
            c = 't';
        }
        System.out.println(javaBasics3A3.countLetters(path, c));
    }
}