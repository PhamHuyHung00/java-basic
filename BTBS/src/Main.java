import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FootballRepository frepo = new FootballRepository();
        frepo.player = frepo.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("1: In toàn bộ cầu thủ --- 2:In đội hình 1GK - 4DF - 4MF - 2FW --- 3: In đội hình 1GK - 4DF - 3MF - 3FW --- 4: In dội hình 1GK - 3DF - 5MF - 2FW");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                frepo.print();
                break;
            case 2:
                frepo.formation();
                break;
            case 3:
                frepo.formationOne();
                break;
            case 4:
                frepo.formationTwo();
                break;

        }





    }

}

