public enum Category {
    TVSHOW("TVSHOW"),MOVIE("MOVIE");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
