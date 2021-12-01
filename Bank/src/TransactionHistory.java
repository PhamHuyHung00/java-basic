import java.time.LocalDate;

public class TransactionHistory   {
    int code;
    String time;
    String description;
    String accountNumber;
    double money;


    public TransactionHistory(int code, String time) {
        this.code = code;
        this.time = time;
    }

    public TransactionHistory(String description, String accountNumber, double money) {
        this.description = description;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public TransactionHistory(int code, String time, String description, String accountNumber, double money) {
        this.code = code;
        this.time = time;
        this.description = description;
        this.accountNumber = accountNumber;
        this.money = money;
    }
    //    public TransactionHistory(int code, String time) {
//        this.code = code;
//        this.time = time;
//    }

    @Override
    public String toString() {
        return  code+" - "+time+" - "+description+" - "+accountNumber+" - "+rpo.formatMoney(money);
    }
    Repsitory rpo = new Repsitory();
}
