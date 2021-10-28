import java.util.Scanner;

public class person {
    int maSo;
    String ten;
    double vanToc;


    person(int code, String name, double speed) {
        maSo = code;
        ten = name;
        vanToc = speed;
    }

    void display() {
        System.out.println("mã số: " + maSo + " - " + "tên: " + ten + " - " + "Vận tốc: " + vanToc);
    }

}
