import java.util.Scanner;
class paper {

    private static int R;
    private static int C;

    private static int[][] arr;

    public static void read()throws Exception {
        Scanner sin = new Scanner(System.in);
        R = sin.nextInt();
        C = sin.nextInt();

        arr = new int[R + 2][C + 2];

        for (int i = 0; i < (R + 2); i++) {
            for (int j = 0; j < (C + 2); j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sin.nextInt();
            }
        }
    }

    public static void print() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setNeigh(int a, int b, int setTo) {
        int setWhat = arr[a][b];
        arr[a][b] = setTo;
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    if (arr[i][j] == setWhat) {
                        if (arr[i - 1][j] == setTo) {
                            arr[i][j] = setTo;
                            change = true;
                        }
                        if (arr[i + 1][j] == setTo) {
                            arr[i][j] = setTo;
                            change = true;
                        }
                        if (arr[i][j - 1] == setTo) {
                            arr[i][j] = setTo;
                            change = true;
                        }
                        if (arr[i][j + 1] == setTo) {
                            arr[i][j] = setTo;
                            change = true;
                        }
                        if ((setTo == 4) || (setWhat == 4)) {
                            if (arr[i - 1][j + 1] == setTo) {
                                arr[i][j] = setTo;
                                change = true;
                            }
                            if (arr[i + 1][j + 1] == setTo) {
                                arr[i][j] = setTo;
                                change = true;
                            }
                            if (arr[i - 1][j - 1] == setTo) {
                                arr[i][j] = setTo;
                                change = true;
                            }
                            if (arr[i + 1][j - 1] == setTo) {
                                arr[i][j] = setTo;
                                change = true;
                            }
                        }
                    }
                }
            }
        }

        if (setTo == 5) {
            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    if (arr[i][j] == 5) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void setShapes() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == 1) {
                    setNeigh(i, j, 7);
                    if (checkRec()) {
                        setNeigh(i, j, 3);
                    } else {
                        setNeigh(i, j, 4);
                    }
                }
            }
        }

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == 3) {
                    setNeigh(i, j, 7);
                    if (checkSqr(i, j)) {
                        setNeigh(i, j, 2);
                    } else {
                        setNeigh(i, j, 1);
                    }
                }
            }
        }
    }

    private static boolean checkRec() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (arr[i][j] == 7) {
                    if (getNeigh(i, j) < 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static int getNeigh(int i, int j) {
        int temp = 7;
        int neigh = 0;
        if (arr[i - 1][j] == temp) {
            neigh++;
        }
        if (arr[i + 1][j] == temp) {
            neigh++;
        }
        if (arr[i][j - 1] == temp) {
            neigh++;
        }
        if (arr[i][j + 1] == temp) {
            neigh++;
        }
        return neigh;
    }

    private static boolean checkSqr(int i, int j) {
        int count1 = 0;
        int count2 = 0;

        while ((i + count1 <= R) && (arr[i + count1][j] == 7)) {
            count1++;
        }
        if ((j + count1 - 1) <= C) {
            while ((j + count2 <= C) && (arr[i][j + count2] == 7)) {
                count2++;
            }
        }
        return count1 == count2;
    }

    public static void printShapes() {
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                switch (arr[i][j]) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("rectangle");
                        setNeigh(i, j, 5);
                        break;
                    case 2:
                        System.out.println("square");
                        setNeigh(i, j, 5);
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("triangle");
                        setNeigh(i, j, 5);
                        break;
                }
            }
        }
    }

}

public class shapes {

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");
        paper.read();
        paper.setShapes();
        paper.print();
        System.out.println("\nOUTPUT\n");
        paper.printShapes();
    }
}
