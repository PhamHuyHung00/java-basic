import java.util.Scanner;

public class Dog {
    String breed;
    String size;
    String color;
    int age;

    //Contructor mặc định
    public  Dog(){
        System.out.println("Gâu Gâu Gâu");
    }

    //Contructor có tham số
    public Dog(String loai, String kichThuoc, String mauLong, int tuoi){
        this.breed = loai;
        this.size = kichThuoc;
        this.color = mauLong;
        this.age = tuoi;
    }

    @Override
    public String toString() {
        return breed +" - "+ size+" - " + color+" - " + age;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập loài");
        breed = sc.nextLine();
        System.out.println("nhập kích thước: ");
        size = sc.nextLine();
        System.out.println("Nhập màu lông: ");
        color=sc.nextLine();
        System.out.println("nhập tuổi: ");
        age = sc.nextInt();
    }

}
