package by.epam.learn.fundaments.task6;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter your numbers");
        Scanner scanner = new Scanner(System.in);
        long maxNumber = 0;
        int lengthMax = 0;
        long minNumber = Long.MAX_VALUE;
        int lengthMin = 0;
        while(scanner.hasNextLong() ){
            long number = scanner.nextLong();
            if(number > maxNumber){
                maxNumber = number;
                String numberStr = Long.toString(number);
                lengthMax = numberStr.length();
            }
            if(number < minNumber){
                minNumber = number;
                String numberStr = Long.toString(number);
                lengthMin = numberStr.length();
            }
        }
        System.out.println("Max number -> " + maxNumber + " " + "length max -> " + lengthMax);
        System.out.println("Min number -> " + minNumber + " " + "length min -> " + lengthMin);

    }
}
