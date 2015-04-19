
import java.util.Scanner;

class Jar {

    int capacity, water;

    Jar(int c, int w) {
        capacity = c;
        water = w;
    }

    int spaceLeft() {
        return capacity - water;
    }

    int waterLevel() {
        return water;
    }

    boolean isFull() {
        return capacity == water;
    }

    boolean isEmpty() {
        return water == 0;
    }

    void remWater(int c) {
        water = water - c;
    }

    void addWater(int c) {
        water = water + c;
    }
}

public class desert {

    static Jar[] jar;
    static int N, target, minCount = 6;

    static void transfer2(int a, Jar source, Jar dest) {
        source.remWater(a);
        dest.addWater(a);
    }

    static int transfer(Jar source, Jar dest) {
        int a = Math.min(source.waterLevel(), dest.spaceLeft());
        transfer2(a, source, dest);
        return a;
    }

    static boolean isOver() {
        for (int i = 0; i < N; i++) {
            if (jar[i].waterLevel() == target) {
                return true;
            }
        }
        return false;
    }

    static void recur(int count) {
        if (count >= minCount) {
            return;
        }
        if (isOver()) {
            minCount = Math.min(count, minCount);
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i != j) && (!jar[i].isEmpty()) && (!jar[j].isFull())) {
                    int temp = transfer(jar[i], jar[j]);
                    recur(count + 1);
                    transfer2(temp, jar[j], jar[i]);
                }
            }
        }
    }

    public static void main(String[] args)throws Exception {
        System.out.println("INPUT");
        Scanner sin = new Scanner(System.in);

        N = sin.nextInt();
        jar = new Jar[N];

        for (int i = 0; i < N; i++) {
            jar[i] = new Jar(sin.nextInt(), sin.nextInt());
        }
        target = sin.nextInt();        
        recur(0);        
        System.out.println("\nOUTPUT\n"+minCount);
    }
}
