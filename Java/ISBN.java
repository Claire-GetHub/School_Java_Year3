import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("ASBN int: ");
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
            String strNum = "";
            for (int idx = 0; idx < digits.length; idx++) {
                digitSum += digits[idx] * (idx + 1);
                strNum += digits[idx];
            }
            digitSum %= 11;
          
            if (digitSum > 9) {
                System.out.println("ISBN- 10 number: " + strNum + "X");
            } else {
                System.out.println("ISBN- 10 number: " + strNum + digitSum);
            }
        }
    }
}
