import java.util.Scanner;

public class Bingo {
    
    public static void main(String[] args) {
        int[] calledNumbers = randomNonDupicateList(1, 75, 75);


        Scanner input = new Scanner(System.in);
        System.out.print("player amount: ");
        int playerAmount = input.nextInt();
        boolean[] winners = new boolean[playerAmount];
        boolean won = false;

        input.nextLine();
        int[][][] boards = new int[playerAmount][][];
        boolean[][][] marks = new boolean[playerAmount][][];

        System.out.println("starting boards");
        for (int player = 0; player < playerAmount; player++) {
            boards[player] = createBoard();
            marks[player] = createMarks();

            System.out.println("player " + (player + 1));
            printBoard(boards[player], marks[player]);
        }
        input.nextLine();

        for (int i = 0; i < calledNumbers.length; i++) {
            System.out.println("round " + (i + 1));
            for (int player = 0; player < playerAmount; player++) {
                System.out.println("player " + (player + 1));
                newMarks(boards[player], marks[player], calledNumbers[i]);
                printBoard(boards[player], marks[player]);

                if (checkWin(marks[player])) {
                    winners[player] = true;
                }
            }
            System.out.println(calledNumbers[i] + " was called!\n");
            
            input.nextLine();
            for (int player = 0; player < winners.length; player++) {
                if (winners[player]) {
                    won = true;
                    System.out.println("player " + (player + 1) + " won!");
                    System.out.println("THE WINNING BOARD");
                    printBoard(boards[player], marks[player]);
                    System.out.println();
                }
            }

            if(won) {
                System.out.println((i + 1) + " numbers were called");
                break;
            }
        }
    }


    //Print board function
    public static void printBoard(int[][] board, boolean[][] marks){

        System.out.println("+----+----+----+----+----+");
        System.out.println("|  B |  I |  N |  G |  O |");
        System.out.println("+----+----+----+----+----+");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if(marks[row][col]) {
                    System.out.printf("| >< ");
                } else {
                    // board[row][col]
                    System.out.printf("| %02d ", board[row][col]);
                }
            }
        System.out.println("|");
        System.out.println("+----+----+----+----+----+");
        }
    }
    //^^ Print board function


    //Create board functions
    public static int[][] createBoard() {
        int[][] rowContraints = {{1, 15}, {16, 30}, {31, 45}, {46, 60}, {61, 75}};
        int[][] board = new int[5][5];


        for (int row = 0; row < board.length; row++) {
            int[] randomNums = randomNonDupicateList(rowContraints[row][1], rowContraints[row][0]);
            for (int col = 0; col < board[0].length; col++) {
                board[col][row] = randomNums[col];
            }
        }

        board[2][2] = 0;
        return board;
    }

    public static boolean[][] createMarks() {
        boolean[][] marked = new boolean[5][5];
        marked[2][2] = true;
        return marked;
    }


    public static boolean [][] newMarks(int[][] board, boolean[][] marks, int num) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == num) {
                    marks[row][col] = true;
                    break;
                } 
            }
            
        }
        return marks;
    }

    public static int[] randomNonDupicateList (int min, int max) {
        return randomNonDupicateList (min, max, 5);
    }

    public static int[] randomNonDupicateList (int min, int max, int length) {
        int[] usedNums = new int[length];
        int num;

        //Check that the diffference is > length. Otherwise funtion would run forever.
        if (max - min > length - 1) {
            return usedNums;
        }
        

        for (int i = 0; i < usedNums.length; i++) {
                
            do {
                num = (int)(Math.random() * (max - min + 1)) + min;

            } while(!intInArray(num, usedNums));
            usedNums[i] = num;
        }       
        

        return usedNums;
    }

    public static boolean intInArray (int num, int[] array) {
        boolean check = true;
        for (int n : array) {
            if ( n == num) {
                check = false;
                break;
            }
        }

        return check;
    }
    //^^ Create board functions

    //Check win function
    public static boolean checkWin(boolean[][] marked) {
        boolean win = false;
        int colCount = 0;
        int diagonalCount = 0;

        for (int i = 0; i < marked.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < marked[0].length; j++) {
                
                //Check rows
                if (marked[i][j]) {
                    rowCount++;
                } else {
                    rowCount = 0;
                }

                //check columns
                if (marked[j][i]) {
                    colCount++;
                } else {
                    colCount = 0;
                }

                //check diagonals
                if (j == i) {
                    if(marked[i][j]) {
                        diagonalCount++;
                    } else {
                        diagonalCount = 0;
                    }
                }

                
                if(rowCount == 5 || colCount == 5 || diagonalCount == 5) {
                    win = true;
                    break;
            
                }
            }
        }

        return win;
    }
    //^^ Check win function
    

}
