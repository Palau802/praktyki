package com.company;

import java.util.Scanner;

public class trzy {
    public static void main(String[] args) {


        double f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Stopnie celsjusza: ");
        double c;
        c = scan.nextInt();


        f = (c * 1.8) + 32;

        System.out.println(f);








    }
}
