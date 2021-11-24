public class Kitchen extends Employee{
    double serviceCharge;

    public Kitchen(int id, String name, int age, double basicSalary, double serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public String toString() {
        return super.toString() +" - "+ "Phí dịch vụ: "+formatMoney(serviceCharge)+" - "+"Lương đứng bếp: "+formatMoney(calculatorSalary(getServiceCharge()));
    }

    @Override
    public double calculatorSalary(double serviceCharge) {
        return serviceCharge + basicSalary;
    }
}
