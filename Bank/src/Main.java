import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repsitory rp = new Repsitory();
        rp.surplus = rp.getSurplus();
        rp.printBank();
        rp.print();
        rp.transactionHistories = rp.getTransactionHistories();
        rp.printHistory();


    }


}
