import java.util.Scanner;
class cell {
    int dispR, dispC;
    public cell(int r, int c) {
        dispR = r;
        dispC = c;
    }
}

class player {
    private static int goldR ,goldC;
    private int posR, posC;
    public static void setGold(int r, int c) {
        goldR = r;
        goldC = c;
    }
    public player(int r, int c) {
        posR = r;
        posC = c;
    }
    public boolean isLucky() {
        return (posR == goldR) && (posC == goldC);
    }

    public void displace() {
        cell d = maze.arr[posR][posC];
        posR = (posR + d.dispR + maze.R) % (maze.R);
        posC = (posC + d.dispC + maze.C) % (maze.C);
    }
}

class maze {

    static cell[][] arr;
    static int R , C;
    private static int numPlayer;
    private static player[] pl;

    public static void read()throws Exception {
        Scanner sin = new Scanner(System.in);
        R = sin.nextInt();
        C = sin.nextInt();
        arr = new cell[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                char type = sin.next().charAt(0);
                if (type == 'D') {
                    arr[i][j] = new cell(sin.nextInt(), sin.nextInt());
                }
                if (type == 'G') {
                    player.setGold(i, j);
                }
            }
        }
        numPlayer = sin.nextInt();
        pl = new player[numPlayer];
        for (int i = 0; i < numPlayer; i++) {
            sin.nextInt();
            pl[i] = new player(sin.nextInt(), sin.nextInt());
        }
    }

    public static boolean anyWinner() {        
        for (int i = 0; i < numPlayer; i++) {
            if (pl[i].isLucky()) {
                System.out.println(i + 1);
                return true;
            }
        }
        return false;
    }

    public static void proceed() {
        for (int i = 0; i < numPlayer; i++) {
            pl[i].displace();
        }
    }
}

public class gold {
    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        maze.read();
        System.out.println("\nOUTPUT\n");
        while (!maze.anyWinner()) {
            maze.proceed();
        }
    }
}
