package by.epam.learn.fundaments.task3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter quantity of your numbers ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        for (int i = 1; i <= quantity; i++) {
            Random random = new Random();
            int number = random.nextInt(100);
            System.out.println("Your number: " + i + " is " + number);
        }
    }
}
