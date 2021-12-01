import java.util.ArrayList;
import java.util.Scanner;

public class Transfers extends Surplus {
    String bankName;
    String accountNumber;
    double transferMoney;
    String description;

    public Transfers(double money) {
        super(money);
    }

    public void transfers(String bankName, String accountNumber, double transferMoney, String description) throws MyException {
        if (accountNumber.length() < 8 || accountNumber.length() > 16)
            throw new MyException("Số tài khoản không phù hợp !");
        if (transferMoney < 50000 || transferMoney > money) throw new MyException("Số tiền không hợp lệ !");
    }

}
