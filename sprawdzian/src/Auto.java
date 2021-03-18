import java.util.Scanner;
public class Auto {
    public static void main(String[] args) {
        new Auto().obliczPaliwo();
    }
    public Auto() {
        double a;
    }
    double litryNaSto = 11;
    public double obliczPaliwo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("droga: ");
        System.out.println();
        double droga = scan.nextDouble();
        System.out.print(droga*11/100);





        return litryNaSto;
    }

}
