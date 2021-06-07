/*
 * UCF COP3330 Summer 2021 Assignment 10 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        final double TAX = .055;
        double price1, price2, price3, subtotal, tax, total;
        int num1, num2, num3;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        price1 = Integer.parseInt(in.nextLine());
        System.out.print("Enter the quantity of item 1: ");
        num1 = Integer.parseInt(in.nextLine());

        System.out.print("Enter the price of item 2: ");
        price2 = Integer.parseInt(in.nextLine());
        System.out.print("Enter the quantity of item 2: ");
        num2 = Integer.parseInt(in.nextLine());

        System.out.print("Enter the price of item 3: ");
        price3 = Integer.parseInt(in.nextLine());
        System.out.print("Enter the quantity of item 3: ");
        num3 = Integer.parseInt(in.nextLine());

        subtotal = price1*num1 + price2*num2 + price3*num3;
        tax  = subtotal * TAX;
        total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\n" +
                "Tax: $%.2f\n" +
                "Total: $%.2f\n",
                subtotal, tax, total);
    }
}
