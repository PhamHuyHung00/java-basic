import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        System.out.println("Cạnh Huyền của tam giác vuông bằng = " + math(3, 4));

        parityCheck(3);

        tong(2, 4);
        hieu(2, 4);
        nhan(2, 4);
        thuong(4, 4);


    }

    public static double math(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static void parityCheck(int a) {
        String s = a % 2 == 0 ? "a là số chẵn !" : "a là số lẻ !";
        System.out.println(s);
    }

    public static void tong(int x, int y) {
        System.out.printf("\nTổng của %d và %d bằng : %d ", x, y, x + y);
    }

    public static void hieu(int x, int y) {
        System.out.printf("\nHiệu của %d và %d bằng: %d", x, y, x - y);
    }

    public static void nhan(int x, int y) {
        System.out.printf("\nnhân của %d và %d bằng: %d", x, y, x * y);
    }

    public static void thuong(int x, int y) {
        System.out.printf("\nThương của %d và %d bằng: %d", x, y, x / y);
    }


}


