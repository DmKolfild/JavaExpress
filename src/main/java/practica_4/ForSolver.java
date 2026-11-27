package practica_4;

import java.util.Scanner;

public class ForSolver {
    public static void main(String[] args) {
//        findNumMod3();
//
//        sumNumbersFrom1ToN();
//
//        sumNumbersFrom1ToN();
//
//        mulTAble();
//
//        checkPrimeNumber();
//
//        print1to10();
    }


    public static void findNumMod3() {
        System.out.println("Числа, делящиеся на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "; ");
            }
        }
    }

    public static void sumNumbersFrom1ToN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Сумма чисел от 1 до %d = %d", n, sum);
    }

    public static void mulTAble() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", i, n, i * n);
        }
    }

    public static void checkPrimeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        boolean isPrime = true;
        int n = scanner.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не является простым");
        }
    }

    public static void print1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}