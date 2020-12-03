package lesson6.ex3;

public class Products {
    int productId;
    int quantityPerUnit;
    double unitPrice;
    int unitsInStock;
    int unitsOnOrder;
    int reorderLevel;
    int discontinued;

    Suppliers supplier;
    Categories category;

    public Products(int productId, int quantityPerUnit, double unitPrice, int unitsInStock, int unitsOnOrder, int reorderLevel, int discontinued, Suppliers supplier, Categories category) {
        this.productId = productId;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
        this.supplier = supplier;
        this.category = category;
    }
}
