
import java.util.Scanner;

public class four {

    static int[][] board = new int[6][7];
    static int[] count = new int[7];

    static int getCount(int i) {
        count[i]++;
        return (count[i] - 1);
    }

    static void initBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = 0;
            }
        }

        for (int i = 0; i < 7; i++) {
            count[i] = 0;
        }
    }

    static int checkWin() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] > 0) {
                    int temp = board[i][j];                    
                    if (i >= 3) {
                        if ((board[i - 1][j] == temp) && (board[i - 2][j] == temp) && (board[i - 3][j] == temp)) {
                            return temp;
                        }
                    }

                    if (j >= 3) {
                        if ((board[i][j - 1] == temp) && (board[i][j - 2] == temp) && (board[i][j - 3] == temp)) {
                            return temp;
                        }
                    }

                    if ((i >= 3) && (j >= 3)) {
                        if ((board[i - 1][j - 1] == temp) && (board[i - 2][j - 2] == temp) && (board[i - 3][j - 3] == temp)) {
                            return temp;
                        }
                    }

                    if ((i >= 3) && (j < 4)) {
                        if ((board[i - 1][j + 1] == temp) && (board[i - 2][j + 2] == temp) && (board[i - 3][j + 3] == temp)) {
                            return temp;
                        }
                    }
                }
            }
        }
        return 0;
    }

    static void printBoard() {
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == 0) {
                    System.out.print("  ");
                } else if (board[i][j] == 1) {
                    System.out.print("Y ");
                } else if (board[i][j] == 2) {
                    System.out.print("R ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static String getWinner(int i) {
        if (i == 1) {
            return "Yellow";
        }
        if (i == 2) {
            return "Red";
        }
        return "HAHA";
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        initBoard();
        int pl = 0;
        int winner = 0;
        for (int i = 1; i <= 42; i++) {
            int n = sin.nextInt();
            n--;
            board[getCount(n)][n] = pl + 1;
            winner = checkWin();
            if (winner != 0) {
                System.out.println("\nOUTPUT\n");
                System.out.println(getWinner(winner) + " " + i);                
                System.exit(0);
            }
            pl = (pl + 1) % 2;
        }        
        if (winner == 0) {
            System.out.println("\nOUTPUT\n");
            System.out.println("Draw");
        }
    }
}
