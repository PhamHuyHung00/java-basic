public class Student {
    int id;
    String name;
    float theoretical_Point;
    float practice_Point;

    public Student(int id, String name, float theoretical_Point, float practice_Point) {
        this.id = id;
        this.name = name;
        this.theoretical_Point = theoretical_Point;
        this.practice_Point = practice_Point;
    }

    public float medium_Score() {
        this.theoretical_Point = theoretical_Point;
        this.practice_Point = practice_Point;
        return (theoretical_Point + practice_Point) / 2;
    }

    @Override
    public String toString() {
        return "id: " + id + " - " + "Name: " + name + " - " + "Điểm lý thuyết: " + theoretical_Point + " - " + "Điểm thực hành: " + practice_Point;
    }
}
