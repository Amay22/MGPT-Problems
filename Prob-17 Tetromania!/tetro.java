
import java.util.Scanner;

public class tetro {
    static int arr[][];
    static int R,C;
    static String str;
    private static void read() throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        sin.nextLine();
        str = sin.nextLine();
        R = sin.nextInt();
        C = sin.nextInt();
        arr = new int[R + 2][C + 2];
        for (int i = 0; i < R + 2; i++) {
            for (int j = 0; j < C + 2; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sin.nextInt();
            }
        }
    }

    private static void rotate() {
        int[][] temp = new int[C + 2][R + 2];
        for (int i = 0; i < R + 2; i++) {
            for (int j = 0; j < C + 2; j++) {
                temp[j][i] = arr[i][C + 2 - j - 1];
            }
        }

        arr = temp;
        int t = C;
        C = R;
        R = t;
    }

    private static void delete(char c) {
        int pos = str.indexOf(c);
        if (pos == -1) {
            return;
        }
        str = str.substring(0, pos) + str.substring(pos + 1);
        change(2, 1);
    }

    private static void change(int a, int b) {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == a) {
                    arr[i][j] = b;
                }
            }
        }
    }

    private static void checkChar(String code) {
        if (code.equals("EEE")) {
            delete('I');
        }
        if (code.equals("SEE")) {
            delete('J');
        }
        if (code.equals("SSE")) {
            delete('L');
        }
        if (code.equals("ES")) {
            delete('T');
        }
        if (code.equals("SES")) {
            delete('S');
        }
        if (code.equals("ESE")) {
            delete('Z');
        }
        if (code.equals("ESW")) {
            delete('O');
        }
        change(2, 0);
    }

    private static String getCode(int i, int j) {
        arr[i][j] = 2;
        if (arr[i][j + 1] == 0) {
            return "E" + getCode(i, j + 1);
        }
        if (arr[i + 1][j] == 0) {
            return "S" + getCode(i + 1, j);
        }
        if (arr[i][j - 1] == 0) {
            return "W" + getCode(i, j - 1);
        }
        if (arr[i - 1][j] == 0) {
            return "N" + getCode(i - 1, j);
        }
        return "";
    }

    private static void findAndDelete() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == 0) {
                    checkChar(getCode(i, j));
                }
            }
        }
    }

    public static void main(String args[]) throws Exception {
        read();
        for (int i = 0; i < 4; i++) {
            findAndDelete();
            rotate();
        }        
        System.out.println("\nOUTPUT\n"+str);
    }
}
