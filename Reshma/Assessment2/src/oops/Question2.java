package oops;
abstract class Product {
    int productId;
    String productName;
    double price;
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    int getProductId() {
        return productId;
    }

    String getProductName() {
        return productName;
    }

    double getPrice() {
        return price;
    }
    abstract void displayInfo();
}
class ElectronicProduct extends Product {

    int warrantyPeriod;
    ElectronicProduct(int productId, String productName, double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    void displayInfo() {
        System.out.println("ELECTRONIC PRODUCT INFORMATION:");
        System.out.println("Productid : "+productId);
        System.out.println("ProductName : "+productName);
        System.out.println("Price : $"+price);
        System.out.println("Warranty Period : "+warrantyPeriod +" Months");
        System.out.println();
    }
}
class ClothingProduct extends Product {

    String size;
    String material;
    ClothingProduct(int productId, String productName, double price, String size, String material) {
        super(productId, productName, price);
        this.size = size;
        this.material = material;
    }

    String getSize() {
        return size;
    }

    String getMaterial() {
        return material;
    }
    void displayInfo() {
        System.out.println("CLOTHING PRODUCT INFORMATION:");
        System.out.println("Productid : "+productId);
        System.out.println("ProductName : "+productName);
        System.out.println("Price : $"+price);
        System.out.println("Size : "+size);
        System.out.println("Material : "+material);
    }
}
public class Question2 {

    public static void main(String[] args) {
    	ElectronicProduct e1 = new ElectronicProduct(201, "Laptop", 1200.0, 12);
    	ClothingProduct c1 = new ClothingProduct(301, "T-Shirt", 25.0, "M", "Cotton");
    	e1.displayInfo();
    	c1.displayInfo();
    }
}