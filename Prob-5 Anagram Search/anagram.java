
import java.util.Scanner;

public class anagram {

    static char[][] cross;
    static int R, C, count = 0;
    static String word;

    static void readInp() throws Exception {
        Scanner sin = new Scanner(System.in);
        word = sin.next();

        R = sin.nextInt();
        C = sin.nextInt();
        cross = new char[R + 2][C + 2];

        for (int i = 0; i < R + 2; i++) {
            for (int j = 0; j < C + 2; j++) {
                cross[i][j] = '#';
            }
        }
        sin.nextLine();
        for (int i = 1; i <= R; i++) {
            String tmp = sin.nextLine();
            for (int j = 1; j <= C; j++) {
                cross[i][j] = tmp.charAt(j - 1);
            }
        }
    }

    static void analyze() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if ((cross[i][j] != '#') && (cross[i - 1][j] == '#') && (cross[i + 1][j] != '#')) {
                    String str = seperate(i, j);
                    if (ifMatch(str)) {
                        count++;
                    }
                }
            }
        }
    }

    static String seperate(int i, int j) {
        String temp = new String();
        while (cross[i][j] != '#') {
            temp += cross[i][j];
            i++;
        }
        return temp;
    }

    static boolean ifMatch(String a) {
        if (a.length() != word.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            int pos = a.indexOf("" + word.charAt(i));
            if (pos == -1) {
                return false;
            }
            a = a.substring(0, pos) + a.substring(pos + 1);
        }
        if (a.length() > 0) {
            return false;
        }
        return true;
    }

    static void transpose() {
        int tempInt;
        tempInt = R;
        R = C;
        C = tempInt;
        char[][] tempArr = new char[R + 2][C + 2];
        for (int i = 0; i < R + 2; i++) {
            for (int j = 0; j < C + 2; j++) {
                tempArr[i][j] = cross[j][i];
            }
        }
        cross = tempArr;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");
        readInp();
        analyze();
        transpose();
        analyze();
        System.out.println("\nOUTPUT\n");
        System.out.println(count);
    }

}
