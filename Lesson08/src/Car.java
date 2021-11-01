public class Car {
    String model;
    String color;
    String brand;
    float speed;
    String size;

    public Car(){

    }

    public Car(String model, String color, String brand, float speed, String size) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.size = size;
    }

    public Car(String model, String color, String brand) {
        this.model = model;
        this.color = color;
        this.brand = brand;
    }
    public void Speed(double speed){
        System.out.println(speed + "km/h");
    }
    public void Size(String size){
        System.out.println(size);
    }

    @Override
    public String toString() {
        return model+ " - "+color+" - "+brand+" - "+speed+" - "+size;
    }
}
