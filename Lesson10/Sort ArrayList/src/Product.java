import java.text.DecimalFormat;
import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private float price;
    Category category;
    private int quantity;
    private int quantity_sold;

    public Product() {
    }

    public Product(int id, String name, float price, Category category, int quantity, int quantity_sold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.quantity_sold = quantity_sold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity_sold() {
        return quantity_sold;
    }

    public void setQuantity_sold(int quantity_sold) {
        this.quantity_sold = quantity_sold;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + id + " - " + "Tên sản phẩm: " + name + " - " + "Giá bán: " + formatMoney(price) + " - " + "Danh mục: " + category.getDanhMuc() + " - " + "Số lượng: " + quantity + " - " + "Số lượng bán được: " + quantity_sold;
    }

    public String formatMoney(float money) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money);
    }

}
