package ExerciseAnimal;

public class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal ( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    // Phương thức để hiển thị tiếng kêu
    public void makeNoise () {
        System.out.println ( "Animal makes a sound." );
    }

    // Phương thức để di chuyển
    public void move () {
        System.out.println ( "Animal moves." );
    }

    // Getter cho thuộc tính name
    public String getName () {
        return name;
    }

    // Getter cho thuộc tính age
    public int getAge () {
        return age;
    }
}
