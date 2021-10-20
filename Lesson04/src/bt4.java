import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm môn toán: ");
        float t = sc.nextFloat();

        System.out.println("Nhập điểm môn văn: ");
        float v = sc.nextFloat();

        System.out.println("Nhập điểm môn lý: ");
        float l = sc.nextFloat();

        System.out.println("Nhập điểm môn hóa: ");
        float h = sc.nextFloat();
        float tBC = (t + v + l + h) / 4;


//        -------------------------------------

        System.out.println("Nhập cạnh a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập cạnh b: ");
        float b = sc.nextFloat();
        System.out.println("nhập cạnh c: ");
        float c = sc.nextFloat();
        float delta = (b * 2) - (4 * a * c);
        float x1;
        float x2;
        System.out.println("Nhập bài tập cần chạy: ");
        int baiTap = sc.nextInt();

        switch (baiTap) {
            case 1:
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Phưởng trình vô nghiệm !!");
                    } else System.out.println("phương trình có 1 nghiệm x = " + (-c / b));
                }
                if (delta < 0 & a != 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (delta == 0 & a != 0) {
                    x1 = (-b / 2 * a);
                    System.out.println("delta bằng: " + delta);
                    System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
                } else if (delta > 0 & a != 0) {
                    x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                    x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("delta bằng: " + delta);
                    System.out.println("Phương trình có 2 nghiệm x1 =" + x1 + " và x2 = " + x2);
                }
                break;
            case 2:
                if (tBC < 4.5) {
                    System.out.println("Trung bình công 4 môn: " + tBC);
                    System.out.println("Hạng yếu ! Học lại thôi bé ~~");
                }
                if (tBC >= 4.5 & tBC < 6.5) {
                    System.out.println("Trung bình công 4 môn: " + tBC);
                    System.out.println("Hạng trung bình ! Cần cố gắng nhiều ~~");
                }
                if (tBC >= 6.5 & tBC < 8) {
                    System.out.println("Trung bình công 4 môn: " + tBC);
                    System.out.println("Khá lắm bé iu ~~~");
                }
                if (tBC > 8) {
                    System.out.println("Trung bình công 4 môn: " + tBC);
                    System.out.println("Giỏi lắm !! Cố gắng phát huy ~~~");
                }
                break;
            case 3:
                if (a + b > c && b + c > a && a + c > b) {
                    System.out.println("Ba cạnh trên hợp lại là Tam Giác");
                    if (a == b && b == c) {
                        System.out.println("Đây là tam giác đều");
                    } else if (a == b || a == c || b == c) {
                        System.out.println("Đây là tam giác cân");
                    } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                        System.out.println("Đây là tam giác vuông");
                    } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                        System.out.println("Đây là tam giác tù");
                    } else
                        System.out.println("Đây là tam giác nhọn");
                } else
                    System.out.println("Đây không phải là tam giác");
            default:
                System.out.println("--Kết thúc---");

        }
    }
}
