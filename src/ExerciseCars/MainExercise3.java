package ExerciseCars;

public class MainExercise3 {
    public static void main ( String[] args ) {
        Car car = new Car ( "Toyota", "Black" );
        Motorcycle motorcycle = new Motorcycle ( "Honda", "White" );
        Truck truck = new Truck ( "Mazda", "Red" );

        car.start ( );
        car.accelerate ( );
        car.stop ( );

        motorcycle.start ( );
        motorcycle.accelerate ( );
        motorcycle.stop ( );

        truck.start ( );
        truck.accelerate ( );
        truck.stop ( );
    }
}
