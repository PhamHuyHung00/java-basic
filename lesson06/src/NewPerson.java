import java.util.Scanner;

public class NewPerson {
    int code;
    String name;
    double speed;

   void vehicle() {
        Scanner sc = new Scanner(System.in);


        System.out.println("nhập kt: ");
        int a = sc.nextInt();
        NewPerson [] listpreson = new NewPerson[a];
        for (int i = 0; i < a; i++) {
            System.out.printf("Nhập thông tin %d: \n", i + 1);
            System.out.println("mã số: ");
            int code = sc.nextInt();
            System.out.print("vận tốc: ");
            double speed = sc.nextDouble();
            sc.nextLine();
            System.out.print("Tên: ");
            String name = sc.nextLine();

        }
    }

    public void display(){

        System.out.println("mã số: " + code + " - " + "tên: " + name + " - " + "Vận tốc: " + speed);
    }
}
