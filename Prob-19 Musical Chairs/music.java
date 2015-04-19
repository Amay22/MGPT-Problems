
import java.util.Scanner;

class music {

    static int[][] arr;
    static int N;
    static int R;
    static int C = 3;

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);
        N = sin.nextInt();
        int T = N;
        R = N + 1;
        arr = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = -1;
            }
        }
        arrangeSeats();
        for (int i = 0; i < N; i++) {
            arr[i][0] = i;
        }
        for (int i = 0; i < T - 1; i++) {
            int t = sin.nextInt();
            for (int j = 0; j < t; j++) {
                rotate();
            }
            seatAll();
            nextRound();
        }
        System.out.println("\nOUTPUT\n");
        declareWinner();
    }

    static void print() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == -1) {
                    System.out.print("- ");
                } else if (arr[i][j] == -2) {
                    System.out.print("> ");
                } else if (arr[i][j] == -3) {
                    System.out.print("< ");
                } else {
                    System.out.print(((char) (arr[i][j] + 'A')) + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void arrangeSeats() {
        for (int i = 0; i < R; i++) {
            arr[i][0] = arr[i][2] = -1;
        }
        for (int i = 0; i < C; i++) {
            arr[0][i] = arr[R - 1][i] = -1;
        }

        for (int i = 1; i < R - 1; i++) {
            if ((arr[i - 1][1] == -2) || (arr[i - 1][1] == -1)) {
                if (arr[i][1] > -1) {
                    arr[i][2] = arr[i][1];
                }
                arr[i][1] = -3;
            }

            if (arr[i - 1][1] == -3) {
                if (arr[i][1] > -1) {
                    arr[i][0] = arr[i][1];
                }
                arr[i][1] = -2;
            }
        }
    }

    static void rotate() {
        int temp1 = arr[R - 1][0];
        for (int i = R - 1; i > 0; i--) {
            arr[i][0] = arr[i - 1][0];
        }

        int temp2 = arr[R - 1][C - 1];
        for (int i = C - 1; i > 0; i--) {
            arr[R - 1][i] = arr[R - 1][i - 1];
        }
        arr[R - 1][1] = temp1;

        temp1 = arr[0][C - 1];
        for (int i = 0; i < R - 1; i++) {
            arr[i][2] = arr[i + 1][2];
        }
        arr[R - 2][C - 1] = temp2;

        for (int i = 0; i < C - 1; i++) {
            arr[0][i] = arr[0][i + 1];
        }
        arr[0][C - 2] = temp1;
    }

    static void seatAll() {
        seat();
        while (numStanding() > 1) {
            rotate();
            seat();
        }
    }

    static void seat() {
        for (int i = 1; i < R - 1; i++) {
            if ((arr[i][1] == -2) && (arr[i][0] > -1)) {
                arr[i][1] = arr[i][0];
                arr[i][0] = -1;
            }
            if ((arr[i][1] == -3) && (arr[i][2] > -1)) {
                arr[i][1] = arr[i][2];
                arr[i][2] = -1;
            }
        }
    }

    void getUp() {
        for (int i = 1; i < R - 1; i++) {
            if ((arr[i][1] > -1)) {
                arr[i][1] = arr[i][0];
                arr[i][0] = -1;
            }
            if ((arr[i][1] == -3) && (arr[i][2] > -1)) {
                arr[i][1] = arr[i][2];
                arr[i][2] = -1;
            }
        }
    }

    static int numStanding() {
        int count = 0;
        for (int i = 1; i < R - 1; i++) {
            if (arr[i][1] > -1) {
                count++;
            }
        }

        return N - count;
    }

    static void nextRound() {
        arrangeSeats();
        N--;
        R--;
        arr[R - 1][1] = -1;
    }

    static void declareWinner() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] > -1) {
                    System.out.println((char) (arr[i][j] + 'A'));
                    return;
                }
            }
        }
    }
}
