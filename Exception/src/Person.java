public class Person {
    public static void person(String name, int year, String address) throws MyException {
        if (year < 1900 || year > 2021) throw new MyException("Năm sinh không phù hợp");
        int age = 2021 - year;
        System.out.println("Tuổi của bạn là: " + age);
        if (age > 18) {
            System.out.println("Bạn đã trưởng thành, đủ điều kiện bầu cử !!");
        }
    }
}
