import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FptRepository fRepo = new FptRepository();
        fRepo.products = fRepo.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập: ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                fRepo.printCategory(Category.LAPTOP);
                break;
            case 2:
                fRepo.printCategory(Category.PHONE);
                break;
            case 3:
                fRepo.printCategory(Category.ACCESSORY);
                break;
            case 4:
                fRepo.printCategory(Category.Apple);
                break;
            case 5:
                fRepo.printProduce();
                break;
            case 6:
                System.out.println("Sản phẩm dưới 2tr: ");
                fRepo.printPrice();
                break;
            case 7:
                System.out.println("Sản phẩm từ 2tr - 4tr:");
                fRepo.printPrice2();
                break;
            case 8:
                System.out.println("Sản phẩm từ 4tr - 7tr: ");
                fRepo.printPrice3();
                break;
            case 9:
                System.out.println("Sản phẩm từ 7tr - 13tr: ");
                fRepo.printPrice4();
                break;
            case 10:
                System.out.println("Sản phẩm trên 13tr: ");
                fRepo.printPrice5();
                break;
            case 15:
                fRepo.printSearch();
                break;
        }

    }
}
