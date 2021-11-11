public class Kitchen extends Employee {
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

//    @Override
//    public void display() {
//        super.display();
//        System.out.println("\t"+"Lương đầu bếp: "+ formatMoney(calculatorSalary(getServiceCharge()))+"\n");
//    }

    @Override
    public String toString() {
        return "ID:" + id + " - " + "Name:" + name + " - " + "Age:" + age + " - " + "Lương cơ bản:" + formatMoney(basicSalary) + " - " + "Phí dịch vụ:" + formatMoney(serviceCharge) + " - " + "Lương đầu bếp:" + formatMoney(calculatorSalary(getServiceCharge()));
    }

    @Override
    public double calculatorSalary(double serviceCharge) {
        return serviceCharge + basicSalary;
    }
}
