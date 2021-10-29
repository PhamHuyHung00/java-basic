import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bt07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tamGiacVuongCan();
        tamGiacDeu();
        hinhVuong();
        lesson04();
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        System.out.printf("%d nguyên tố đầu tiên là: \n", n);
        int count = 0;
        int a = 0;
        while (count < n) {
            if (prime(a)) {
                System.out.print(a + " ");
                count++;
            }
            a++;
        }
        for (int i = 0; i < 10; i++) {
            if (prime(i)) {
                System.out.printf("    số nguyên tố nhỏ hơn 10 : " + i + " \t");
            }


        }
        Random rd = new Random();
        int number = rd.nextInt(100);
        if (prime(number) == true) System.out.println(number + " là số nguyên tố");////random số nguyên tố
        else System.out.println(number + " không là số nguyên tố");

        chuanHoaChuoi();
        multiArray();
        checkEmail();


    }


    public static void tamGiacVuongCan() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Vui lòng nhập: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*  ");
            System.out.println(" ");
        }
    }

    public static void tamGiacDeu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Vui lòng nhập: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int a = 1; a <= i; a++) System.out.print("*  ");
            System.out.println("");
        }

    }

    public static void hinhVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Vui lòng nhập: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) System.out.print("*  ");
            System.out.println("");

        }

    }

    static void lesson04() {
        String s = "You only live once, but if you do it right, once is enough";
        String[] words = s.trim().split("\\s+");
        System.out.println("tổng từ trong chuỗi là: " + words.length);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                System.out.println("index của o : " + i);
                count++;
            }
        }
        System.out.println("Số lần xuất hiện chữ o trong chuỗi " + s + " là " + count);
    }

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void chuanHoaChuoi() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Sau khi đc chuẩn hóa: " + name.trim().toLowerCase(Locale.ROOT).replaceAll("\\s+", " "));
        String[] s1;
        s1 = name.split(" ");
        for (int i = 0; i < s1.length; i++) {
            char kyTu = name.charAt(name.length() - i - 1);
            if (name.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndome");
                break;
            } else {
                System.out.println("chuỗi này không là chuỗi panlydome");
            }
        }
    }

    public static void multiArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập row-col:  ");
        int count = 0;
        int index = 0;
        int array[][];
        int x = sc.nextInt();
        int y = sc.nextInt();
        array = new int[x][y];
        System.out.println("nhập các phần tử trong mang: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                array[i][j] = sc.nextInt();
                ;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("phần tử nằm trên đường chéo chính là: " + array[0][0] + array[1][1] + array[2][2]);

    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập eamil bạn cần kiểm tra: ");
        String mail = sc.nextLine();
        String EMAIL_PATTERN = "^[a-zA-Z]+[a-z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(mail);
        if (matcher.find()) {
            System.out.println("*** Email hợp lệ ***");
        } else System.out.println("Email không hợp lệ");
    }


}