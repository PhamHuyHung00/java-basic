public class Information {
    String username;
    String email;
    String password;

    public Information(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Thông tin tài khoản của bạn: \t" + " Tài khoản: " + username + " Mật khẩu: " + password + " Email: " + email;
    }
}
