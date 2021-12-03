import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

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
//        netflix.forEach(System.out::println);
        for (Netflix n : netflix) {
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public void printHighViews() {
//        netflix.stream().sorted((i1, i2) -> i2.getView() - i1.getView()).limit(3).forEach(System.out::println);
        for (int i = 0; i < netflix.size(); i++) {
            netflix.sort((o1, o2) -> o2.getView()- o1.getView());
            if (netflix.get(i).getView()>=netflix.get(2).getView()){
                System.out.println(netflix.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }




    }


    public void printCategory(Category category) {
//        netflix.stream().filter(num -> num.getCategory() == category).forEach(System.out::println);
        for (int i = 0; i < netflix.size(); i++) {
            if (netflix.get(i).getCategory() == category) {
                System.out.println(netflix.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }


    public void printMovieGenre(String movieGenre) {
        //        netflix.stream().filter(num -> num.getMovieGenre().contains(movieGenre));
        for (int i = 0; i < netflix.size(); i++) {
            if (netflix.get(i).getMovieGenre().contains(movieGenre)) {
                System.out.println(netflix.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
