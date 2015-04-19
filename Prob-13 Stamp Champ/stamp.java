
import java.util.Scanner;

class office {
    static int[] arr;
    static boolean[] chk;
    static int limit, count = 0;
    public static void initArr(int l) {
        limit = l;
        arr = new int[limit];
    }

    public static void nextVal(int val) {
        arr[count++] = val;
    }

    static void find(int amt, int k) {

        if ((count > 0) && (k > count)) {
            return;
        }

        if (amt < 0) {
            return;
        }

        if (amt == 0) {
            if ((count < 0) || (k < count)) {
                count = k;
            }
            return;
        }

        for (int i = limit - 1; i >= 0; i--) {
            find(amt - arr[i], k + 1);
        }
    }
}

public class stamp {

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        office.initArr(sin.nextInt());
        for (int i = 0; i < office.limit; i++) {
            office.nextVal(sin.nextInt());
        }

        int n = sin.nextInt();
        int totalStamps = 0;

        for (int i = 0; i < n; i++) {
            office.count = -1;
            office.find(sin.nextInt(), 0);            
            totalStamps += office.count;
        }
        System.out.println("\nOUTPUT\n");
        System.out.println(totalStamps);
    }
}
