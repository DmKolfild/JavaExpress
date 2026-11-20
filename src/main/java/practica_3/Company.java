package practica_3;

public class Company {
    static String companyName;
    final int employeeId;
    String employeeName;

    public Company(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
