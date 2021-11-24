import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<? extends Employee> list;
        Repsitory rep = new Repsitory();
        System.out.println("Thông tin Waiter");
        list = rep.getDataWaiter();
        prinlist(list);
        System.out.println("Thông tin Kitchen");
        list = rep.getDataKitchen();
        prinlist(list);
    }

    public static void prinlist(ArrayList<? extends Employee> list) {
        for (Object obj : list) {
            System.out.println(obj);

        }
    }
}
