package lesson6.ex3;

public class OrderDetails {
    Orders order;
    Products product;
    double unitePrice;
    int quantity;
    double discount;

    public OrderDetails(Orders order, Products product, double unitePrice, int quantity, double discount) {
        this.order = order;
        this.product = product;
        this.unitePrice = unitePrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
