package practica_4;

import java.util.Scanner;

public class IfElseSolver {

    public static void main(String[] args) {
//        determineSignNumber();
//
//        searchMax();
//
//        determineMark();
//
//        searchParity();
//
//        determineDiscountByAge();
//
//        determineTestResult();
    }

    public static void determineSignNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void searchMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            System.out.println("Наибольшее число: " + firstNum);
        } else {
            System.out.println("Наибольшее число: " + secondNum);
        }
    }

    public static void determineMark() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число: ");
        int number = scanner.nextInt();

        switch (number) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2, 1:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Введенное число - это не оценка");
        }
    }

    public static void searchParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void determineDiscountByAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Ваша скидка 25%");
        } else if (age >= 65) {
            System.out.println("Ваша скидка 30%");
        } else {
            System.out.println("Увы, для вас нет скидки");
        }
    }

    public static void determineTestResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество баллов за тест: ");
        int testResult = scanner.nextInt();

        if (testResult >= 90 && testResult <= 100) {
            System.out.println("Отлично");
        } else if (testResult >= 75 && testResult <= 89) {
            System.out.println("Хорошо");
        } else if (testResult >= 60 && testResult <= 74) {
            System.out.println("Удовлетворительно");
        } else if (testResult > 0 && testResult <= 59) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Введенное число - не результат теста");
        }
    }
}
