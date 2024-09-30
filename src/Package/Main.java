package Package;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Auto a3 = new Auto();
        Auto a4 = new Auto();

        a1.setAll("audi", "r8", "170.000");
        a2.setAll("audi", "TT", "55.000");
        a3.setAll("opel", "corsa", "15.000");
        a4.setAll("lamborghini", "murcielago", "200.000");



        System.out.println(a1.getMarca()+ " " + a1.getModello() + " " + a1.getPrezzo());
        System.out.println(a2.getMarca()+ " " + a2.getModello() + " " + a2.getPrezzo());
        System.out.println(a3.getMarca()+ " " + a3.getModello() + " " + a3.getPrezzo());
        System.out.println(a4.getMarca()+ " " + a4.getModello() + " " + a4.getPrezzo());



    }
}
