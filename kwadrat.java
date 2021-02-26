package com.company.lab4;
import java.util.Scanner;
public class kwadrat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double side;
        System.out.println("side:");
        side = scan.nextDouble();

        double field = side * side;

        double perimeter = side * 4;

        System.out.println("field:" + field);
        System.out.println("perimeter:" + perimeter);


    }
}
