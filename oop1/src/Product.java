

//PascalCase

public class Product {
    private String name;
    //camelCase
    private double unitPrice;
    private double disCount;
    private String imageUrl;
    private int unitsInStock;

    public String getName() {
        return name;
    }

// sag tık generate--> getters and setters ve sonra hepsini seçiyorsun.
    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDisCount() {
      //  disCount = disCount + 5; bu sekilde butun indirim oranlarini +5 arttirabiliyoruz.
        return disCount;
    }
    //Ornegin disCount oranini sadece okunmasi isteniyorsa burada setDiscount'i komple siliyoruz.
    public void setDisCount(double disCount) {
        this.disCount = disCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;

    }
}
