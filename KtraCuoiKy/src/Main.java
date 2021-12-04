import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Đăng nhập    2- Đăng ký");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                Person.login();
                break;
            case 2:
                Person.Register();
                Person.Menu();
                break;
        }
// gợi ý mật khẩu cô đỡ phải nghĩ 123ph_AM45

    }
}
