package Object_Oriented_Programming_E_Commerce_Application;

public class User {
    private String name;
    private String surname;
    private String address;

    public User(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getAddress() {
        return address;
    }
}
