
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ischeck = false;
        System.out.println("1-tam giác, 2-thông tin người");
        int chosse = Integer.parseInt(sc.nextLine());

        switch (chosse) {
            case 1:
                while (!ischeck) {
                    try {
                        System.out.println("Nhập cạnh a: ");
                        double a = Double.parseDouble(sc.nextLine());
                        System.out.println("nhập cạnh b: ");
                        double b = Double.parseDouble(sc.nextLine());
                        System.out.println("nhập cạnh c: ");
                        double c = Double.parseDouble(sc.nextLine());
                        Triangle.triangle_test(a, b, c);
                        ischeck = true;
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Vui lòng nhập lại !");
                    } catch (NumberFormatException e) {
                        System.out.println("Các cạnh tam giác phải là số !");
                        System.out.println("Nhập lại");
                    }
                }
            case 2:
                while (!ischeck) {
                    try {
                        System.out.println("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.println("Nhập địa chỉ: ");
                        String address = sc.nextLine();
                        System.out.println("Nhập năm sinh: ");
                        int year = Integer.parseInt(sc.nextLine());
                        Person.person(name, year, address);
                        ischeck = true;
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Vui lòng nhập lại");
                    } catch (NumberFormatException e) {
                        System.out.println("Năm sinh phải là số !");
                        System.out.println("Nhập lại !!!!!");
                    }

                }
        }


    }
}
