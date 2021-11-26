

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FptRepository {
    public ArrayList<FptShop> products;

    public ArrayList<FptShop> getData() {
        products = new ArrayList<>();
        products.add(new FptShop(1, "Samsung Galaxy Z Flip3", "Đắt", 24990000, 10, 2, "Samsung", Category.PHONE));
        products.add(new FptShop(2, "Dell Inspiron 7501", "Đắt", 20990000, 11, 3, "Dell", Category.LAPTOP));
        products.add(new FptShop(3, "Dell Xps 13", "Đắt", 12900000, 8, 1, "Dell", Category.LAPTOP));
        products.add(new FptShop(4, "AirPods Pro", "Đắt", 5400000, 12, 4, "Apple", Category.APPLE));
        products.add(new FptShop(5, "Loa Bluetooth JBL Charge 5", "Đắt", 3990000, 13, 5, "Sony", Category.ACCESSORY));
        products.add(new FptShop(6, "Loa Bluetooth ", "rẻ", 1500000, 20, 3, "Sony", Category.ACCESSORY));
        return products;
    }

    public void printSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên sản phẩm muốn tìm kiếm !!!");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                System.out.println(products.get(i));
                count++;
            }

        }
        System.out.println("Số lượng sản phẩm tìm được : "+ count);
    }

}
