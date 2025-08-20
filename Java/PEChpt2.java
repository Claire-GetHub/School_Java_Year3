import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class PEChpt2 {
    public static void main(String[] args) {
        pointTwenty();
    }

    public static void pointTwo() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("radius & legth: ");
            double radius = input.nextDouble();
            double length = input.nextDouble();
            System.out.println("area: " + radius * radius * 3.14159);
            System.out.println("volume: " + radius * radius * 3.14159 * length);
        }
    
    }

    public static void pointFour() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("pounds: ");
            double pounds = input.nextDouble();
            System.out.println("kilograms: " + pounds * 0.454);
        }
    }

    public static void pointSix() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("number: ");
            int number = input.nextInt();
            System.out.println("sum: " + ((number / 100) + (number / 10 % 10) + (number % 10)));
        }    
    }
        
    public static void pointEight() {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("GMT offset: ");
            int offset = input.nextInt();

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

            int GMThour = calendar.get(Calendar.HOUR_OF_DAY);
            int minutes = calendar.get(Calendar.MINUTE);
            int seconds = calendar.get(Calendar.SECOND);
            LocalTime currentTime = LocalTime.of(GMThour, minutes, seconds).plusHours(offset);

            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("current time: " + currentTime);
        }
    }

    public static void pointTen() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("kilograms: ");
            double kilograms = input.nextDouble();
            System.out.print("initial: ");
            double initialTempature = input.nextDouble();
            System.out.print("final: ");
            double finalTempature = input.nextDouble();
            System.out.println(kilograms * (finalTempature - initialTempature) * 4184);
        }
    }

    public static void pointTwelve() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("velocity & acceleration: ");
            double velocity = input.nextDouble();

            double acceleration = input.nextDouble();
            System.out.println((Math.pow(velocity, 2)) / (2 * acceleration));
        }
    }

    public static void pointForteen() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("pounds: ");
            double pounds = input.nextDouble();
            System.out.print("inches: ");
            double inches = input.nextDouble();

            double kilograms = pounds * 0.45359237;
            double meters = inches * 0.0254;

            System.out.println("BMI: " + (kilograms/(Math.pow(meters, 2))));


        } 
    }

    public static void pointSixteen() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("hexagon side: ");
            double sides = input.nextDouble();
            System.out.println((3 * Math.pow(3, 0.5))/2 * Math.pow(sides, 2));
        }
    }

    public static void pointEighteen() {
        System.out.println("a   b   pow(a,b)");
        for (int i = 1; i < 6; i++) {
            System.out.println(i + "   " + (i + 1) + "   " + (int)Math.pow(i, i + 1));
            }
    }
    
    public static void pointTwenty() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("balance & intrest rate: ");
            double balance = input.nextDouble();
            double rate = input.nextDouble();

            System.out.println("intrest: " + balance * (rate/1200));
            
        }
    }
}
