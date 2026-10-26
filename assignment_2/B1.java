import java.util.*;
class Product {
    int productId;
    String productName;
    double price;
    int quantity;
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString() {
        return productId + " " + productName + " " + price + " " + quantity;
    }
}
public class B1 {
    static void display(List<Product> list) {
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Keyboard", 499, 10));
        products.add(new Product(102, "Mouse", 299, 5));
        products.add(new Product(103, "Monitor", 7500, 0));
        products.add(new Product(104, "Laptop", 45000, 3));
        products.add(new Product(105, "Printer", 6500, 0));
        products.add(new Product(106, "Speaker", 1200, 8));
        products.add(1, new Product(107, "Webcam", 1800, 4));
        for (Product p : products) {
            if (p.productId == 102) {
                p.price = 349;
            }
        }
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().quantity == 0) {
                iterator.remove();
            }
        }
        System.out.println("After Insert, Update and Remove:");
        display(products);
        String searchName = "Mouse";
        boolean found = false;
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found");
        }
        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("Sorted by Price:");
        display(products);
        Collections.sort(products,
                (p1, p2) -> p1.productName.compareTo(p2.productName));
        System.out.println("Sorted by Name:");
        display(products);
        System.out.println("Using Iterator:");
        Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Using for-each:");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Using forEach and Lambda:");
        products.forEach(p -> System.out.println(p));
        Product[] array = products.toArray(new Product[0]);
        System.out.println("Array Contents:");
        System.out.println(Arrays.toString(array));
        List<Product> linkedList = new LinkedList<>(products);
        System.out.println("LinkedList Contents:");
        display(linkedList);
        System.out.println("ArrayList Size: " + products.size());
        System.out.println("LinkedList Size: " + linkedList.size());
        System.out.println("Array Length: " + array.length);
    }
}