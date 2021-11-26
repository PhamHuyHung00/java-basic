import java.text.DecimalFormat;

public class FptShop {
    int id;
    String name;
    String product_description;
    double price;
    int quantity;
    int quantity_sell;
    String producer;
    Category category;

    public FptShop(int id, String name, String product_description, double price, int quantity, int quantity_sell, String producer, Category category) {
        this.id = id;
        this.name = name;
        this.product_description = product_description;
        this.price = price;
        this.quantity = quantity;
        this.quantity_sell = quantity_sell;
        this.producer = producer;
        this.category = category;
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

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity_sell() {
        return quantity_sell;
    }

    public void setQuantity_sell(int quantity_sell) {
        this.quantity_sell = quantity_sell;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Category getCategory() {
        return category;
    }

    public FptShop() {
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mã Số: " + id + " - " + "Tên sản phẩm: " + name + " - " + "Mô tả: " + product_description + " - " + "Giá: " + formatMoney(price) + " - " + "Số lượng: " + quantity + " - " + "Sl bán được: " + quantity_sell + " - " + "Hãng: " + producer + " - " + "Danh mục: " + category;
    }

    public String formatMoney(double money) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money);
    }
}



