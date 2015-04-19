
import java.util.Scanner;

class perimeter {

    public static void main(String[] args) throws Exception {
        int count = 0;
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        int R = sin.nextInt();
        int C = sin.nextInt();
        char[][] arr = new char[R + 2][C + 2];
        sin.nextLine();
        for (int i = 1; i <= R; i++) {
            String tmp = sin.nextLine();
            for (int j = 1; j <= C; j++) {                
                arr[i][j] = tmp.charAt(j-1);
            }
        }
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == '#') {
                    if (arr[i - 1][j - 1] == '^') {
                        arr[i - 1][j - 1] = 'B';
                    }
                    if (arr[i - 1][j + 1] == '^') {
                        arr[i - 1][j + 1] = 'B';
                    }
                    if (arr[i - 1][j] == '^') {
                        arr[i - 1][j] = 'B';
                    }
                    if (arr[i + 1][j - 1] == '^') {
                        arr[i + 1][j - 1] = 'B';
                    }
                    if (arr[i + 1][j + 1] == '^') {
                        arr[i + 1][j + 1] = 'B';
                    }
                    if (arr[i + 1][j] == '^') {
                        arr[i + 1][j] = 'B';
                    }
                    if (arr[i][j - 1] == '^') {
                        arr[i][j - 1] = 'B';
                    }
                    if (arr[i][j + 1] == '^') {
                        arr[i][j + 1] = 'B';
                    }
                }
            }
        }

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == 'B') {
                    if (arr[i - 1][j] == '^') {
                        count++;
                    }
                    if (arr[i + 1][j] == '^') {
                        count++;
                    }
                    if (arr[i][j - 1] == '^') {
                        count++;
                    }
                    if (arr[i][j + 1] == '^') {
                        count++;
                    }
                }
            }
        }

        System.out.println("\nOUTPUT\n"+count);
    }
}
