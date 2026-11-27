package practica_4;

import java.util.Scanner;

public class DoWhileSolver {
    public static void main() {
//        enterPositiveNumber();
//
//        checkPassword();
//
//        print1to10();
//
//        quitProgramWithExit();
//
//        countOfDigits();
    }

    public static void enterPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите положительное число: ");
            n = scanner.nextInt();
        } while (n <= 0);
    }

    public static void checkPassword() {
        final String savedPassword = "1234";
        Scanner scanner = new Scanner(System.in);

        String enteredPassword;
        do {
            System.out.print("Введите пароль: ");
            enteredPassword = scanner.nextLine();
        } while (!enteredPassword.equals(savedPassword));

        System.out.println("Пароли совпали!");
    }

    public static void print1to10() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void quitProgramWithExit() {
        Scanner scanner = new Scanner(System.in);

        String enteredString;
        do {
            System.out.print("Введите команду: ");
            enteredString = scanner.nextLine();
        } while (!enteredString.equals("exit"));

        System.out.println("Программа завершена!");
    }

    public static void countOfDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int countOfDigits = 0;
        do {
            countOfDigits++;
            n /= 10;
        } while (n > 0);

        System.out.printf("Количество цифр в веденном числе = %d", countOfDigits);
    }
}
