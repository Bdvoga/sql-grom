package lesson6.ex3;

import java.util.Date;

public class Employees {
    int employeeId;
    String lastName;
    String firstName;
    String title;
    String titleOfCourtesy;
    Date birthDate;
    Date HireDate;
    String address;
    String city;
    String region;
    int postalCode;
    String country;
    int homePhone;
    int extension;
    String photo;
    String notes;
    String reportsTo;

    public Employees(int employeeId, String lastName, String firstName, String title, String titleOfCourtesy, Date birthDate, Date hireDate, String address, String city, String region, int postalCode, String country, int homePhone, int extension, String photo, String notes, String reportsTo) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        HireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }
}
