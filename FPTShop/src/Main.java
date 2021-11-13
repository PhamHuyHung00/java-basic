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
                fRepo.printCategoryPhone();
                break;
            case 2:
                fRepo.printCategoryLaptop();
                break;
            case 3:
                fRepo.printCategoryApple();
                break;
            case 4:
                fRepo.printCategoryAccessory();
                break;
            case 5:
                fRepo.printProduce("Dell");
                break;
            case 6:
                System.out.println("Sản phẩm dưới 2tr: ");
                fRepo.printPrice();
                System.out.println("Sản phẩm từ 2tr - 4tr:");
                fRepo.printPrice2();
                System.out.println("Sản phẩm từ 4tr - 7tr: ");
                fRepo.printPrice3();
                System.out.println("Sản phẩm từ 7tr - 13tr: ");
                fRepo.printPrice4();
                System.out.println("Sản phẩm trên 13tr: ");
                fRepo.printPrice5();
                break;
            case 7:
                fRepo.printSearch("AirPods Pro");
                break;
        }

    }
}
