public enum Category {
    DOGIADUNG("Đồ gia dụng"), THOITRANG("Thời trang"), MYPHAM("Mỹ phẩm"), THUCPHAM("Thực phẩm");
    private String danhMuc;

    Category(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getDanhMuc() {
        return danhMuc;
    }
}
