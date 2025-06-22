import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

public class EcommerceSearch {

    // Function to search products by keyword (case-insensitive, partial match)
    public static List<Product> searchProducts(List<Product> products, String keyword) {
        List<Product> result = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product product : products) {
            if (product.name.toLowerCase().contains(keyword)) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Product("Apple iPhone 15", 79999));
        catalog.add(new Product("Samsung Galaxy S23", 74999));
        catalog.add(new Product("Boat Headphones", 2999));
        catalog.add(new Product("Apple Watch", 35999));
        catalog.add(new Product("HP Laptop", 55999));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product to search: ");
        String keyword = sc.nextLine();

        List<Product> results = searchProducts(catalog, keyword);

        if (results.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            System.out.println("Search results:");
            for (Product p : results) {
                System.out.println(p);
            }
        }
    }
}
