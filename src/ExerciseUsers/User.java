package ExerciseUsers;

public class User {
    private String username;
    private String email;
    private String password;

    // Constructor
    public User ( String username, String email, String password ) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Phương thức đăng nhập
    public boolean login ( String enteredUsername, String enteredPassword ) {
        return username.equals ( enteredUsername ) && password.equals ( enteredPassword );
    }

    // Phương thức đăng ký
    public void register () {
        // Thực hiện logic đăng ký
        System.out.println ( "Đăng ký thành công!" );
    }

    // Phương thức đăng xuất
    public void logout () {
        // Thực hiện logic đăng xuất
        System.out.println ( "Đã đăng xuất." );
    }
}
