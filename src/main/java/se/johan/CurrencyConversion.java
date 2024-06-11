package se.johan;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CurrencyConversion {

       static double SEKtoUSD = 0.095;
       static double USDtoSEK = 10.50;
       static double SEKtoEURO = 0.089;
       static double EUROtoSEK = 11.28;

        public static void convertSEKtoUSD() {
            LocalDateTime.now();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount in SEK");
            double sekAmount = scanner.nextDouble();
            double usdAmount = sekAmount * SEKtoUSD;
            System.out.println(sekAmount + " SEK is equal to " + usdAmount + " USD");
            System.out.println(LocalDateTime.now());
        }
        public static void convertUSDtoSEK() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount in USD");
            double usdAmount = scanner.nextDouble();
            double sekAmount = usdAmount * USDtoSEK;
            System.out.println(usdAmount + " USD is equal to " + sekAmount + " SEK");
            System.out.println(LocalDateTime.now());
        }
        public static void convertSEKtoEURO() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount in SEK");
            double sekAmount = scanner.nextDouble();
            double euroAmount = sekAmount * SEKtoEURO;
            System.out.println(sekAmount + " SEK is equal to " + euroAmount + " EURO");
            System.out.println(LocalDateTime.now());
        }
        public static void convertEUROtoSEK() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount in EURO");
            double euroAmount = scanner.nextDouble();
            double sekAmount = euroAmount * EUROtoSEK;
            System.out.println(euroAmount + " EURO is equal to " + sekAmount + " SEK");
            System.out.println(LocalDateTime.now());
        }

    }