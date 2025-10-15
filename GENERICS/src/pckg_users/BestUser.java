package pckg_users;

public class BestUser extends User {
    public BestUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        System.out.println("BestUser " + name + " is performing something.");
    }
}