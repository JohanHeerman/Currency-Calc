package se.johan;

import java.awt.*;
import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");

        while (true) {

            System.out.println("Menu");
            System.out.println("1. SEK to USD");
            System.out.println("2. USD to SEK");
            System.out.println("3. SEK to EURO");
            System.out.println("4. EURO to SEK");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice){

            case 1:
                convert SEKtoUSD();
                break;

            case 2:
                convert USDtoSEK():
                break;
            case 3:
                convert SEKtoERUO():
                break;
            case 4:
                convert EUROtoSEK():
                break;

                case 5:
                    System.out.println("thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Input");


    }

    }

}