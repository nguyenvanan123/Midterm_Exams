package ExerciseGeometry;

public class MainExercise1 {
    public static void main ( String[] args ) {
        Circle circle = new Circle ( "blue", 2.5, 5.0 );
        Rectangle rectangle = new Rectangle ( "red", 1.0, 4.0, 6.0 );
        Square square = new Square ( "yellow", 1.5, 7.0 );

        // In thông tin về các hình học
        System.out.println ( circle );
        System.out.println ( "Area of the circle: " + circle.calculateArea ( ) );
        System.out.println ( "Perimeter of the circle: " + circle.calculatePerimeter ( ) );

        System.out.println ( rectangle );
        System.out.println ( "Area of the rectangle: " + rectangle.calculateArea ( ) );
        System.out.println ( "Perimeter of the rectangle: " + rectangle.calculatePerimeter ( ) );

        System.out.println ( square );
        System.out.println ( "Area of the square: " + square.calculateArea ( ) );
        System.out.println ( "Perimeter of the square: " + square.calculatePerimeter ( ) );
    }
}