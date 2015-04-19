
import java.util.Scanner;

public class pairs {

    static int[][] arr;
    static int n;

    static void setPair(int i, int j) {
        unsetColRow(i, j);
        arr[i][j] = 1;
    }

    static void unsetPair(int i, int j) {
        arr[i][j] = 2;
    }

    static void unsetColRow(int i, int j) {
        for (int k = 0; k < n; k++) {
            arr[i][k] = 2;
        }

        for (int k = 0; k < n; k++) {
            arr[k][j] = 2;
        }
    }

    static void checkArr() {
        checkRow();
        transpose();
        checkRow();
        transpose();
    }

    static void transpose() {
        int[][] newarr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newarr[i][j] = arr[j][i];
            }
        }
        arr = newarr;
    }

    static void checkRow() {
        for (int i = 0; i < n; i++) {
            int count = 0;
            int temp = -1;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    temp = j;
                    break;
                }
                if (arr[i][j] == 0) {
                    temp = j;
                }
                if (arr[i][j] == 2) {
                    count++;
                }
            }
            if (count == n - 1) {
                setPair(i, temp);
            }
        }
    }

    static void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    static boolean isOver() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        n = sin.nextInt();
        arr = new int[n][n];
        int l = sin.nextInt();
        for (int i = 0; i < l; i++) {            
            if (sin.next().charAt(0) == '#') {
                unsetPair(sin.nextInt() - 1, sin.nextInt() - 1);
            } else {
                setPair(sin.nextInt() - 1, sin.nextInt() - 1);
            }
        }
        while (!isOver()) {
            checkArr();
        }
        System.out.println("\nOUTPUT\n");
        print();
    }
}
