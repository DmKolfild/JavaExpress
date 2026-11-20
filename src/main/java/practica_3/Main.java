package practica_3;

public class Main {
    public static void main(String[] args) {
        Company employeeFirst = new Company(1, "Ivan");
        Company employeeSecond = new Company(2, "Petr");

        Company.companyName = "CompanyFirst";
        Company.printCompanyName();
        Company.companyName = "CompanySecond";
        Company.printCompanyName();

//        Нельзя изменять значение для поля определенного с ключевым словом final
//        employeeFirst.employeeId = 2;

        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(2.5));
        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(5));
        System.out.println("Площадь круга: " + MathConstants.calculateCircumference(1.5));
        System.out.println("Площадь круга: " + MathConstants.calculateCircumference(10));

        System.out.println("Расчет по формуле экспоненциального роста: " + MathConstants.calculateExponentialGrowth(1, 1, 1));
        System.out.println("Расчет по формуле экспоненциального роста: " + MathConstants.calculateExponentialGrowth(1.5, 3.7, 3));

        Library library = new Library();
//        Нет доступа к полю с модификатором доступа private из другого класса
//        library.bookTitle = "New bookTitle";
        library.author = "New author"; // Есть доступ к изменению поля с модификатором доступа protected, так как этот модификатор позволяет обращаться к полям внутри того же пакета и в классах наследниках
        library.year = 2000; // Есть доступ к изменению поля с модификатором доступа package-private, так как этот модификатор позволяет обращаться к полям внутри того же пакета
        library.category = "New category"; // Есть доступ к изменению поля с модификатором доступа public, так как этот модификатор позволяет обращаться к полям из любого места программы

        University universityFirst = new University(1, "Ivan1");
        University universitySecond = new University(2, "Ivan2");
        University universityThird = new University(3, "Ivan3");
        universityFirst.printStudentInfo();
        universitySecond.printStudentInfo();
        universityThird.printStudentInfo();

        University.changeUniversityName("New university");
        universityFirst.printStudentInfo();
        universitySecond.printStudentInfo();
        universityThird.printStudentInfo();


        GameSettings gameSettingFirst = new GameSettings("First game");
        GameSettings gameSettingSecond = new GameSettings("Second game");
        GameSettings.setMaxPlayers(20);

        gameSettingFirst.addPlayer();
        gameSettingFirst.addPlayer();
        gameSettingFirst.addPlayer();

        gameSettingSecond.addPlayer();
        gameSettingSecond.addPlayer();

        gameSettingFirst.printGameStatus();
        gameSettingSecond.printGameStatus();


        Person personFirst = new Person("Ivan", "Ivanov", "123-123-123");
        Person personSecond = new Person("Petrov", "Petrov", "456-456-456");
        personFirst.printPersonInfo();
        personSecond.printPersonInfo();

        personFirst.setFirstName("Ivan New");
        personFirst.printPersonInfo();
        personSecond.printPersonInfo();
    }
}
