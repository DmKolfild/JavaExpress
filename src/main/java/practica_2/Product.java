package practica_2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price =  price * (1 - discount / 100);
    }

    public void printInfo() {
        System.out.println("Название товара: " + this.name + "\nЦена: " + this.price);
    }
}
