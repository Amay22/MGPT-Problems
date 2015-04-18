
import java.util.Scanner;
public class crossword {

    static char[][] cross;
    static int R, C, numWords;
    static String[] word;

    static void readInp() throws Exception {
        Scanner sin = new Scanner(System.in);
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
                cross[i][j] = tmp.charAt(j-1);                   
            }
        }
        numWords = sin.nextInt();
        word = new String[numWords];
       
        for (int i = 0; i < numWords; i++) {            
            word[i] = sin.next();              
        }
    }

    static void analyze() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if ((cross[i][j] != '#') && (cross[i - 1][j] == '#') && (cross[i + 1][j] != '#')) {
                    String str = seperate(i, j);
                    matchString(i, j, str);
                }
            }
        }
    }

    static void fitString(int i, int j, String temp) {
        for (int k = 0; k < temp.length(); k++) {
            cross[i + k][j] = temp.charAt(k);
        }
    }

    static void matchString(int a, int b, String str) {
        int count = 0;
        String temp = new String();
        for (int i = 0; i < numWords; i++) {
            if (ifMatch(str, word[i])) {
                temp = word[i];
                count++;
            }
        }
        if (count == 1) {
            fitString(a, b, temp);
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

    static boolean isFull() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (cross[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static void printCross() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
    }

    static boolean ifMatch(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) != '-') && (a.charAt(i) != b.charAt(i))) {
                return false;
            }
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
        while (!isFull()) {
            analyze();
            transpose();
            analyze();
            transpose();
        }
        System.out.println("\nOUTPUT\n");
        printCross();
    }
}
