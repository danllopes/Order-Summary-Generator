import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("""

                Confira o enunciado completo no arquivo PDF
                localizado no pacote 'documentação'.
                """);

        final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Client client;
        var order = new Order();

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Email: ");
        String email = sc.nextLine().trim();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine().trim(),DATE_FORMATTER);

        client = new Client(name, email, birthDate);

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine().trim());

        order = new Order(status, client);

        System.out.print("How many items to this order? ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("\nEnter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine().trim();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            var product = new Product(productName, productPrice);
            var item = new OrderItem(quantity, product);
            order.addItem(item);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}