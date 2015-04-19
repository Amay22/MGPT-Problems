
import java.util.Scanner;

class dfa {
    static int Q, A;
    static int[][] arr;
    static int[] F;
    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        Q = sin.nextInt();
        A = sin.nextInt();
        arr = new int[Q][A];
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < A; j++) {
                arr[i][j] = sin.nextInt() - 1;
            }
        }
        F = new int[sin.nextInt()];
        for (int i = 0; i < F.length; i++) {
            F[i] = sin.nextInt() - 1;
        }
        System.out.println("\nOUTPUT\n");
        int N = sin.nextInt();
        for (int i = 0; i < N; i++) {
            sin.nextInt();                        
            System.out.print(findMissing(sin.nextLine().trim()));
        }        
    }
    static char findMissing(String inp) {
        for (int i = 0; i < A; i++) {
            char c = (char) (i + 'a');
            if (finalState(inp.replace('?', c))) {
                return c;
            }
        }
        return ' ';
    }
    static boolean finalState(String inp) {
        int currentState = 0;
        for (int i = 0; i < inp.length(); i++) {
            int n = ((int) inp.charAt(i)) - 'a';
            currentState = arr[currentState][n];
        }
        for (int i = 0; i < F.length; i++) {
            if (F[i] == currentState) {
                return true;
            }
        }
        return false;
    }
}
