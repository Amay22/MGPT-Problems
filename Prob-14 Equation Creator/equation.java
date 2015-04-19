
import java.util.Scanner;


public class equation {

    static int N;
    static int rhs;
    static int[] lhs;
    static boolean over = false;

    static char getOp(int a) {
        switch (a) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
        }
        return '.';
    }

    static void eval(String opList) {
        int[] arr = (int[]) lhs.clone();
        String ans = opList;

        while (opList.contains("-")) {
            int pos = opList.indexOf("-");
            arr[pos + 1] = -arr[pos + 1];
            opList = opList.substring(0, pos) + "+" + opList.substring(pos + 1);
        }

        while (opList.contains("*")) {
            int pos = opList.indexOf("*");
            arr[pos + 1] = arr[pos] * arr[pos + 1];
            arr[pos] = 0;
            opList = opList.substring(0, pos) + "+" + opList.substring(pos + 1);
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        if (sum == rhs) {
            System.out.println(ans);
        }
    }

    static void recur(String opList) {
        if (opList.length() > N - 2) {
            eval(opList);
            return;
        }

        for (int i = 0; i < 3; i++) {
            recur(opList + getOp(i));
        }
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        N = sin.nextInt()- 1;
        lhs = new int[N];
        for (int i = 0; i < N; i++) {
            lhs[i] = sin.nextInt();
        }
        rhs = sin.nextInt();
        System.out.println("\nOUTPUT\n");
        recur("");
    }
}
