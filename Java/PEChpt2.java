import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class PEChpt2 {
    public static void main(String[] args) {
        pointEight();
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

            //this line is broken
            int hour = calendar.get(Calendar.HOUR_OF_DAY) + offset + (12);
            int minutes = calendar.get(Calendar.MINUTE);
            int seconds = calendar.get(Calendar.SECOND);
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("current time: " + hour + ":" + minutes + ":" + seconds);
        }
    }
}