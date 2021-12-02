public class Main {
    public static void main(String[] args) {
        NetflixRepository Netrp = new NetflixRepository();
        Netrp.netflix = Netrp.getNetflix();

        Netrp.print();

        System.out.println();
        Netrp.printHighViews();

        System.out.println();
        Netrp.printCategory(Category.MOVIE);

        System.out.println();
        Netrp.printMovieGenre("giải trí");

    }
}
