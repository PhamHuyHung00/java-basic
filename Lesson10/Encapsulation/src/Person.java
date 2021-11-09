public class Person {
   private String name;
   private int age;
   private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Ghi dữ liệu
   public void setName(String name){
       this.name = name;
   }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//đọc dự liệu
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name+" - "+ age+" - "+ address;
    }


    public void display(){
        System.out.println("Tên tôi là: "+ name + ", tôi đến từ " +address);
    }
}
