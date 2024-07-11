package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    private ArrayList<OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order() {}

    public Order(OrderStatus status, Client client) {
        this.moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        this.orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        this.orderItems.remove(item);
    }

    public Double total() {
        double sum = 0;

        for(OrderItem item: orderItems) {
            sum += item.subTotal();
        }

        return sum;
    }

    public String toString() {
        var builder = new StringBuilder();
        builder.append("\nOrder moment: ");
        builder.append(this.moment.format(DATE_TIME_FORMATTER));
        builder.append("\nOrder Status: ");
        builder.append(this.status);
        builder.append("\nClient: ");
        builder.append(client.toSTring());
        builder.append("\nOrder items:\n\n");
        for(OrderItem item : this.orderItems) {
            builder.append(item).append("\n");
        }
        builder.append("Total price: $ ");
        builder.append(String.format("%.2f", this.total()));
        return builder.toString();
    }
}
