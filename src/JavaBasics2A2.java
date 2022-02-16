import java.util.Arrays;
import java.util.Random;

public class JavaBasics2A2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int range = 100;
        int numRows = 10;
        int numCols = 10;
        int[][] nums = new int[numRows][numCols];

        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[0].length; j++) {
                nums[i][j] = rand.nextInt(range);
            }
        }

        int max = Integer.MIN_VALUE;
        int[] coords = new int[]{-1,-1};
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[0].length; j++) {
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    coords[0] = i;
                    coords[1] = j;
                }
            }
        }
        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(coords[0] + " " + coords[1]);
    }
}
