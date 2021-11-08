package by.epam.learn.fundaments.task7;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter your numbers");
        Scanner scanner = new Scanner(System.in);
        List<Long>  listOfNumbers = new ArrayList<>();
        while (scanner.hasNextLong()){
             listOfNumbers.add(scanner.nextLong());
        }
        scanner.close();
        Comparator<Long> comparator = Comparator.naturalOrder();
    }
}
