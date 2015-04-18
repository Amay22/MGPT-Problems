
import java.util.Scanner;

class Locust {

    int posR, posC, strength,simStart;
    boolean killed;
    char dir;

    public Locust(int r, int c, int s, char ch) {
        posR = r;
        posC = c;
        simStart = s;
        dir = ch;
        killed = false;
        strength = 0;
    }

    private void move() {
        if (ifAlive()) {
            strength += Farm.infest(posR, posC);
        }
        switch (dir) {
            case 'A':
                posR -= 1;
                posC -= 1;
                break;
            case 'B':
                posR -= 1;
                break;
            case 'C':
                posR -= 1;
                posC += 1;
                break;
            case 'D':
                posC -= 1;
                break;
            case 'E':
                posC += 1;
                break;
            case 'F':
                posR += 1;
                posC -= 1;
                break;
            case 'G':
                posR += 1;
                break;
            case 'H':
                posR += 1;
                posC += 1;
                break;
            default:
                System.out.println("Direction not assigned");
                break;
        }
        if (ifAlive()) {
            strength += Farm.infest(posR, posC);
        }
    }

    public boolean ifAlive() {
        if (attack.currentSim < (simStart - 1)) {
            return false;
        }
        return !ifKilled();
    }

    public boolean ifKilled() {
        if (killed) {
            return true;
        }
        killed = !((posR >= 0) && (posR < Farm.R) && (posC >= 0) && (posC < Farm.C));
        return killed;
    }

    public void sim() {
        if (ifAlive()) {
            move();
        }
    }

    public void compare(Locust other) {
        if (!ifAlive()) {
            return;
        }
        if (!other.ifAlive()) {
            return;
        }
        if ((posR == other.posR) && (posC == other.posC)) {
            if (strength > other.strength) {
                other.kill();
            }
            if (other.strength > strength) {
                kill();
            }
        }
    }

    public void kill() {
        killed = true;
    }
}

class Farm {

    static int R;
    static int C;
    static int[][] crop;

    public static void initFarm(int r, int c) {
        R = r;
        C = c;
        crop = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                crop[i][j] = 1;
            }
        }
    }

    public static int infest(int r, int c) {
        int temp = crop[r][c];
        crop[r][c] = 0;
        return temp;
    }

    public static int cropLeft() {
        int cropSum = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                cropSum += crop[i][j];
            }
        }
        return cropSum;
    }
}

public class attack {

    static int numSims;
    static int currentSim;
    static Locust[] locust;
    static int numLoc;

    static void readInp()throws Exception {
        Scanner sin = new Scanner(System.in);

        Farm.initFarm(sin.nextInt(), sin.nextInt());

        numSims = sin.nextInt();
        numLoc = sin.nextInt();
        locust = new Locust[numLoc];

        for (int i = 0; i < numLoc; i++) {
            int r = sin.nextInt();
            int c = sin.nextInt();
            int s = sin.nextInt();            
            char ch = sin.next().charAt(0);
            locust[i] = new Locust(r, c, s, ch);
        }
    }

    static void conflict() {
        for (int i = 0; i < numLoc - 1; i++) {
            for (int j = i + 1; j < numLoc; j++) {
                locust[i].compare(locust[j]);
            }
        }

    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        readInp();
        for (currentSim = 0; currentSim < numSims; currentSim++) {
            conflict();
            for (int i = 0; i < numLoc; i++) {
                locust[i].sim();
            }
            conflict();
        }

        int locCount = 0;
        for (int i = 0; i < numLoc; i++) {
            if (locust[i].ifAlive()) {
                locCount++;
            }
        }
        System.out.println("\nOUTPUT\n");
        System.out.println(Farm.cropLeft() + " " + locCount);
    }

}
