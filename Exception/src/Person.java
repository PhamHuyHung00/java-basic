import java.time.LocalDate;

public class Person {

    public static void person(String name, int year, String address) throws MyException {
        LocalDate localDate = LocalDate.now();
        int current_year = localDate.getYear();
        if (year < 1900 || year > current_year) throw new MyException("Năm sinh không phù hợp");
        int age = current_year - year;
        System.out.println("Tuổi của bạn là: " + age);
        if (age > 18) {
            System.out.println("Bạn đã trưởng thành, đủ điều kiện bầu cử !!");
        }
    }
}
