import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepository {
    public ArrayList<Product> products;


    public ArrayList<Product> getData() {
        products = new ArrayList<>();
        products.add(new Product(1, "Tivi", 6000000, Category.DOGIADUNG, 10, 2));
        products.add(new Product(2, "louis vuitton", 10000000, Category.THOITRANG, 12, 3));
        products.add(new Product(3, "Kem Trộn", 90000, Category.MYPHAM, 14, 4));
        products.add(new Product(4, "Socola", 140000, Category.THUCPHAM, 18, 5));
        return products;
    }

    public void printList() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void printPrice() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > 100000) {
                System.out.println(products.get(i));
            }
        }
    }

    public void compareProductByQuantity_sold() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getQuantity() - o1.getQuantity();
            }
        });
        System.out.println("Sắp xếp theo số lượng bán được: ");
        printList();
    }













//    public void compareTeacherByName(){
//        //Sắp xếp theo tên
//        Collections.sort(teachers, new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                //compareTo() Phương thức so sánh của class String
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println("Danh sách giảng viên sắp xếp theo tên: ");
//        printList();
//    }


}
