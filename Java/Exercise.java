// import java.util.Collections;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        double[] x = new double[length + 1];
        double[] y = new double[length + 1];

        for (int i = length; i > 0; i--) {
            x[i] = input.nextDouble();
            y[i] = input.nextDouble();
        }
        x[0] = x[length];
        y[0] = y[length];
        System.out.println(toArea(x, y));
    }

    public static double toArea(double[] x, double[] y) {
        double firstHalf = 0;
        double secondHalf = 0;
        for(int i = 1; i < x.length; i++) {

            firstHalf += x[i-1] * y[i];
            secondHalf += x[i] * y[i-1];
        }
        return (1/2.0) * (firstHalf - secondHalf);
    }
}
