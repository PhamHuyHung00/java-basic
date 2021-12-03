import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetflixRepository Netrp = new NetflixRepository();
        Netrp.netflix = Netrp.getNetflix();
        Scanner sc = new Scanner(System.in);

        System.out.println("1-Hiển thị tất cả các bộ phim  2-Lấy ra 3 bộ phim có lượt xem cao nhất  3-Liệt kê phim theo category  4-Liệt kê phim theo thể loại ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                Netrp.print();
                break;
            case 2:
                Netrp.printHighViews();
                break;
            case 3:
                Netrp.printCategory(Category.MOVIE);
                break;
            case 4:
                Netrp.printMovieGenre("Gi");
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }


    }
}
