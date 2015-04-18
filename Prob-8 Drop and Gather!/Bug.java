
import java.util.Scanner;

class grid {

    static int[][] arr = new int[10][10];

    static void initGrid() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = 0;
            }
        }
    }

    static void remNeg() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] < 0) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}

class direction{
    static int  dispR, dispC;
    public direction(int r , int c){
        dispR = r;
        dispC = c;
    }
}


class insect {

    private final int pherom;
    private int count, posR, posC;
    String seq;
    private boolean inGrid;
    private static direction[] dir = new direction[4];

    private static direction getDir(char a) {
        direction retDir;
        switch (a) {
            case 'W':
                retDir = new direction(0, -1);
                break;
            case 'N':
                retDir = new direction(-1, 0);
                break;
            case 'E':
                retDir = new direction(0, 1);
                break;
            case 'S':
                retDir = new direction(1, 0);
                break;
            default:
                retDir = new direction(0, 0);
                break;
        }
        return (retDir);
    }

    public insect(int r, int c, char a) {
        count = 0;
        inGrid = true;
        posR = r;
        posC = c;
        if (a == 'D') {
            pherom = 1;
        } else {
            pherom = -1;
        }
    }

    public void sim() {
        if (!inGrid) {
            return;
        }
        char temp = seq.charAt(count);
        direction tempDir = getDir(temp);
        posR += tempDir.dispR;
        if ((posR < 0) || (posR >= 10)) {
            inGrid = false;
            return;
        }
        posC += tempDir.dispC;
        if ((posC < 0) || (posC >= 10)) {
            inGrid = false;
            return;
        }
        count = (count + 1) % (seq.length());
        grid.arr[posR][posC] += pherom;
    }

    public void printPos() {
        System.out.println(posR + " " + posC);
    }
}

public class Bug {

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        grid.initGrid();
        int num = sin.nextInt();
        insect[] bug = new insect[num];

        for (int i = 0; i < num; i++) {
            sin.nextInt();            
            char type = sin.next().charAt(0);
            int r = sin.nextInt();
            int c = sin.nextInt();            
            bug[i] = new insect(r, c, type);            
            bug[i].seq = sin.next();            
        }
        int numSim = sin.nextInt();
        for (int i = 0; i < numSim; i++) {
            for (int j = 0; j < num; j++) {
                bug[j].sim();
            }
            grid.remNeg();
        }
        System.out.println("\nOUTPUT\n");
        System.out.println(grid.arr[sin.nextInt()][sin.nextInt()]);        
    }
}
