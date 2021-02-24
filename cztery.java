package com.company;

import java.util.Scanner;

public class cztery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean wartosc;

        double a;
        double b;
        double c;
        System.out.println("bok 1");
        a = scan.nextDouble();
        System.out.println("bok 2");
        b = scan.nextDouble();
        System.out.println("bok 3");
        c = scan.nextDouble();


        if (a + b < c) {
            wartosc = false;
        } else if (a + c < b) {
            wartosc = false;
        } else if (b + c < a) {
            wartosc = false;
        } else {
            wartosc = true;
        }

        if (wartosc == true) {
            System.out.println("Trójkąt prawidłowy");
        } else if (wartosc == false) {
            System.out.println("Trójkąt nieprawidłowy");
        }

    }
}
