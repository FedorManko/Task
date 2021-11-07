package by.epam.learn.fundaments.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello dear " + name);
    }
}
