package com.company;

import java.util.Scanner;

public class pięć {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("podaj cyfrę dnia tygodnia: ");
        int i;
        i = scan.nextInt();
        if (i == 1) {
            System.out.print("poniedziałek");
        }
        if (i == 2) {
            System.out.print("wtorek");
        }
        if (i == 3) {
            System.out.print("środa");
        }
        if (i == 4) {
            System.out.print("czwartek");
        }
        if (i == 5) {
            System.out.print("piątek");
        }
        if (i == 6) {
            System.out.print("sobota");
        }
        if (i == 7) {
            System.out.print("niedziela");
        }

    }
}
