import java.util.Scanner;


public class pearsonHelp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int[] monthdays = new int[]{31,28,31,30,31,30,31,30,31,30,31,30};
        // String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // System.out.print("Enter a year: ");
        // int year = input.nextInt();
        // System.out.print("Enter a month: ");
        // String month = input.next();


        // int days = (month.equals("Feb") && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0))? 29: -1;
        // boolean flag = false;

        // for(int i = 0; i < months.length; i++) {
        //     if (month.equals(months[i])) {
        //         if (days < 0) {
        //             days = monthdays[i];
        //         }
        //         flag = true;
        //         break;
        //     }
        // }

        // if (!flag) {
        //     System.out.printf("%s is not a correct month name", month);
        // } else {
        //     System.out.printf("%s %d has %d days", month, year, days);
        // }



        // int n = 4;
        // for (int i = 1; i < n + 1; i++) {
        //     String num = "";
        //     for (int j = 0; j < i; j++) {
        //         num += i; 
        //     }
        //     System.out.printf("%" + n + "s %n", num);
        // }
        // for (int i = 0; i < 10; i++) 
        //     for (int j = 0; j < i; j++) 
        //         System.out.println(i * j);


        // double amount = input.nextDouble();
        // int years = input.nextInt();
        // System.out.println("| Interest Rate  | Monthly Payment | Total Payment |");
        // for(double i = 5.0; i <= 8.0; i += 1/8.0) {
        //     double total = amount * (1 + i/10);
        //     double monthly;

        // boolean[] nums = new boolean[11];
        // int distinctIntsAmount = 0;
        // String distinctInts = "";
        // for(int i = 0; i < nums.length; i++) {
        //     int num = input.nextInt();
        //     if(nums[num]) continue;
        //     distinctIntsAmount += 1;
        //     distinctInts += " " + num;
        //     nums[num] = true;
            
        // }

        // System.out.printf("The number of distinct integers is %d", distinctIntsAmount);
        // System.out.print("The distinct integers are" + distinctInts);

        // int[][] arr = {
        //     {1,2,3},
        //     {1,2,3},
        //     {1,2,3}
        // };
        // int rows = arr.length;
        // int cols = arr[0].length;
        // int[][] transposedArr = new int[cols][rows];
        // // assign arr[j][i] to transposedArr[i][j]
        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr.length; j++) {
        //         transposedArr[j][i] = arr[i][j];
        //     }
        // }
        

        // System.out.println(Arrays.deepToString(transposedArr));

        // new int[3][]
        // rows initialized 
        // {
        //     null,
        //     null,
        //     null
        // }


        // new int[3][3]
        // or
        // a = new int[3][]
        // a[0] = new int[3]
        // colums initialized
        // {
        //     {0, 0, 0},
        //     {0, 0, 0},
        //     {0, 0, 0}
        // }

    // int row = input.nextInt();
    // int col = input.nextInt();
    // double[][] a = new double[row][col];

    // for(int r = 0; r < row; r++) {
    //   for(int c = 0; c < col; c++) {
    //     a[r][c] = input.nextDouble();
    //   }
    // }

    // System.err.println(Arrays.deepToString(a));
        
    // String s1 = "Welcome to Java"; 

    // String s2 = "Welcome to Java"; 
    // int i = s1.length();
    // System.out.println("s1 == s2 is " + s1 == s2);



  }
}


// public class pearsonHelp {
//   static int cat;

//   public pearsonHelp() {
//     cat += 6;
//   }
// }

// import java.util.Arrays;

// public class Artist {}

// public class pearsonHelp {
//     private String trackName;
//     private boolean available;
//     private int rating;
//     private Artist artist;
//     private String[] genres;

//     public boolean setTrackName(String trackName) {
//         if (!trackName.equals("") && trackName != null) {
//             this.trackName = trackName;
//             return true;
//         }
//         return false;  
//     }

//     public String getTrackName() {
//         return trackName;
//     }

//     public boolean setAvailable(boolean available) {
//         if (available != null) {
//             this.available = available;
//             return true;
//         }
//         return false;

//     }

//     public boolean isAvailable() {
//         return available;
//     }

//     public boolean setRating(int rating) {
//         if (rating <= 5 && rating >= 1) {
//             this.rating = rating;
//             return true;
//         }
//         return false;
//     }

//     public int getRating() {
//         return rating;
//     }

//     public boolean setArtist(Artist artist) {
//         if (genres != null) {
//             this.artist = artist;
//             return true;
//         }
//         return false;

//     }

//     public Artist getArtist() {
//         return this.artist.copy();
//     }

//     public boolean setGenres(String[] genres) {
//         if (genres != null) {
//             this.genres = Arrays.copyOf(genres, genres.length);
//             return true;
//         }
//         return false;
//     }

//     public String[] getGenres() {
//         if (genres != null) {
//             return Arrays.copyOf(genres, genres.length);
//         }
//         return null;
//     }
// }

