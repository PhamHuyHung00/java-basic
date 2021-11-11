public class Waiter extends Employee {
    double compensate;

    public Waiter(int id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public double getCompensate() {
        return compensate;
    }

    public void setCompensate(double compensate) {
        this.compensate = compensate;
    }

//    @Override
//    public void display() {
//        super.display();
//        System.out.println("\t"+"Lương bồi bàn: "+formatMoney(calculatorSalary(( getCompensate())))+"\n");
//    }

    @Override
    public String toString() {
        super.toString();
        return "ID:" + id + " - " + "Name:" + name + " - " + "Age:" + age + " - " + "Lương cơ bản:" + formatMoney(basicSalary) + " - " + "Thưởng:" + formatMoney(compensate) + " - " + "Lương phục vụ:" + formatMoney(calculatorSalary((getCompensate())));
    }

    @Override
    public double calculatorSalary(double compensate) {
        return compensate + basicSalary;
    }
}
