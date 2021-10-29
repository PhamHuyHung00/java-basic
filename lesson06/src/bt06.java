import java.util.Arrays;
import java.util.Scanner;

public class bt06 {
    public static void main(String[] args) {
//        int a[];
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap kt: ");
//        n = sc.nextInt();
//        a = new int[n]
//        nhap(a, n);
//        xuat(a, n);
//        System.out.println("Min: " + min(a, n));
//        System.out.println("Max: " + max(a, n));
//        //---------------------------------------
//        System.out.println("nhap kt2: ");
//        int b = sc.nextInt();
//        person[] listPerson = new person[b];
//        for (int i = 0; i < listPerson.length; i++) {
//            System.out.printf("Nhập thông tin %d: \n", i + 1);
//            System.out.println("mã số: ");
//            int maSo = sc.nextInt();
//            System.out.print("vận tốc: ");
//            double vanToc = sc.nextDouble();
//            sc.nextLine();
//            System.out.print("Tên: ");
//            String ten = sc.nextLine();
//            person per = new person(maSo, ten, vanToc);
//            listPerson[i] = per;
//            per.display();
//        }
        NewPerson per = new NewPerson();
        per.vehicle();
        per.display();
    }

//    public static void nhap(int a[], int n) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap mang: ");
//        for (int i = 0; i < n; i++)
//            a[i] = sc.nextInt();
//    }
//
//    public static void xuat(int a[], int n) {
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + "\t");
//        System.out.println(" ");
//
//    }
//
//    public static int min(int a[], int n) {
//        int min = a[0];
//        for (int i = 0; i < n; i++) {
//            if (a[i] < min)
//                min = a[i];
//        }
//        return min;
//    }
//
//    public static int max(int a[], int n) {
//        int max = a[0];
//        for (int i = 0; i < n; i++) {
//            if (a[i] > max)
//                max = a[i];
//        }
//        return max;
//    }


}



