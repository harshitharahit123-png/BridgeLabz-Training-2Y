import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: " + price);
    }
}

class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId + " | Customer: " + customer.getName());
        double total = 0;
        for (Product p : products) {
            p.displayProduct();
            total += p.getPrice();
        }
        System.out.println("Total Amount: " + total);
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Order placeOrder(String orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }

    public void viewOrders() {
        System.out.println("\nCustomer: " + name + " has placed the following orders:");
        for (Order o : orders) {
            o.displayOrder();
        }
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 25000);
        Product p3 = new Product("Headphones", 3000);
        Product p4 = new Product("Keyboard", 1500);

        Customer c1 = new Customer("Akshay");
        Customer c2 = new Customer("Rahul");

        Order o1 = c1.placeOrder("ORD101");
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = c2.placeOrder("ORD102");
        o2.addProduct(p2);
        o2.addProduct(p4);

        Order o3 = c1.placeOrder("ORD103");
        o3.addProduct(p4);

        c1.viewOrders();
        c2.viewOrders();
    }
}
