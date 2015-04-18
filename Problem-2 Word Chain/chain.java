
import java.util.Scanner;

public class chain {

    static int n , resultCount;
    static String[] str,result;
    static boolean[] chk;
    static boolean over;

    private static void read() throws Exception {
        Scanner sin = new Scanner(System.in);
        n = sin.nextInt();
        str = new String[n];
        result = new String[n];
        chk = new boolean[n];
        sin.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = sin.nextLine();
            chk[i] = false;
        }
    }

    private static boolean overlap(String a, String b) {
        int l = Math.min(a.length(), b.length());
        for (int i = 3; i <= l; i++) {
            String temp1 = a.substring(a.length() - i);
            String temp2 = b.substring(0, i);
            if (temp1.equals(temp2)) {
                return true;
            }
        }
        return false;
    }

    private static void link() {
        if (over) {
            return;
        }
        if (resultCount == n) {
            over = true;
            return;
        }

        for (int i = 0; i < n; i++) {
            if ((!chk[i]) && (overlap(result[resultCount - 1], str[i]))) {
                chk[i] = true;
                result[resultCount++] = str[i];
                link();
                resultCount--;
                chk[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");
        read();
        result[0] = str[0];
        chk[0] = true;
        resultCount++;
        link();
        System.out.println("\nOUTPUT\n");
        if (over) {
            for (int i = 0; i < n; i++) {
                System.out.println(result[i]);
            }
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
