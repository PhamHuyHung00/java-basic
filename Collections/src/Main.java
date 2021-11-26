import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FptRepository repo = new FptRepository();
        ArrayList<FptShop> fptShop = repo.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Liệt kê mỗi danh mục có bao nhiêu sản phẩm");
        System.out.println("2- Liệt kê mỗi hãng có bao nhiêu sản phẩm");
        System.out.println("3-Tìm sản phẩm theo tên, liệt kê số lượng sản phẩm tìm được và in thông tin các sản phẩm đó ra màn hình");
        System.out.println("Vui lòng chọn !!!!");
        int chosse = sc.nextInt();
        switch (chosse) {
            case 1:
                Map<Category, Integer> listCategory = new HashMap<>();
                for (int i = 0; i < fptShop.size(); i++) {
                    if (listCategory.get(fptShop.get(i).getCategory()) == null) {
                        listCategory.put(fptShop.get(i).getCategory(), 1);
                    } else {
                        listCategory.put(fptShop.get(i).getCategory(), listCategory.get(fptShop.get(i).getCategory()) + 1);
                    }
                }
                System.out.println("Liệt kê mỗi danh mục có bao nhiêu sản phẩm");
                for (Map.Entry<Category, Integer> entry : listCategory.entrySet()) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
                break;
            case 2:
                Map<String, Integer> listProducer = new HashMap<>();
                for (int i = 0; i < fptShop.size(); i++) {
                    if (listProducer.get(fptShop.get(i).getProducer()) == null) {
                        listProducer.put(fptShop.get(i).getProducer(), 1);
                    } else {
                        listProducer.put(fptShop.get(i).getProducer(), listProducer.get(fptShop.get(i).getProducer()) + 1);
                    }
                }
                System.out.println("Liệt kê mỗi hãng có bao nhiêu sản phẩm");
                for (Map.Entry<String, Integer> entry : listProducer.entrySet()) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
                break;
            case 3:
                repo.printSearch();
        }
    }
}
