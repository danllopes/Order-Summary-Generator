package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {}

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return quantity * price;
    }

    public String toString() {
        return "Product: "
                + this.product.getName()
                + ", $ "
                + String.format("%.2f", this.price)
                + ", Quantity: "
                + this.quantity
                + ", Subtotal: $ "
                + String.format("%.2f", this.subTotal());
    }
}
