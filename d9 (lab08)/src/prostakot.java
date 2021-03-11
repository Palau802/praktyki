import java.util.Scanner;
public class prostakot implements Figura {

    double a;
    double b;

    public prostakot() {
        System.out.print("bok a prostokątu:");
        a = scan.nextDouble();
        System.out.print("bok b prostokątu:");
        b = scan.nextDouble();
    }

    public static void main(String[] args) {


        new prostakot().obliczPole();

        new prostakot().obliczObwod();

    }

    public double obliczPole() {
        System.out.println("Pole");
        System.out.println(a * b);

        return 0;
    }

    public double obliczObwod() {
        System.out.println("Obwód");
        System.out.println((a * 2) + (2 * b));

        return 0;
    }

    Scanner scan = new Scanner(System.in);
}
