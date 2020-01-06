package lesson1;

import java.util.Scanner;

public class LoopsHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int studentScore = sc.nextInt();
        int possibleScore = 20;
        int grade = studentScore * 100 / possibleScore;
        System.out.println(grade);
        if (grade >= 90 && grade <= 100) {
            System.out.println("You got an 'A' " + grade + "%");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("you got a 'B' " + grade + "%");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("you got a'C' " + grade + "%");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("you got a'D' " + grade + "%");
        } else if (grade >= 0 && grade < 60) {
            System.out.println("you got an  'F' " + grade + "%");
        }
        System.out.println("Enter the number");
        int tableNumber = sc.nextInt();
        int result = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println(tableNumber + "X" + i + "=" + tableNumber * i);
        }


        System.out.println("Enter a number to check if it is prime:");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}


