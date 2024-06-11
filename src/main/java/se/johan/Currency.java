package se.johan;

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
                convertSEKtoUSD();

                break;
            case 2:
                convertUSDtoSEK();

                break;
            case 3:
                convertSEKtoEURO();

                break;
            case 4:
                convertEUROtoSEK();

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

    public static double SEKtoUSD = 0.095;
    public static double USDtoSEK = 10.50;
    public static double SEKtoEURO = 0.089;
    public static double EUROtoSEK = 11.28;

    public static void convertSEKtoUSD (){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in SEK");
        double sekAmount = scanner.nextDouble();
        double usdAmount = sekAmount * SEKtoUSD;
        System.out.println(sekAmount + " SEK is equal to " + usdAmount + " USD");

        }
        public static void convertUSDtoSEK() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in USD");
    double usdAmount = scanner.nextDouble();
    double sekAmount = usdAmount * USDtoSEK;
        System.out.println(usdAmount + " USD is equal to " + sekAmount + " SEK");
    }
    public static void convertSEKtoEURO(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in SEK");
    double sekAmount = scanner.nextDouble();
    double euroAmount = sekAmount * SEKtoEURO;
        System.out.println(sekAmount + " SEK is equal to " + euroAmount + " ERUO");
}
public static void convertEUROtoSEK(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in EURO");
        double euroAmount = scanner.nextDouble();
        double sekAmount = euroAmount * EUROtoSEK;
        System.out.println(euroAmount + " EURO is equal to " + sekAmount + " SEK");
    }
}



