import java.util.Scanner;
public class BP implements StacjaBenzynowa {
    public static void main(String[] args) {
        new BP().poziomPaliwa();
    }


    public int poziomPaliwa() {
        System.out.println("BP");
        Scanner scan = new Scanner(System.in);
        System.out.print("poziom gazu: ");
        int gaz = scan.nextInt();
        System.out.println();
        System.out.print("poziom benzyny: ");
        int benzyna = scan.nextInt();

        if (1>benzyna) {
            System.out.println("Brak benzyny!");
        }
        if (1>gaz) {
            System.out.println("Brak gazu!");
        }
return benzyna;
    }


}
