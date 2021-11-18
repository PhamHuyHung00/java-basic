public enum Position {
    GK("GK"), DF("DF"), MF("MF"), FW("FW");
    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
