package lesson6.ex3;

public class Customers {
    int customerId;
    String companyName;
    String contactName;
    String contactTitle;
    String address;
    String city;
    String region;
    int postalCode;
    String country;
    int phone;
    int fax;

    public Customers(int customerId, String companyName, String contactName, String contactTitle, String address, String city, String region, int postalCode, String country, int phone, int fax) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }
}
