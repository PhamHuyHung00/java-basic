import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PersonRepository {
    public void getData() {
        ArrayList<Person> listPerson = new ArrayList<Person>();
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("ReadFile/movie.json");

            Type objectType = new TypeToken<ArrayList<Person>>() {}.getType();
            listPerson = gson.fromJson(reader,objectType);
            for (Person p:listPerson) {
                System.out.println(p);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thầy file");
        }

    }
}
