
import java.util.Scanner;

class Term {

    double c, i;

    Term(int a, int b) {
        c = a;
        i = b;
    }

    double getSpeed(int t) {
        if ((int) c == 0) {
            return 0;
        } else {
            return c * Math.pow(t, i);
        }
    }

    double getAccel(int t) {
        if ((int) (c * i) == 0) {
            return 0;
        } else {
            return c * i * Math.pow(t, i - 1);
        }
    }

    double getDisp(int t) {
        if ((int) c == 0) {
            return 0;
        } else {
            return (c * Math.pow(t, i + 1)) / (i + 1);
        }
    }
}

class asd {

    static int N;
    static Term[] arr;

    static void print(int t) {        
        int d = 0,s = 0, a = 0;
        for (int i = 0; i < N; i++) {
            d += arr[i].getDisp(t);
            s += arr[i].getSpeed(t);
            a += arr[i].getAccel(t);
        }
        System.out.println((int) d + " " + (int) s + " " + (int) a);
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        N = sin.nextInt();
        arr = new Term[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Term(sin.nextInt(), sin.nextInt());
        }
        System.out.println("\nOUTPUT\n");
        while (true) {
            int t = sin.nextInt();
            if (t == -1) {
                break;
            }
            print(t);
        }
    }
}
