package practica_4;

import java.util.Scanner;

public class WhileSolver {
    public static void main(String[] args) {
//        calculateFactorial();

//        printEvenNum();

        printRevertNumbers();
    }

    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;
        int result = 1;

        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.printf("Факториал числа %d = %d", n, result);
    }

    public static void printEvenNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + "; ");
            }
            i++;
        }
    }

    public static void printRevertNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        while (n >= 1) {
            System.out.print(n + "; ");
            n--;
        }
    }
}
