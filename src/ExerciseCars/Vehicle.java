package ExerciseCars;

public class Vehicle {
    private String brand;
    private String color;

    // Constructor
    public Vehicle ( String brand, String color ) {
        this.brand = brand;
        this.color = color;
    }

    // Phương thức khởi động
    public void start () {
        System.out.println ( "Vehicle starts." );
    }

    // Phương thức tăng tốc
    public void accelerate () {
        System.out.println ( "Vehicle accelerates." );
    }

    // Phương thức dừng lại
    public void stop () {
        System.out.println ( "Vehicle stops." );
    }

    // Getter cho thuộc tính brand
    public String getBrand () {
        return brand;
    }

    // Getter cho thuộc tính color
    public String getColor () {
        return color;
    }
}
