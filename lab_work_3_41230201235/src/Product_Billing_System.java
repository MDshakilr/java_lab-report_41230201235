class Product {
    int productId;
    String productName;
    int quantity;
    double unitPrice;

    Product() {
        productId = 0;
        productName = "Unknown";
        quantity = 0;
        unitPrice = 0.0;
    }

    Product(int id, String name, int qty, double price) {
        productId = id;
        productName = name;
        quantity = qty;
        unitPrice = price;
    }

    double totalPrice()

    {
        return quantity * unitPrice;
    }

    void displayBill() {
        System.out.println("Product ID =  " + productId);
        System.out.println("Product Name= " + productName);
        System.out.println("Quantity   =  " + quantity);
        System.out.println("Unit Price  = " + unitPrice);
        System.out.println("Total Price  =" + totalPrice());
    }
}

public class Product_Billing_System {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(101, "Wireless Mouse", 3, 850.50);

        System.out.println("Product 1 Details:");
        p1.displayBill();

        System.out.println("Product 2 Details:");
        p2.displayBill();
    }
}





