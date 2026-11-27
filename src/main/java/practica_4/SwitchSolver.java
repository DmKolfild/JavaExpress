package practica_4;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class SwitchSolver {
    public static void main(String[] args) {
//        determineDayOfWeek();
//
//        determinePriceOfCinema();
//
//        numberToAlphabeticMarkConversation();
//
//        processInputCommand();
//
//        calculate();
    }

    public static void determineDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Введен несуществующий день");
        }
    }

    public static void determinePriceOfCinema() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Стоимость билета в кино 300 рублей");
                break;
            case 6, 7:
                System.out.println("Стоимость билета в кино 450 рублей");
                break;
            default:
                System.out.println("Введен несуществующий день");
        }
    }

    public static void numberToAlphabeticMarkConversation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество баллов за тест: ");
        int numberMark = scanner.nextInt();
        if (numberMark >= 90 && numberMark <= 100) {
            System.out.println("Ваша оценка: A");
        } else if (numberMark >= 80 && numberMark <= 89) {
            System.out.println("Ваша оценка: B");
        } else if (numberMark >= 70 && numberMark <= 79) {
            System.out.println("Ваша оценка: C");
        } else if (numberMark >= 60 && numberMark <= 69) {
            System.out.println("Ваша оценка: D");
        } else if (numberMark >= 0 && numberMark <= 59) {
            System.out.println("Ваша оценка: F");
        } else {
            System.out.println("Введенное число - не результат теста");
        }
    }

    public static void processInputCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String inputCommand = scanner.nextLine();
        switch (inputCommand) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезагружена");
                break;
            case "status":
                Random random = new Random();
                System.out.println("Количество ошибок за последние сутки: " + random.nextInt(100));
                break;
            default:
                System.out.println("Неизвестная команда");
                break;
        }
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();
        System.out.print("Введите оператор арифметической операции: ");
        String operator = scanner.next();

        switch (operator) {
            case "+" -> {
                int sum = firstNum + secondNum;
                System.out.println("Сумма чисел: " + sum);
            }
            case "-" -> {
                int sub = firstNum - secondNum;
                System.out.println("Разность первого числа и второго: " + sub);
            }
            case "*" -> {
                int mul = firstNum * secondNum;
                System.out.println("Произведение чисел: " + mul);
            }
            case "/" -> {
                if (secondNum == 0) {
                    System.out.println("На 0 делить нельзя!");
                } else {
                    double div = (double) firstNum / secondNum;
                    System.out.println("Частное первого числа от второго: " + div);
                }
            }
            default -> {
                System.out.println("Введен неизвестный арифметический оператор");
            }
        }
    }
}
