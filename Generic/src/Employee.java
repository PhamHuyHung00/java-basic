import java.text.DecimalFormat;

public abstract class Employee {
    int id;
    String name;
    int age;
    double basicSalary;

    public Employee(int id, String name, int age, double basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public abstract double calculatorSalary(double money);

    @Override
    public String toString() {
        return "ID:"+id +" - "+"Name:"+ name +" - "+"Age:"+ age +" - "+"Lương cơ bản:" + formatMoney(basicSalary);
    }
    public String formatMoney(double money){
        DecimalFormat formater = new DecimalFormat("###,###,###");
        return formater.format(money);
    }
}
