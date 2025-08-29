import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("filing status: ");
        int status = input.nextInt();
        System.out.print("taxable income: ");
        double income = input.nextDouble();
        double tax = 0;

        int[][] incomeRates = {
                                {372950, 171550, 82250, 33950, 8350, 0},
                                {372950, 208850, 137050, 67900, 16700, 0},
                                {186475, 104425, 68525, 33950, 8350, 0}, 
                                {372950, 190200, 117450, 45500, 11950, 0}
                                };

        double[] taxRates = {0.35, 0.33, 0.28, 0.25, 0.15, 0.10};
        
        int[] incomeRate = incomeRates[status];

        for (int idx = 0; idx < incomeRate.length; idx++) {
            if (income > incomeRate[idx]) {

                tax += taxRates[idx] * (income - incomeRate[idx]);
                income = incomeRate[idx];

            } 
        }

        System.out.println(tax);
    }
}
