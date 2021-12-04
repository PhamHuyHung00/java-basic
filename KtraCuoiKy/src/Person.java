import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    static String USERNAME = "huyhung";
    static String PASSWORD = "1";
    static String EMAIL = "hung@gmail.com";
    static Scanner sc = new Scanner(System.in);
    static String ChangeEmail = "";
    static String ChangePassword = "";
    static String ChangeUsername = "";
    static String registerUsername = "";
    static String registerEmail = "";
    static String registerPassword = "";
    static String inputPassword = "";
    static String inputEmail = "";
    static List<Information> listInformation = new ArrayList<>();


    public static void Menu() {
        System.out.println("1-Đăng nhập   2-Đăng ký ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                login2();
                Change();
                break;
            case 2:
                Register();
                break;

        }

    }

    public static void Menu1() {
        System.out.println("1-Đăng nhập   2-Đăng ký ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                inputLogin();
                break;
            case 2:
                Register();
                break;

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
                        System.out.println("Chào mừng " + USERNAME);
                        isCheck = true;
                        Change();

                    } else {
                        System.out.println("Đăng nhập lại");
                    }
                    if (!username.equals(USERNAME)) {
                        System.out.println("Kiểm tra lại username");
                    }
                }
                break;
            case 2:
                ForgotPassword();
                login3();
                break;

        }
    }

    public static void Register() {
        System.out.println("Nhập username: ");
        registerUsername = sc.nextLine();
        boolean isCheck = false;
        while (!isCheck) {
            try {
                registerEmail = checkEmail();
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
            try {
                registerPassword = checkPassword();
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        listInformation.add(new Information(registerUsername, registerEmail, registerPassword));
    }

    public static void login2() {
        boolean isCheck = false;
        sc.nextLine();
        String username;
        String password;
        while (!isCheck) {
            System.out.println("Nhập username: ");
            username = sc.nextLine();

            System.out.println("Nhập password: ");
            password = sc.nextLine();
            if (username.equals(registerUsername) && password.equals(registerPassword)) {
                System.out.println("Đăng nhập thành công !!!");
                System.out.println("Chào mừng " + registerUsername);
                isCheck = true;


            } else {
                System.out.println("Đăng nhập lại");
            }
            if (!username.equals(registerUsername)) {
                System.out.println("Kiểm tra lại username");
            }
        }
    }


    public static void ForgotPassword() {
        boolean isCheck = false;
        System.out.println("Nhập email của bạn: ");
        inputEmail = sc.nextLine();
        if (inputEmail.equals(EMAIL)) {
//            System.out.println("Nhập mật khẩu cần đổi: ");
//            inputPassword = sc.nextLine();
            while (!isCheck) {
                try {
                    inputPassword = checkPassword();

                    isCheck = true;
                    System.out.println("Đổi mật khẩu thành công !!");

                    listInformation.add(new Information(USERNAME, EMAIL, inputPassword));
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }

        } else System.out.println("Tài khoản không tồn tại");

    }

    public static void login3() {
        System.out.println("Đăng nhập tài khoản:");
        boolean isCheck = false;
        while (!isCheck) {
            System.out.println("Nhập username: ");
            sc.nextLine();
            System.out.println("Nhập password: ");
            String password = sc.nextLine();
            if (password.equals(inputPassword)) {
                System.out.println("Đăng nhập thành công !!!");
                System.out.println("Chào mừng " + USERNAME);
                isCheck = true;


            } else {
                System.out.println("Đăng nhập lại");
            }
            if (!password.equals(inputPassword)) {
                System.out.println("Kiểm tra lại password");
            }
        }
    }


    public static void Change() {
        System.out.println("1 - Thay đổi username-email-password" + "  2- Đăng xuất " + " 0 - Thoát chương trình");
        boolean isCheck = false;

        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                System.out.println("Nhập username : ");
                ChangeUsername = sc.nextLine();
                while (!isCheck) {
                    try {
                        ChangeEmail = checkEmail();
                        isCheck = true;
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        ChangePassword = checkPassword();
                        isCheck = true;
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }
                    listInformation.add(new Information(ChangeUsername, ChangeEmail, ChangePassword));
                }
                Change();
                break;
            case 2:
                Menu1();
                Change();
                break;
            case 0:
                System.out.println("^_^ Bye Bye ^_^");
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này !!!");
        }


    }

    public static void inputLogin() {
        boolean isCheck = false;
        sc.nextLine();
        while (!isCheck) {
            System.out.println("Nhập username: ");
            String username = sc.nextLine();
            System.out.println("Nhập password: ");
            String password = sc.nextLine();
            if (username.equals(ChangeUsername) && password.equals(ChangePassword)) {
                System.out.println("Đăng nhập thành công !!!");
                System.out.println("Chào mừng " + ChangeUsername);
                isCheck = true;


            } else {
                System.out.println("Đăng nhập lại");
            }
            if (!username.equals(ChangeUsername)) {
                System.out.println("Kiểm tra lại username");
            }
        }
    }


    public static void ChangeAccount() {
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        sc.nextLine();
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
        System.out.println("Nhập email: ");
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
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;])(?=\\S+$).{7,15}";
        if (!Pattern.matches(regex, password)) throw new MyException("Password không hợp lệ !!!");
        else {
            return password;
        }
    }
}
