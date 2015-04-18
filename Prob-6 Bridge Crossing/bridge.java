
import java.util.Scanner;

class bridge {

    final static int N = 5;
    static int minTime = 10000 ,time[] = new int[N];
    static boolean chk[] = new boolean[N];

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        for (int i = 0; i < N; i++) {            
            sin.next();
            time[i] = sin.nextInt();
        }
        cross(0);
        System.out.println("\nOUTPUT\n");
        System.out.println(minTime);
    }

    static boolean isOver() {
        for (int i = 0; i < N; i++) {
            if (!chk[i]) {
                return false;
            }
        }
        return true;
    }

    static void cross(int totalTime) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if ((!chk[i]) && (!chk[j])) {
                    chk[i] = true;
                    chk[j] = true;
                    goBack(totalTime + Math.max(time[i], time[j]));
                    chk[i] = false;
                    chk[j] = false;
                }
            }
        }
    }

    static void goBack(int totalTime) {
        if (isOver()) {
            minTime = Math.min(minTime, totalTime);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (chk[i]) {
                chk[i] = false;
                cross(totalTime + time[i]);
                chk[i] = true;
            }
        }
    }
}
