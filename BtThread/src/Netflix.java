import java.text.DecimalFormat;

public class Netflix {
    int id;
    String movieName;
    String writerName;
    String movieGenre;
    Category category;
    int view;
    double time;

    public Netflix(int id, String movieName, String writerName, String movieGenre, Category category, int view, double time) {
        this.id = id;
        this.movieName = movieName;
        this.writerName = writerName;
        this.movieGenre = movieGenre;
        this.category = category;
        this.view = view;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " - " + movieName + " - " + writerName + " - " + movieGenre+" - "+category+ " - " + formatMoney(view)+" lượt xem" + " - " + formatMoney(time)+" Phút";
    }
    public String formatMoney(double money) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money);
    }
}
