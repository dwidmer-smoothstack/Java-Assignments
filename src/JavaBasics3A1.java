import java.io.File;

public class JavaBasics3A1 {
    public void listFiles(String dir) {
        File directory = new File(dir);
        File[] files = directory.listFiles();

        if (files != null && files.length > 0) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(f.getName());
                    listFiles(f.getAbsolutePath());
                } else {
                    System.out.println("  " + f.getName());
                }
            }
        }
    }
    public static void main(String[] args) {
        JavaBasics3A1 javaBasics3A1 = new JavaBasics3A1();
        String path;
        if (args.length > 0 && args[0] != null) {
            path = args[0];
        } else {
            path = System.getProperty("user.dir");
        }
        javaBasics3A1.listFiles(path);
    }
}

