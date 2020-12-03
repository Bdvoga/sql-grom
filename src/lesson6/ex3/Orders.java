package lesson6.ex3;

import java.util.Date;

public class Orders {
    int orderId;
    Date orderDate;
    Date requiredDate;
    Date shippedDate;
    String freight;
    String shipName;
    String shipAddress;
    String address;
    String city;
    String region;
    int postalCode;
    String country;

    Customers customer;
    Employees employee;
    Shippers shipper;

    public Orders(int orderId, Date orderDate, Date requiredDate, Date shippedDate, String freight, String shipName, String shipAddress, String address, String city, String region, int postalCode, String country, Customers customer, Employees employee, Shippers shipper) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.customer = customer;
        this.employee = employee;
        this.shipper = shipper;
    }
}
