package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter rectangle width and height: ");
        rect.height = sc.nextDouble();
        rect.width = sc.nextDouble();

        System.out.println("Area = " + String.format("%.2f", rect.area()));
        System.out.println("Perimeter = " + String.format("%.2f",rect.perimeter()));
        System.out.println("Diagonal = " + String.format("%.2f",rect.diagonal()));



        sc.close();
    }
}
