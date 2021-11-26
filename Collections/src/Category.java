public enum Category {
    PHONE("Phone"),LAPTOP("Laptop"),APPLE("Apple"),ACCESSORY("Accessory");
    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
