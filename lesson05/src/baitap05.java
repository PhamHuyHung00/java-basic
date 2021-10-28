import java.util.Scanner;

public class baitap05 {

    public static void main(String[] args) {
        lessonOne();
        lessonTwo("happy new year ", "new");
        lessonThree();

    }

    static void lessonOne() {
        String s = "hello every one";
        int count = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e')
                System.out.println(i);
                count++;
        }
        System.out.println("Số lần xuất hiện chữ e trong chuỗi " + s + " là " + count );
    }

    static void lessonTwo(String strA, String strB){
         int result = strA.indexOf(strB);
        System.out.println("vtri: "+result);
    }

    static void lessonThree() {
        String input;
        input = "khong co gi quy hon doc lap tu do";
        String[] inputs = input.split(" ");
        int index = 0;
        int lenMax =0;
        for (int i = 0; i < inputs.length; i++) {
            int len = inputs[i].length();
            if (len > lenMax){
                lenMax = len;
                index = i;
            }
        }
        System.out.println("Tu dai nhat trong chuoi là : "+ inputs[index]);
        }
    }




