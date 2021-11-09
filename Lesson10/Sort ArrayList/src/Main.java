
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng chọn: ");
        int choose = sc.nextInt();
        ProductRepository pRepo = new ProductRepository();
        pRepo.products = pRepo.getData();
        switch (choose) {
            case 1:
                System.out.println("Sản phẩm: ");
                pRepo.getData();
                break;
            case 2:
             pRepo.printPrice();
                break;
            case 3:
                pRepo.compareProductByQuantity_sold();
                break;
            case 0:
                System.out.println("Kết thúc chương trình");
                System.exit(0);

        }


    }
}
