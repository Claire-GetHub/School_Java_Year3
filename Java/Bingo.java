

public class Bingo {
    
    public static void main(String[] args) {
        boolean[][] testMarked1 = {
            {true, false, false, true, false},
            {false, true, false, false, false},
            {false, false, true, false, false},
            {false, false, false, true, false},
            {false, false, false, false, true},
        };

        boolean[][] testMarked2 = {
            {false, false, false, false, false},
            {false, false, false, false, false},
            {true, true, true, true, true},
            {false, false, false, false, false},
            {false, false, false, false, false},
        };

        boolean[][] testMarked3 = {
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
        };
        // System.out.println(Arrays.deepToString(createBoard()));
        printBoard(createBoard(),testMarked1);
    }


    //Print board function
    public static void printBoard(int[][] board, boolean[][] marks){
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
            int[] randomNums = randomNonDupicateList(rowContraints[row][0], rowContraints[row][1]);
            for (int col = 0; col < board[0].length; col++) {
            
                board[col][row] = randomNums[col];
            }
        }

        board[2][2] = 0;
        return board;
    }

    public static int[][] createMarks() {
        int[][] marked = new int[5][5];
        marked[2][2] = 1;
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
        if (max - min < length - 1) {
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
