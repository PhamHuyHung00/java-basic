import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    static String USERNAME = "name";
    static String PASSWORD = "1";
    static String EMAIL = "techmater@gamil.com";
    static Scanner sc = new Scanner(System.in);
    static List<Information> listInformation = new ArrayList<>();


    public static void Menu(){
        System.out.println("1-Đăng nhập   2-Đăng ký ");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                login();

        }

    }

    public static void login() {
        boolean isCheck = false;
        System.out.println("1-Đăng nhập tài khoản     2-Quên mật khẩu ");
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                while (!isCheck) {
                    System.out.println("Nhập username: ");
                    String username = sc.nextLine();
                    System.out.println("Nhập password: ");
                    String password = sc.nextLine();
                    if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                        System.out.println("Đăng nhập thành công !!!");
                        isCheck = true;
                        Change();

                    }


//                    if (username != USERNAME) {
//                        System.out.println("Kiểm tra lại username");
//                    }
                    else {
                        System.out.println("1-Đăng nhập lại !!!");
                        System.out.println("2-Quên mật khẩu");
                    }


                }

                break;
            case 2:
                ForgotPassword();


        }
    }

    public static void ForgotPassword() {
        boolean isCheck = false;
        System.out.println("Nhập email của bạn: ");
        String inputEmail = sc.nextLine();

        if (inputEmail.equals(EMAIL)) {
            System.out.println("Nhập mật khẩu cần đổi: ");
            String inputPassword = sc.nextLine();
            while (!isCheck) {
                try {
                    inputPassword = checkPassword();
                    isCheck = true;
                    listInformation.add(new Information(USERNAME, EMAIL, inputPassword));
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }

        } else System.out.println("Tài khoản không tồn tại");
    }

    public static void Change() {
        System.out.println("1 - Thay đổi username" + " 2 - Thay đổi email" + " 3 - Thay đổi mật khẩu" + " 4 - Đăng xuất " + " 0 - Thoát chương trình");
        boolean isCheck = false;
        String ChangeEmail = "";
        String ChangePassword = "";
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Nhập username muốn thay đổi: ");
                String ChangeUsername = sc.nextLine();
                System.out.println("Nhập email muốn thay đổi: ");
                while (!isCheck) {
                    try {
                        ChangeEmail = checkEmail();
                        isCheck = true;
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Nhập mật khẩu muốn thay đổi: ");
                while (!isCheck) {
                    try {
                        ChangePassword = checkPassword();
                        isCheck = true;
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }
                }
                listInformation.add(new Information(ChangeUsername, ChangeEmail, ChangePassword));
                break;
            case 2:
                login();
                break;
            case 0:
                System.exit(0);
        }


    }


    public void ChangeAccount() {
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        boolean isCheck = false;
        String email = "";
        String password = "";
        while (!isCheck) {
            try {
                email = checkEmail();
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        while (!isCheck) {
            try {
                password = checkPassword();
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        listInformation.add(new Information(username, email, password));


    }

    public static String checkEmail() throws MyException {
        System.out.println("Nhập eamil: ");
        String email = sc.nextLine();
        String regex = "^[a-zA-Z]+[a-z0-9]*@{1}\\w+mail.com$";
        if (!Pattern.matches(regex, email)) throw new MyException("Email không hợp lệ !!!");
        else {
            return email;
        }
    }

    public static String checkPassword() throws MyException {
        System.out.println("nhập password: ");
        String password = sc.nextLine();
        String rexgex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;])(?=\\\\S+$).{7,15}$";
        if (!Pattern.matches(rexgex, password)) throw new MyException("Password không hợp lệ !!!");
        else {
            return password;
        }
    }
}
