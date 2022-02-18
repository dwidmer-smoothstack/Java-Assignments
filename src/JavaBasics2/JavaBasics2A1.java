package JavaBasics2;

public class JavaBasics2A1 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 0; i < args.length; i++) {
            try {
                double num =Double.parseDouble(args[i]);
                sum += num;
            } catch (Exception e) {
                System.out.println("Invalid input.");
                return;
            }
        }
        System.out.println(sum);
    }
}
