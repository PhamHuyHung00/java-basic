public enum Category {
    PHONE("PHONE"),LAPTOP("LAPTOP"),Apple("APPLE"),ACCESSORY("Accessory");
    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
