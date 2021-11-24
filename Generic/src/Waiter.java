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

    @Override
    public double calculatorSalary(double compensate) {
        return compensate + basicSalary;
    }

    @Override
    public String toString() {
        return super.toString() +" - "+" Thưởng: " + formatMoney(compensate)+" - "+"Lương bồi bàn: "+formatMoney(calculatorSalary(getCompensate()));
    }
}
