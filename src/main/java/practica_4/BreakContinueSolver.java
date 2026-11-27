package practica_4;

import java.util.Scanner;

public class BreakContinueSolver {
    public static void main(String[] args) {
//        sumNumbers();
//
//        printNumbersNotDiv3();
//
//        printPositiveNumbers();
//
//        quitProgramWithStop();
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;
        while (true) {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Сумма неотрицательных числе = " + sum);
    }

    public static void printNumbersNotDiv3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int num;
        while (true) {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
            if (num <= 0) {
                continue;
            }
            System.out.println("Введено положительное число: " + num);
        }
    }

    public static void quitProgramWithStop() {
        Scanner scanner = new Scanner(System.in);

        String enteredString;
        while (true) {
            System.out.print("Введите команду: ");
            enteredString = scanner.nextLine();
            if (enteredString.equals("stop")) {
                break;
            }
        }

        System.out.println("Программа завершена!");
    }
}
