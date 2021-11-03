import com.google.gson.annotations.SerializedName;

public class Person {
    @SerializedName("id")
   int id;
    @SerializedName("movie's name")
   String name;
    @SerializedName("Movie Genre")
   String genres;
    @SerializedName("film length")
   double lenght;
    @SerializedName("producer")
   String producer;
    @SerializedName("release year")
   int year;

    public Person(int id, String name, String genres, double lenght, String producer, int year) {
        this.id = id;
        this.name = name;
        this.genres = genres;
        this.lenght = lenght;
        this.producer = producer;
        this.year = year;
    }

    @Override
    public String toString() {
        return id+" - "+name+" - "+genres+" - "+lenght+" - "+producer+" - "+year;
    }
}
