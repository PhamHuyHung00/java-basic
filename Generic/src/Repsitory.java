import java.util.ArrayList;

public class Repsitory {
    ArrayList<Waiter> listWaiter;
    ArrayList<Kitchen> listKitchen;

    public ArrayList<Waiter> getDataWaiter() {
        listWaiter = new ArrayList<>();
        listWaiter.add(new Waiter(1,"Phạm Huy A",21,3400000,2340000));
        listWaiter.add(new Waiter(2,"Phạm Huy B",22,3500000,2560000));
        listWaiter.add(new Waiter(3,"Phạm Huy C",23,3600000,2780000));
        return listWaiter;
    }
    public ArrayList<Kitchen> getDataKitchen(){
        listKitchen = new ArrayList<>();
        listKitchen.add(new Kitchen(4,"Nguyễn Văn D",24,3710000,2900000));
        listKitchen.add(new Kitchen(5,"Nguyễn Văn E",25,3820000,2919000));
        listKitchen.add(new Kitchen(6,"Nguyễn Văn G",26,3930000,2928000));

        return listKitchen;
    }

}
