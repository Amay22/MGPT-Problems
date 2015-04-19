
import java.util.Scanner;

class direction {
    int dispR;
    int dispC;
    public direction(int r, int c) {
        dispR = r;
        dispC = c;
    }
}

class fish {

    static direction[] dir = new direction[8];
    static int R, C;
    int posR, posC;    
    private final int fishType;    

    public fish(int r, int c, int type) {
        posR = r;
        posC = c;
        fishType = type;
    }

    public static void initDir() {
        dir[0] = new direction(0, -1);
        dir[1] = new direction(-1, -1);
        dir[2] = new direction(-1, 0);
        dir[3] = new direction(-1, 1);
        dir[4] = new direction(0, 1);
        dir[5] = new direction(1, 1);
        dir[6] = new direction(1, 0);
        dir[7] = new direction(1, -1);
    }

    public static double dist(fish a, fish b) {
        double diffR = a.posR - b.posR;
        double diffC = a.posC - b.posC;
        double d = Math.sqrt(diffR * diffR + diffC * diffC);
        return d;
    }

    public boolean checkDist(fish other) {
        if ((posR == other.posR) && (posC == other.posC)) {
            return true;
        }
        double optiD = -1.0;
        int optiDir = -1;
        for (int i = 0; i < 8; i += fishType) {
            int tempR = posR + dir[i].dispR;
            if (tempR < 0 || tempR >= R) {
                continue;
            }
            int tempC = posC + dir[i].dispC;
            if (tempC < 0 || tempC >= C) {
                continue;
            }
            fish tempFish = new fish(tempR, tempC, 0);
            double d = dist(tempFish, other);
            if (optiD < 0) {
                optiD = d;
                optiDir = i;
            }
            if ((fishType == 1) && (d > optiD)) {
                optiD = d;
                optiDir = i;
            }
            if ((fishType == 2) && (d < optiD)) {
                optiD = d;
                optiDir = i;
            }
        }
        posR += dir[optiDir].dispR;
        posC += dir[optiDir].dispC;
        return (posR == other.posR) && (posC == other.posC);
    }
    public void printPos() {
        System.out.print(posR + " " + posC + " ");
    }
}

public class fishtank {

    public static void main(String[] args) throws Exception {
        final int FISH_DAVID = 1;
        final int FISH_GOLIATH = 2;
        fish.initDir();
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        fish.R = sin.nextInt();
        fish.C = sin.nextInt();
        fish D = new fish(sin.nextInt(), sin.nextInt(), FISH_DAVID);
        fish G = new fish(sin.nextInt(), sin.nextInt(), FISH_GOLIATH);
        int numSim = sin.nextInt();
        boolean caught = false;
        int i = 0;

        if (!((G.posR == D.posR) && (G.posC == D.posC))) {
            for (i = 1; i < numSim + 1; i++) {
                if (G.checkDist(D) || D.checkDist(G)) {
                    caught = true;
                    break;
                }
            }
        } else {
            caught = true;
        }
        System.out.println("\nOUTPUT\n");
        if (!caught) {
            D.printPos();
            G.printPos();
            System.out.println();
        } else {
            System.out.print(i + " ");
            D.printPos();
            System.out.println();
        }
    }
}
