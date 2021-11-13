

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
        products.add(new FptShop(4, "AirPods Pro", "Đắt", 5400000, 12, 4, "Apple", Category.Apple));
        products.add(new FptShop(5, "Loa Bluetooth JBL Charge 5", "Đắt", 3990000, 13, 5, "Sony", Category.ACCESSORY));
        products.add(new FptShop(6, "Loa Bluetooth ", "rẻ", 1500000, 20, 3, "Sony", Category.ACCESSORY));
        return products;
    }

    public void printList() {
        for (FptShop f : products) {
            System.out.println(f);
        }
    }

    public void printCategory(Category category ) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCategory()==category ){
                System.out.println(products.get(i));
            }

        }
    }

    public void printProduce() {
        Scanner sc = new Scanner(System.in);
        String produce = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProducer().equalsIgnoreCase(produce)) {
                System.out.println(products.get(i));
            }
        }
    }

    public void printPrice(){
        for (int i = 0; i <products.size(); i++) {
            if (products.get(i).getPrice()<=2000000){
                System.out.println(products.get(i));
            }

        }
    }
    public void printPrice2(){
        for (int i = 0; i <products.size(); i++) {
            if (products.get(i).getPrice()>=2000000 & products.get(i).getPrice()<=4000000){
                System.out.println(products.get(i));
            }
        }
    }
    public void printPrice3(){
        for (int i = 0; i <products.size(); i++) {
            if (products.get(i).getPrice()>=4000000 & products.get(i).getPrice()<=7000000){
                System.out.println(products.get(i));
            }
        }
    }
    public void printPrice4(){
        for (int i = 0; i <products.size(); i++) {
            if (products.get(i).getPrice()>=7000000 & products.get(i).getPrice()<=13000000){
                System.out.println(products.get(i));
            }
        }
    }
    public void printPrice5(){
        for (int i = 0; i <products.size(); i++) {
            if (products.get(i).getPrice()>=13000000){
                System.out.println(products.get(i));
            }
        }
    }


    public void printSearch() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                System.out.println(products.get(i));
            }

        }
    }

}
