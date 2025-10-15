package pckg_users;

import java.util.List;

public class ListOperator {

    public static void listAllUsers(List<? super AdvancedUser> list) {
        System.out.println("\nExpected list of User to AdvancedUser:");
        list.forEach(System.out::println);
    }

    public static <E extends BestUser> void listAllBestUsers(List<E> list) {
        System.out.println("\nList of Best Users:");
        list.forEach(System.out::println);
    }
}