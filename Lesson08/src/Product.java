import jdk.jfr.Category;

import java.text.DecimalFormat;

public class Product {
    int id;
    String name;
    long price;
    String category;
    String brand;

    public Product(int id, String name, long price, String category, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return id +" - "+name+" - "+formatMoney(price)+" - "+category+" - "+brand;
    }
    public String formatMoney(long price){
        DecimalFormat formater = new DecimalFormat("###,###,###");
        return formater.format(price);
    }
}
