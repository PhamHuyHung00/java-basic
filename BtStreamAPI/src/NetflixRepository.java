import java.util.ArrayList;

public class NetflixRepository {
    public ArrayList<Netflix> netflix;

    public ArrayList<Netflix> getNetflix() {
        netflix = new ArrayList<>();
        netflix.add(new Netflix(1, "Ký sinh trùng", "Bong Joon Ho", "Hài hước", Category.MOVIE, 2100, 65));
        netflix.add(new Netflix(2, "One Piece", "Oda Eiichiro", "Hài hước", Category.MOVIE, 2137, 23));
        netflix.add(new Netflix(3, "Running man", "li chong", "Giải trí", Category.TVSHOW, 2510, 65));
        netflix.add(new Netflix(4, "Rap việt ", "Vương Khang", "Giải trí", Category.TVSHOW, 9700, 45));
        netflix.add(new Netflix(5, "The Dark Knight ", "Christopher Nolan", "Hành động", Category.MOVIE, 4700, 55));
        netflix.add(new Netflix(6, "Judgment Day", "John Connor", "Hành động", Category.MOVIE, 1700, 35));
        netflix.add(new Netflix(7, "Say I Do", "Jeremiah Brent", "Vui Vẻ", Category.TVSHOW, 300, 30));
        return netflix;
    }


    public void print() {
        System.out.println("---------- Tất cả bộ phim ----------");
        netflix.forEach(System.out::println);
    }


    public void printHighViews() {
        System.out.println("-------- 3 bộ phim có lượt xem cao nhất ---------- ");
        netflix.stream().sorted((i1, i2) -> i2.getView() - i1.getView()).limit(3).forEach(System.out::println);
    }


    public void printCategory(Category category) {
        System.out.println("---------- Liệt kê phim theo Category ----------");
        netflix.stream().filter(num -> num.getCategory() == category).forEach(System.out::println);
    }


    public void printMovieGenre(String movieGenre) {
        System.out.println("---------- Liệt kê phim theo thể loại ---------");
        netflix.stream().filter(num -> num.getMovieGenre().contains(movieGenre)).forEach(System.out::println);
    }
}
