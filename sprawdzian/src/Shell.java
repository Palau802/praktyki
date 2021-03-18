
public class Shell implements StacjaBenzynowa {
    public static void main(String[] args) {
        new Shell().poziomPaliwa();
    }


    public int poziomPaliwa() {
        System.out.println("Shell");
        int gaz = 39;

        int benzyna = 63;
        System.out.print("poziom benzyny: " + benzyna);
        System.out.println();
        System.out.print("poziom gazu: " + gaz);
        System.out.println();
return gaz;
    }


}
