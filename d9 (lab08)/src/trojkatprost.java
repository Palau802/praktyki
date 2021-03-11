import java.util.Scanner;

public class trojkatprost {

    double a;
    double b;

    public trojkatprost() {
        System.out.print("przeciwprostokątna a:");
        a = scan.nextDouble();
        System.out.print("przeciwprostokątna b:");
        b = scan.nextDouble();
    }

    public static void main(String[] args) {


        new trojkatprost().obliczPole();

        new trojkatprost().obliczObwod();

    }

    public double obliczPole() {
        System.out.println("Pole");
        System.out.println((a * b)/2);

        return 0;
    }

    public double obliczObwod() {
        System.out.println("Obwód");
        double c = Math.sqrt(a*a+b*b);
        System.out.println(a+b+(c));

        return 0;
    }

    Scanner scan = new Scanner(System.in);






















}
