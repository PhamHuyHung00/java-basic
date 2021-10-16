import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cân nặng của bạn : " );
        double doubleNumber1 = sc.nextDouble();

        System.out.println("Nhập chiều cao của bạn  : ");
        double doubleNumber = sc.nextDouble();

        System.out.println("Cân nặng của bạn là : "+doubleNumber1 +" kg" );
        System.out.println("Chiều cao của bạn là : "+doubleNumber +" m");
        System.out.println("Chỉ số BMI của bạn là :" +doubleNumber1/(doubleNumber*2));
        //in ra màn hình chỉ số BMI


        System.out.println( "Cạnh Huyền của tam giác vuông bằng = "+ math(3, 4));
        //Sử dụng lớp Mart tính cạnh huyền tam giác vuông !
    }
        public  static double math( double x, double y) {
        return Math.sqrt(x * x + y * y);
    }



}


