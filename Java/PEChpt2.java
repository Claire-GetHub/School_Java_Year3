import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class PEChpt2 {
    public static void main(String[] args) {
        // pointTwo();
        // pointFour();
        // pointSix();
        // pointEight();
        // pointTen();
        // pointTwelve();
        // pointForteen();
        // pointSixteen();
        // pointEighteen();
        // pointTwenty();
         pointTwentyTwo();
    }

    //get area and volume of a circle from its given length and radius
    public static void pointTwo() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("radius & length: ");
            //get raidius and length from input
            double radius = input.nextDouble();
            double length = input.nextDouble();
            //formula for area
            System.out.println("area: " + radius * radius * 3.14159);
            //formula for volme
            System.out.println("volume: " + radius * radius * 3.14159 * length);
        }
    
    }

    //get kilograms from given pounds
    public static void pointFour() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("pounds: ");
            //get pounds
            double pounds = input.nextDouble();
            //formula for pounds too kilograms
            System.out.println("kilograms: " + pounds * 0.454);
        }
    }

    //get sum of digits of given integer
    public static void pointSix() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("number: ");
            //get integer
            int number = input.nextInt();
            //sum the digets of integer
            System.out.println("sum: " + ((number / 100) + (number / 10 % 10) + (number % 10)));
        }    
    }
    
    //get current time from given GMT offset
    public static void pointEight() {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("GMT offset: ");
            int offset = input.nextInt();

            //current GMT time
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

            //get hours minutes and seconds of current GMT time
            int GMThour = calendar.get(Calendar.HOUR_OF_DAY);
            int minutes = calendar.get(Calendar.MINUTE);
            int seconds = calendar.get(Calendar.SECOND);
            //Create LocalTime from GMT time, then add offset
            LocalTime currentTime = LocalTime.of(GMThour, minutes, seconds).plusHours(offset);
            //show current time
            System.out.println("current time: " + currentTime);
        }
    }

    //get energy needed to heat water to given final tempature using given initial tempature and kilograms
    public static void pointTen() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("kilograms: ");
            double kilograms = input.nextDouble();
            System.out.print("initial: ");
            double initialTempature = input.nextDouble();
            System.out.print("final: ");
            double finalTempature = input.nextDouble();
            //formula for energy from kilograms, final tempature and initial tempature
            System.out.println(kilograms * (finalTempature - initialTempature) * 4184);
        }
    }

    //find required runway length from given velocity and acceleration
    public static void pointTwelve() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("velocity & acceleration: ");
            double velocity = input.nextDouble();

            double acceleration = input.nextDouble();
            //formula for runway length
            System.out.println("length: " + (Math.pow(velocity, 2)) / (2 * acceleration));
        }
    }

    //find BMI from given pounds and inches
    public static void pointForteen() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("pounds: ");
            double pounds = input.nextDouble();
            System.out.print("inches: ");
            double inches = input.nextDouble();
            //translate kilograms to pounds and inches to meters
            double kilograms = pounds * 0.45359237;
            double meters = inches * 0.0254;
            //formula for BMI
            System.out.println("BMI: " + (kilograms/(Math.pow(meters, 2))));


        } 
    }

    //find area of a hexagon from given sides length
    public static void pointSixteen() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("hexagon side: ");
            double sides = input.nextDouble();
            //formula for the area of a hexagon
            System.out.println("area: " + (3 * Math.pow(3, 0.5))/2 * Math.pow(sides, 2));
        }
    }

    //prints a table of "a   a + 1   pow(a, a + 1)", while "a" is > 1 and < 6
    public static void pointEighteen() {
        //header
        System.out.println("a   b   pow(a,b)");
        for (int i = 1; i < 6; i++) {
            //table values
            System.out.println(i + "   " + (i + 1) + "   " + (int)Math.pow(i, i + 1));
            }
    }
    
    //find intrest from given balance and intrest rate
    public static void pointTwenty() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("balance & intrest rate: ");
            double balance = input.nextDouble();
            double rate = input.nextDouble();
            //formula to get intrest
            System.out.println("intrest: " + balance * (rate/1200));
            
        }
    }

    //find the amount of dollars, quaters, dime, nickles, and pennies needed to equal the given int (the last two numbers are cents)
    public static void pointTwentyTwo() {

        // Create a Scanner 
        try (Scanner input = new Scanner(System.in)) { 

            // Receive the amount 
            System.out.print("Enter an amount in int, for example 1156 means 11.56: ");
            int amount = input.nextInt();

            int remainingAmount = amount;

            // Find the number of one dollars
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            // Find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            // Find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;

            // Find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            // Find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            // Display results
            System.out.println("Your amount " + amount/100.0 + " consists of"); 
            System.out.println("    " + numberOfOneDollars + " dollars");
            System.out.println("    " + numberOfQuarters + " quarters");
            System.out.println("    " + numberOfDimes + " dimes"); 
            System.out.println("    " + numberOfNickels + " nickels");
            System.out.println("    " + numberOfPennies + " pennies");
        }
  

    }
}
