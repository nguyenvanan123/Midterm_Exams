package ExerciseGeometry;

public class Circle extends Shape {
    private double radius;

    public Circle () {
        super ( );
        this.radius = 1.0;
    }

    public Circle ( String color, double borderWidth, double radius ) {
        super ( color, borderWidth );
        this.radius = radius;
    }

    // Getter và setter cho thuộc tính radius
    public double getRadius () {
        return radius;
    }

    public void setRadius ( double radius ) {
        this.radius = radius;
    }

    // Cài đè phương thức tính diện tích
    @Override
    public double calculateArea () {
        return Math.PI * radius * radius;
    }

    // Cài đè phương thức tính chu vi
    @Override
    public double calculatePerimeter () {
        return 2 * Math.PI * radius;
    }

    // Cài đè phương thức toString
    @Override
    public String toString () {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString ( );
    }
}
