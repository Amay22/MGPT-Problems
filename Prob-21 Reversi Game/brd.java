
import java.util.Scanner;

public class brd {

    static int[][] arr = new int[10][10];
    static int turn = 3;

    static void init() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                arr[i][j] = 0;
            }
        }
        arr[4][4] = 2;
        arr[4][5] = 3;
        arr[5][4] = 3;
        arr[5][5] = 2;
    }

    static void print() {        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }        
    }

    static void putPiece(char ch1, char ch2) {
        if ((ch1 == '-') || (ch2 == '-')) {
            switchTurn();
            return;
        }

        int c = (int) ch1 - (int) 'a' + 1;
        int r = (int) ch2 - (int) '0';
        arr[r][c] = turn;
        checkLeft(r, c - 1);
        checkRight(r, c + 1);
        checkUp(r - 1, c);
        checkDown(r + 1, c);
        checkRightUp(r - 1, c + 1);
        checkRightDown(r + 1, c + 1);
        checkLeftUp(r - 1, c - 1);
        checkLeftDown(r + 1, c - 1);
        switchTurn();
    }

    static void switchTurn() {
        if (turn == 2) {
            turn = 3;
            return;
        }
        if (turn == 3) {
            turn = 2;
        }
    }

    static boolean checkLeft(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }

        if (checkLeft(r, c - 1)) {
            arr[r][c] = turn;
            return true;
        }

        return false;
    }

    static boolean checkRight(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }

        if (checkRight(r, c + 1)) {
            arr[r][c] = turn;
            return true;
        }

        return false;
    }

    static boolean checkUp(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }

        if (checkUp(r - 1, c)) {
            arr[r][c] = turn;
            return true;
        }

        return false;
    }

    static boolean checkDown(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }

        if (checkDown(r + 1, c)) {
            arr[r][c] = turn;
            return true;
        }
        return false;
    }

    static boolean checkLeftUp(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }
        if (checkLeftUp(r - 1, c - 1)) {
            arr[r][c] = turn;
            return true;
        }
        return false;
    }

    static boolean checkLeftDown(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }
        if (checkLeftDown(r + 1, c - 1)) {
            arr[r][c] = turn;
            return true;
        }
        return false;
    }

    static boolean checkRightUp(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }
        if (checkRightUp(r - 1, c + 1)) {
            arr[r][c] = turn;
            return true;
        }
        return false;
    }

    static boolean checkRightDown(int r, int c) {
        if (arr[r][c] < 2) {
            return false;
        }
        if (arr[r][c] == turn) {
            return true;
        }
        if (checkRightDown(r + 1, c + 1)) {
            arr[r][c] = turn;
            return true;
        }
        return false;
    }

    static void declareWinner() {
        int b = 0, w = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == 2) {
                    w++;
                }
                if (arr[i][j] == 3) {
                    b++;
                }
            }
        }
        int margin = Math.abs(w - b);
        if (w > b) {
            System.out.println("WHITE " + margin);
        }
        if (w < b) {
            System.out.println("BLACK " + margin);
        }
        if (w == b) {
            System.out.println("DRAW");
        }
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        init();
        int N = sin.nextInt();
        sin.nextLine();
        for (int i = 0; i < N; i++) { 
            String tmp = sin.nextLine();
            char ch1 = tmp.charAt(0);            
            char ch2 = tmp.charAt(1);
            putPiece(ch1, ch2);            
        }
        System.out.println("\nOUTPUT\n");
        declareWinner();
    }
}
