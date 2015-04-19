
import java.util.Scanner;

class Global{
    public static Scanner sin = new Scanner(System.in);
}

class Person {

    private static final int LIMIT = 100;
    private static char namer = 'A';
    static int money[] = new int[LIMIT];
    static int count = 0;
    static char chk[] = new char[LIMIT];
    char name;
    int charge = 0;

    Person(int n) throws Exception {        
        name = namer++;
        for (int i = count; i < (count + n); i++) {            
            money[i] = Global.sin.nextInt();            
            chk[i] = name;
        }
        count += n;
    }

    void print() {
        print(name);
    }

    static void print(char name) {
        
        System.out.print(name + " ");
        for (int i = 0; i < count; i++) {
            if (chk[i] == name) {
                System.out.print(money[i] + " ");
            }
        }        
    }
}

public class ticket {

    static Person passenger[];
    static boolean chk[];
    static int cost;
    static String order = "";
    static boolean done;

    public static void main(String[] args) throws Exception {
        System.out.println("INPUT");        
        cost = Global.sin.nextInt();
        passenger = new Person[Global.sin.nextInt()];
        chk = new boolean[passenger.length];
        for (int i = 0; i < passenger.length; i++) {
            passenger[i] = new Person(Global.sin.nextInt());
        }
        System.out.println("\nOUTPUT\n");
        pickPerson();
    }

    static void print() {
        for (Person passenger1 : passenger) {
            passenger1.print();
        }
        Person.print('*');        
    }

    static boolean allDone() {
        for (int i = 0; i < passenger.length; i++) {
            if (!chk[i]) {
                return false;
            }
        }
        done = true;
        return true;
    }

    static void pickPerson() {
        if (done) {
            return;
        }
        if (allDone()) {
            System.out.println(order);
            return;
        }
        for (int i = 0; i < passenger.length; i++) {
            if (!chk[i]) {
                chk[i] = true;
                order += passenger[i].name;
                pay(passenger[i]);
                order = order.substring(0, order.length() - 1);
                chk[i] = false;
            }
        }
    }

    static void pay(Person p) {
        for (int i = 0; i < Person.count; i++) {
            if (Person.chk[i] == p.name) {
                Person.chk[i] = '*';
                p.charge += Person.money[i];
                if (p.charge >= cost) {
                    giveChange(p);
                } else {
                    pay(p);
                }
                p.charge -= Person.money[i];
                Person.chk[i] = p.name;
            }
        }
    }

    static void giveChange(Person p) {
        if (p.charge == cost) {
            pickPerson();
            return;
        }
        if (p.charge < cost) {
            return;
        }
        for (int i = 0; i < Person.count; i++) {
            if (Person.chk[i] == '*') {
                Person.chk[i] = p.name;
                p.charge -= Person.money[i];
                giveChange(p);
                p.charge += Person.money[i];
                Person.chk[i] = '*';
            }
        }
    }
}
