package practica_1;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("Сумма двух чисел: " + add(3, 4));
        System.out.println("Разность двух чисел: " + subtract(3, 4));
        System.out.println("Произведение двух чисел: " + multiply(3, 4));
        System.out.println("Деление двух чисел: " + divide(3, 4));
        System.out.println("Максимальное из двух чисел: " + findMax(3, 4));
        System.out.println("Разность двух чисел по модулю: " + difference(3, 4));
        System.out.println("Площадь квадрата: " + squareArea(3));
        System.out.println("Периметр квадрата: " + squarePerimeter(3));
        System.out.println("Перевод секунд в минуты: " + convertSecondsToMinutes(121));
        System.out.println("Средня скорость: " + averageSpeed(25.2, 4.0));
        System.out.println("Гипотенуза треугольника: " + findHypotenuse(3, 4));
        System.out.println("Гипотенуза треугольника: " + findHypotenuse(4.4, 5.2));
        System.out.println("Длина окружности: " + circleCircumference(5.2));
        System.out.println("Длина окружности: " + circleCircumference(1));
        System.out.println("Процент от общего: " + calculatePercentage(100, 25));
        System.out.println("Процент от общего: " + calculatePercentage(50.2, 25.1));
        System.out.println("Перевод Цельсии в Фаренгейты: " + celsiusToFahrenheit(36.6));
        System.out.println("Перевод Фаренгейтов в Цельсию: " + fahrenheitToCelsius(96.0));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) / 9 * 5;
    }
}
