package com.company.lab4;
import java.util.Scanner;

public class punkt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

double d;
double a;
a = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
     d = Math.sqrt(a);



        System.out.println(d);







    }
}
