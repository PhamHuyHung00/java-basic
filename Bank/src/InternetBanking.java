

public class InternetBanking {
    String mobile = "0123456789";
    String password = "123456";


    public void printLogin( String number,String pass) throws MyException {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập số điện thoại: ");
//        String number = sc.nextLine();
//        System.out.println("Nhập mật khẩu: ");
//        String pass = sc.nextLine();
//        if (number.equals(mobile) && pass.equals(password)) {
//            System.out.println("Đăng nhập thành công !!");
//        } else {
//            System.out.println("Kiểm tra lại !");
//        }
        if (number.equals(mobile) && pass.equals(password)) {
            System.out.println("Đăng nhập thành công !!!");
        }else  throw new MyException("Đăng nhập thất bại !!!");



    }

}


