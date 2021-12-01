import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Repsitory {
    LocalDate localDate = LocalDate.now();
    DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String current = localDate.format(myformat);
    public ArrayList<Surplus> surplus;
    public ArrayList<TransactionHistory> transactionHistories;
    static ArrayList<TransactionHistory> list = new ArrayList<>();

    public ArrayList<Surplus> getSurplus() {
        surplus = new ArrayList<>();
        surplus.add(new Surplus(5000000));
        return surplus;
    }
    public ArrayList<TransactionHistory>getTransactionHistories(){
       transactionHistories = new ArrayList<>();
       transactionHistories.add(new TransactionHistory(1,current));
       return transactionHistories;
    }
    public void printHistory() {
        System.out.println("Lịch sử giao dịch: ");
        list.forEach(System.out::println);
    }
    public void print() {
        System.out.println("Số dư tài khoản: ");
        surplus.forEach(surplus1 -> System.out.println(formatMoney(surplus1.money)));
    }

public void printBank(){
    InternetBanking internetBanking = new InternetBanking();
    boolean ischeck = false;
    while (!ischeck) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số điện thoại: ");
            String mobile = sc.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password = sc.nextLine();
            internetBanking.printLogin(mobile, password);
            ischeck = true;
            System.out.println("nhập tên ngân hàng: ");
            String bankname = sc.nextLine();
            System.out.println("Nhập số tài khoản: ");
            String accountNumber = sc.nextLine();
            System.out.println("Nhập số tiền cần chuyển: ");
            double transferMoney = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập mô tả: ");

            String description = sc.nextLine();
            Transfers trans = new Transfers(5000000);
            trans.transfers(bankname, accountNumber, transferMoney, description);
            ischeck = true;
            list.add(new TransactionHistory(1,current,description,accountNumber,transferMoney));
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("Vui lòng nhập lại !");
        }

    }


}



    public String formatMoney(double money) {
        DecimalFormat formater = new DecimalFormat("###,###,###");
        return formater.format(money);
    }
}
