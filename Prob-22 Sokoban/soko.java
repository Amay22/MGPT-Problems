
import java.util.Scanner;

public class soko {

    static int R, C, destR, destC;
    static int[][] arr;

    static void read()throws Exception {
        Scanner sin = new Scanner(System.in);
        R = sin.nextInt();
        C = sin.nextInt();
        arr = new int[R + 2][C + 2];
        for (int i = 0; i < R + 2; i++) {
            for (int j = 0; j < C + 2; j++) {
                arr[i][j] = -1;
            }
        }
        sin.nextLine();
        for (int i = 1; i <= R; i++) {
            String tmp = sin.nextLine();
            for (int j = 1; j <= C; j++) {                
                char ch = tmp.charAt(j-1);
                switch (ch) {
                    case '#':
                        arr[i][j] = -1;
                        break;
                    case 'B':
                        arr[i][j] = 1;
                        break;
                    case 'D':
                        destR = i;
                        destC = j;
                    default:
                        arr[i][j] = 0;
                }
            }
        }
    }

    static void print() {
        for (int i = 0; i < R + 2; i++) {
            for (int j = 0; j < C + 2; j++) {
                if (arr[i][j] == -1) {
                    System.out.print("# ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void updateHorz(int r, int c) {
        if (arr[r][c] < 1) {
            return;
        }
        if (arr[r - 1][c] == -1) {
            return;
        }
        if (arr[r + 1][c] == -1) {
            return;
        }

        if ((arr[r][c] <= arr[r - 1][c]) || (arr[r - 1][c] == 0)) {
            arr[r - 1][c] = arr[r][c] + 1;
        }
        if ((arr[r][c] <= arr[r + 1][c]) || (arr[r + 1][c] == 0)) {
            arr[r + 1][c] = arr[r][c] + 1;
        }
    }

    static void updateVert(int r, int c) {
        if (arr[r][c] < 1) {
            return;
        }
        if (arr[r][c - 1] == -1) {
            return;
        }
        if (arr[r][c + 1] == -1) {
            return;
        }

        if ((arr[r][c] <= arr[r][c - 1]) || (arr[r][c - 1] == 0)) {
            arr[r][c - 1] = arr[r][c] + 1;
        }
        if ((arr[r][c] <= arr[r][c + 1]) || (arr[r][c + 1] == 0)) {
            arr[r][c + 1] = arr[r][c] + 1;
        }
    }

    static void flood() {
        int MAX = Math.max(R, C) + 2;

        for (int k = 0; k <= MAX; k++) {
            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    if (arr[i][j] > 0) {
                        updateVert(i, j);
                        updateHorz(i, j);
                    }
                }
            }
        }
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");        
        read();
        flood();
        System.out.println("\nOUTPUT\n");
        System.out.println(arr[destR][destC] - 1);        
    }
}
