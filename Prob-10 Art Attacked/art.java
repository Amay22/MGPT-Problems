
import java.util.Scanner;

class camera {

    private static int currentState = 0 ,centre , M;

    static void setCentre(int a) {
        M = a;
        centre = M / 2;
    }

    static boolean ifSeen(int r, int c) {
        boolean val = false;
        switch (currentState) {
            case 0:
                if ((r <= centre) && (c == centre)) {
                    val = true;
                }
                break;
            case 1:
                if ((r <= centre) && (c == (M - r))) {
                    val = true;
                }
                break;
            case 2:
                if ((r == centre) && (c >= centre)) {
                    val = true;
                }
                break;
            case 3:
                if ((r >= centre) && (c == r)) {
                    val = true;
                }
                break;
            case 4:
                if ((r >= centre) && (c == centre)) {
                    val = true;
                }
                break;
            case 5:
                if ((r >= centre) && (c == (M - r))) {
                    val = true;
                }
                break;
            case 6:
                if ((r == centre) && (c <= centre)) {
                    val = true;
                }
                break;
            case 7:
                if ((r <= centre) && (c == r)) {
                    val = true;
                }
                break;
        }
        currentState = (currentState + 1) % 8;
        return val;
    }

}

public class art {

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        camera.setCentre(sin.nextInt());
        int i, n = sin.nextInt();
        for (i = 0; i < n; i++) {
            int r = sin.nextInt();
            int c = sin.nextInt();
            if (camera.ifSeen(r, c)) {
                System.out.println("\nOUTPUT\n");
                System.out.println(r + " " + c);
                System.exit(0);
            }
        }
        if (i == n) {
            System.out.println("\nOUTPUT\n");
            System.out.println("DONE");
        }
    }

}
