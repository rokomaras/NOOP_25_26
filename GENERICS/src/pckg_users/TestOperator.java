package pckg_users;

import java.util.*;

public class TestOperator {
    public static void main(String[] args) {
        User user = new User("Vanda");
        BestUser bestUser = new BestUser("Rafaela");
        AdvancedUser advancedUser = new AdvancedUser("Ivana");
        SuperUser superUser = new SuperUser("Goran");

        User[] arrUsers = { user, bestUser, advancedUser, superUser };
        BestUser[] arrUsers2 = { bestUser, advancedUser, superUser };
        SuperUser[] arrUsers3 = { superUser, new SuperUser("Valerija"), new SuperUser("Teo") };

        List<User> users = new ArrayList<>(Arrays.asList(arrUsers));
        List<BestUser> bestUsers = new ArrayList<>(Arrays.asList(arrUsers2));
        List<SuperUser> superUsers = new ArrayList<>(Arrays.asList(arrUsers3));

        ListOperator.listAllUsers(users);
        ListOperator.listAllBestUsers(bestUsers);
        // ListOperator.listAllUsers(superUsers); // Ova linija ne radi zbog type-safety
    }
}