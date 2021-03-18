import java.util.Scanner;
public class Lodziarnia {

    public static void main(String[] args) {
        new Lodziarnia().obliczCene();



    }




    public double obliczCene(){
        final double cena_za_kulke_ = 4;
        Scanner scan = new Scanner(System.in);
        System.out.println("liczba gałek");
        double a = scan.nextDouble();
        double cena_brutto = a*cena_za_kulke_+(a*cena_za_kulke_*0.23);
        System.out.print("pełna cena za lody: " + cena_brutto);
        return cena_brutto;
    }



}
