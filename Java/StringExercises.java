
import java.util.Scanner;

public class StringExercises {
    //Formula: F = m*g*sin(angle)
    public static void main(String[] args) {
        // fourPointOne();
        // fourPointTwo();
        // fourPointThree();
        // fourPointFour();
        // fourPointFive();
        fourPointSix();
    }

    static void fourPointOne() {
        //Physics: ramp angle

        try (Scanner input = new Scanner(System.in)) {
            final double gravity = 9.8;

            System.out.print("Enter the mass of the cart: ");
            int mass = input.nextInt();
            System.out.print("Enter the force to push the cart: ");
            int force = input.nextInt();

            double angle = Math.toDegrees(Math.asin((force)/(mass*gravity)));

            System.out.printf("The angle of the ramp is %.1f degrees", angle);
        }
    }

    static void fourPointTwo() {
        //Physics: force to push a cart

        try (Scanner input = new Scanner(System.in)) {
            final double gravity = 9.8;

            System.out.print("Enter the mass of the cart: ");
            int mass = input.nextInt();
            System.out.print("Enter the angle of the ramp: ");
            int angle = input.nextInt();

            double force = mass * gravity * Math.sin(Math.toRadians(angle));

            System.out.printf("The force needed to push the cart is %.2f Newtons", force);
        }
    }

    static void fourPointThree() {
        //formula: if, sin > coefficient * cos, the brick will slide
        // 
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the coefficient of friction: ");
            double coefficient = input.nextDouble();

            double angle = Math.toDegrees(Math.atan(coefficient));

            System.out.printf("The minimal angle for the brick to slide is %.3f degrees", angle);
        }
    }

    static void fourPointFour() {
        //acceleration = gravity * sin - coefficient* gravity * cos

        try (Scanner input = new Scanner(System.in)) {
            final double gravity = 9.8;

            System.out.print("Enter the coefficient of friction: ");
            double coefficient = input.nextDouble();
            System.out.print("Enter the angle: ");
            double rad = Math.toRadians(input.nextDouble());

            double acceleration = (gravity * Math.sin(rad)) - (coefficient * gravity * Math.cos(rad));

            if (acceleration > 0) {
                System.out.printf("The brick accelerates at %.5f meters per square seconds", acceleration);
            } else {
                System.out.println("The brick does not move or move at a constant speed");
            }
        }
    }

    static void fourPointFive() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = input.nextLine().trim();
            Character lastChar = str.charAt(str.length() - 1);
            System.out.print(lastChar);
        }
    }

    static void fourPointSix() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a four-digit binary string: ");
            String binary = input.nextLine().trim();
            Character b0 = ((int)str.charAt(0));
            Character b1 = ((int)str.charAt(1));
            Character b2 = ((int)str.charAt(2));
            Character b3 = ((int)str.charAt(3));
            System.out.print(lastChar);
        }
    }
}
