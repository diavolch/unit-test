package seminars.third.tdd;

public class User {

    String name;
    String password;



    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }
    public boolean isAdmin() {
        return isAdmin;
    }
    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name == name && this.password == password) {
            isAuthenticate = true;
        }
        return false;
    }
}
