
import java.util.Scanner;

class Pack {

    String str;
    int bulls,cows;

    Pack(String s, int b, int c) {
        str = s;
        bulls = b;
        cows = c;
    }

    boolean verify(String str2) {
        int bulls2 = 0;
        int cows2 = 0;
        String str1 = str;

        for (int i = 0; i < 4; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                bulls2++;
                str2 = delChar(str2, i);
                str1 = delChar(str1, i);
            }
        }

        for (int i = 0; i < 4; i++) {
            char ver = str1.charAt(i);
            int pos = str2.indexOf(ver);
            if (ver == '.') {
                pos = -1;
            }
            if (pos != -1) {
                cows2++;
                str2 = delChar(str2, pos);
                str1 = delChar(str1, i);
            }
        }
        return ((bulls == bulls2) && (cows == cows2));
    }

    String delChar(String str, int pos) {
        return (str.substring(0, pos) + "." + str.substring(pos + 1));
    }
}

public class bullscows {

    static int n;
    static Pack[] word;

    static void eval(String str) {
        boolean done = true;
        for (int i = 0; i < n; i++) {
            if (!word[i].verify(str)) {
                done = false;
            }
        }

        if (done) {
            System.out.println(str);
        }
    }

    static void recur(String str) {
        if (str.length() == 4) {
            eval(str);
            return;
        }

        for (int i = 0; i < 4; i++) {
            recur(str + ((char) (i + 'A')));
        }
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        n = sin.nextInt();
        word = new Pack[n];
        for (int i = 0; i < n; i++) {            
            word[i] = new Pack(sin.next(), sin.nextInt(), sin.nextInt());
        }
        System.out.println("\nOUTPUT\n");
        recur("");
    }
}
