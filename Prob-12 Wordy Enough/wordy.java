
import java.util.Scanner;

public class wordy {

    static int numWords;
    static String lett;
    static String[] wrd;
    static boolean chk[];
    static int maxWords = 0;
    static int loopCount = 0;

    static void readInp() throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        numWords = sin.nextInt();
        wrd = new String[numWords];
        chk = new boolean[numWords];
        for (int i = 0; i < numWords; i++) {            
            wrd[i] = sin.next();
            chk[i] = true;
        }
        sin.nextInt();
        sin.nextLine();
        lett = sin.nextLine();
    }

    static void sortWords() {
        for (int i = 0; i < numWords - 1; i++) {
            for (int j = i + 1; j < numWords; j++) {
                if (wrd[i].length() > wrd[j].length()) {
                    String temp = wrd[i];
                    wrd[i] = wrd[j];
                    wrd[j] = temp;
                }
            }
        }
    }

    static boolean ifRemPos(int n) {
        String str = wrd[n];
        String temp = lett;
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            int pos = temp.indexOf(ch);
            if (pos == -1) {
                return false;
            }
            temp = temp.substring(0, pos) + temp.substring(pos + 1);
        }
        return true;
    }

    static void remWord(int n) {
        String str = wrd[n];
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            int pos = lett.indexOf(ch);
            lett = lett.substring(0, pos) + lett.substring(pos + 1);
        }        
    }

    static void find(int n, int count) {
        loopCount++;
        if (loopCount > 1000) {
            return;
        }
        if (count > maxWords) {
            maxWords = count;
            loopCount = 0;
        }
        for (int i = 0; i < numWords; i++) {
            if (chk[i] && ifRemPos(i)) {
                remWord(i);
                chk[i] = false;
                find(i, count + 1);
                chk[i] = true;
                lett += wrd[i];
            }
        }
    }

    public static void main(String[] args) throws Exception {
        readInp();
        sortWords();
        for (int i = 0; i < numWords; i++) {
            find(i, 0);
        }
        System.out.println("\nOUTPUT\n");
        System.out.println(maxWords);
    }
}
