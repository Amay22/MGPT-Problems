
import java.util.Scanner;

class fire {

    static int R, C;
    static char[][] arr;

    static int count() {
        int count = 0;
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == 'F') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        R = sin.nextInt();
        C = sin.nextInt();
        arr = new char[R + 2][C + 2];
        sin.nextLine();
        for (int i = 1; i <= R; i++) {
            String tmp = sin.nextLine();
            for (int j = 1; j <= C; j++) {                
                arr[i][j] = tmp.charAt(j-1);
            }
        }
        System.out.println("\nOUTPUT\n");
        setFire(sin.nextInt() + 1, sin.nextInt() + 1);
        System.out.println(count());
    }

    static void setFire(int r, int c) {
        if (arr[r][c] == '@') {
            arr[r][c] = '+';
        }
        if (arr[r][c] == '#') {
            arr[r][c] = 'F';
        }

        for (int k = 0; k < R * C; k++) {
            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    if (arr[i][j] == 'F') {
                        setFireForest(i - 1, j);
                        setFireForest(i - 1, j - 1);
                        setFireForest(i - 1, j + 1);
                        setFireForest(i + 1, j);
                        setFireForest(i + 1, j - 1);
                        setFireForest(i + 1, j + 1);
                        setFireForest(i, j - 1);
                        setFireForest(i, j + 1);
                    }
                    if (arr[i][j] == '+') {
                        setFireLake(i - 1, j);
                        setFireLake(i - 1, j - 1);
                        setFireLake(i - 1, j + 1);
                        setFireLake(i + 1, j);
                        setFireLake(i + 1, j - 1);
                        setFireLake(i + 1, j + 1);
                        setFireLake(i, j - 1);
                        setFireLake(i, j + 1);
                    }
                }
            }
        }
    }

    static void setFireForest(int i, int j) {
        if (arr[i][j] == '@') {
            arr[i][j] = '+';
        }
        if (arr[i][j] == '#') {
            arr[i][j] = 'F';
        }
    }

    static void setFireLake(int i, int j) {
        if (arr[i][j] == '@') {
            arr[i][j] = '+';
        }
        if (arr[i][j] == '~') {
            arr[i][j] = '+';
        }
        if (arr[i][j] == '#') {
            arr[i][j] = 'F';
        }
    }
}
