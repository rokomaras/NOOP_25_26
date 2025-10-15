package pckg_users;

public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void performSomething() {
        System.out.println("User " + name + " is performing something.");
    }

    public void info(java.util.Set<Integer> s) { }
    public void info(java.util.List<String> l) { }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + '}';
    }
}