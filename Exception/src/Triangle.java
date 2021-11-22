public class Triangle {
    public static void triangle_test(double a, double b, double c) throws MyException{
        if (a<0 || b <0 || c <0) throw new MyException("Cạch tam giác không hợp lệ");
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Ba cạnh trên hợp lại là một tam giác !");
        }else System.out.println("Ba cạnh trên hợp lại không thành tam giác");
    }
}
