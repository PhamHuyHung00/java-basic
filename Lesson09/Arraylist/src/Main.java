import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(6);
        System.out.println("Danh sách ban đầu: ");
        printList(numbers);

        Collections.sort(numbers);//sắp xếp
        System.out.println("\nDanh sách sau khi sắp xếp: ");
        printList(numbers);

        numbers.add(2, 1);
        System.out.println("\nDanh sách sau khi chèn: ");
        printList(numbers);


        System.out.println("\nĐộ dài của mảng: " + numbers.size());

        ArrayList<Integer> listClone = new ArrayList<>();
        listClone.add(0);
        listClone.add(1);
        listClone.add(2);
        listClone.add(3);
        listClone.add(4);
        listClone.add(0);
        System.out.println("\nlistClone ban đầu: ");
        printList(listClone);
//        listClone.addAll(numbers);
//        System.out.println("\nlistClone");
//        printList(listClone);
//        listClone.addAll(2,numbers);
//        System.out.println("\nlistClone sau khi chèn: ");
//        printList(listClone);
//        System.out.println("\nvitri3:"+listClone.get(3));
//        listClone.set(3,6);
//        System.out.println("ds sau khi sửa");
//        printList(listClone);
//        listClone.remove(2);
//        System.out.println("\n sau khi xóa: ");
//        printList(listClone);

        ArrayList<Teacher> listTeacher = new ArrayList<>();
        Teacher teacher = new Teacher("Hung", 21, "HN");
        listTeacher.add(teacher);
        for (Teacher t : listTeacher) {
            System.out.print("\n" + t);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("H");
        names.add("U");
        names.add("Y");
        names.add("B");
        names.add("M");
        names.add("Z");
        System.out.println("\nDanh sách ban đầu: ");
        printName(names);
        names.remove("U");
        System.out.println("\nDanh sách sau khi xóa: ");
        printName(names);
        Collections.sort(names);
        System.out.println("\nDanh sách sau khi sắp xếp: ");
        printName(names);


    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + "\t");
        }
    }

    public static void printName(ArrayList<String> list) {
        for (String name : list) {
            System.out.print(name + "\t");

        }
    }
}
