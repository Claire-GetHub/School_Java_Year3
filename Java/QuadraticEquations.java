import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("a: ");
            double a = input.nextDouble();
            System.out.print("b: ");
            double b = input.nextDouble();
            System.out.print("c: ");
            double c = input.nextDouble();
            double discriminant = (Math.pow(b,2) - 4 * a * c);

            if (discriminant > 0) {
                System.out.print("Roots: " + quadraticFormula(a,b,c, 1) + " and " + quadraticFormula(a,b,c, -1));
            } else if (discriminant < 0) {
                System.out.println("The equation has no real roots");
            } else {
                System.out.print("Root: " + quadraticFormula(a,b,c, 1));  
            }
        }
    }

    public static double quadraticFormula (double a, double b, double c, int polarity) {

        double root = (-b + (polarity * Math.pow((Math.pow(b,2) -4 * a * c), 0.5))) / 2.0 * a;
        
       return root;

    }
}
