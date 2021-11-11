public class Main {
    public static void main(String[] args) {

        Waiter w = new Waiter(1, "Nguyễn Văn A", 21, 3400000, 1200000);
        System.out.println(w.toString());

        Kitchen k = new Kitchen(2, "Nguyễn Văn B", 25, 5400000, 2300000);
        System.out.println(k.toString());

    }
}
