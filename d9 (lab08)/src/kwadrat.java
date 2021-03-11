import java.util.Scanner;
public class kwadrat implements Figura {


    double c;
    public kwadrat() {


        Scanner scan = new Scanner(System.in);
        c = scan.nextDouble();

    }

    public static void main(String[] args) {

        System.out.print("bok kwadratu:");

        new kwadrat().obliczPole();
        new kwadrat().obliczObwod();

    }

    public double obliczPole() {

        System.out.println(c * c);
        return c;
    }

    public double obliczObwod() {
        System.out.println(c * 4);
        return c;
    }

}
