package Package;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        Auto a1 = new Auto("audi", "r8", -170000);
        Auto a2 = new Auto("audi", "TT", 55000);
        Auto a3 = new Auto("opel", "corsa", 15000);
        Auto a4 = new Auto("lamborghini", "murcielago", 200000);


        System.out.println(a1.getMarca()+ " " + a1.getModello() + " " + a1.getPrezzo());
        System.out.println(a2.getMarca()+ " " + a2.getModello() + " " + a2.getPrezzo());
        System.out.println(a3.getMarca()+ " " + a3.getModello() + " " + a3.getPrezzo());
        System.out.println(a4.getMarca()+ " " + a4.getModello() + " " + a4.getPrezzo());



    }
}
