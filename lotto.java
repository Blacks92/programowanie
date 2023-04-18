package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> userNumbers = new HashSet<>();
        System.out.println("Podaj 6 liczb z puli 1-49:");
        while (userNumbers.size() < 6) {
            int number = scanner.nextInt();
            if (number >= 1 && number <= 49) {
                userNumbers.add(number);
            } else {
                System.out.println("Liczba musi być z zakresu 1-49. Spróbuj ponownie.");
            }
        }

        Random random = new Random();
        Set<Integer> drawnNumbers = new HashSet<>();
        int years = 0;
        int days = 0;

        while (!drawnNumbers.equals(userNumbers)) {
            drawnNumbers.clear();
            while (drawnNumbers.size() < 6) {
                int number = random.nextInt(49) + 1;
                drawnNumbers.add(number);
            }
            days++;
            if (days > 365) {
                years++;
                days = 0;
            }
        }

        System.out.println("Wylosowane liczby: " + drawnNumbers);
        System.out.println("Gratulacje! Udało Ci się wygrać po " + years + " latach i " + days + " dniach.");

    }
}
