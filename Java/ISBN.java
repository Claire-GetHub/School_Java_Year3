import java.util.Arrays;
import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            int[] digits = new int[]{

                num / 100000000 % 10,
                num / 10000000 % 10,
                num / 1000000 % 10,
                num / 100000 % 10,
                num / 10000 % 10,
                num / 1000 % 10,
                num / 100 % 10,
                num / 10 % 10,
                num % 10,
            };

            int digitSum = 0;
            for (int digit : digits) {
                digitSum += digit;
            }
            System.out.println(Arrays.toString(digits));
            //digit sum isnt correct
            System.out.println(digitSum % 11);

        }
    }
}
