import java.util.Scanner;


public class inflacja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("cena:");
        double a = scan.nextDouble();
        System.out.println("inflacja:");
        double c = scan.nextDouble();
int b = 0;
        while (1000 > a) {
            b = b + 1;
            System.out.println("rok " + b +" " + a+"zł");
            a = a + (a * c);

        }

    }
}
