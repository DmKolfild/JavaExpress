package practica_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2000);
        car.setYear(2020);
        car.print();

        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.setWidth(10);
        System.out.println("Площадь прямоугоьника: " + rectangle.calculateArea());

        Book book = new Book("ЙЦУКЕ", "QWERTY");
        book.author = "ASDF";
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Фыва", 200_000);
        bankAccount.deposit(100_000);
        bankAccount.withdraw(40_000);
        System.out.println("Баланс счета: " + bankAccount.balance);

        Point point = new Point(10, 12);
        point.x = 34;
        point.print();

        StudentGroup studentGroup = new StudentGroup("ASDFG", 123);
        studentGroup.setStudentCount(20);
        studentGroup.printInfo();

        Circle circle = new Circle(3);
        circle.setRadius(10);
        System.out.println("Площадь окружности: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());

        Teacher teacher = new Teacher("Олджэ", "фыва");
        teacher.setSubject("фыва 2");
        teacher.printInfo();

        Product product = new Product("Телевизор", 20_000);
        product.applyDiscount(10);
        product.printInfo();

        Laptop laptop = new Laptop("MSI", 10_000);
        laptop.setPrice(9_000);
        laptop.printInfo();
    }
}
