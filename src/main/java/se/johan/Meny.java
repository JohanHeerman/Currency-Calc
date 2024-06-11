package se.johan;

import java.util.Scanner;

public class Meny {

    public void startMeny(){


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

            switch (choice) {

                case 1:
                    CurrencyConversion.convertSEKtoUSD();
                    break;
                case 2:
                    CurrencyConversion.convertUSDtoSEK();
                    break;
                case 3:
                    CurrencyConversion.convertSEKtoEURO();
                    break;
                case 4:
                    CurrencyConversion.convertEUROtoSEK();
                    break;
                case 5:
                    System.out.println("Exiting Application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Input");
            }

        }
    }

}
