package pckg_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        String str1 = "Something completely different - from Monty Python";
        String str2 = "Boldly go where no one has gone before - from the captain Picard";

        String[] strArr1 = str1.split(" ");
        String[] strArr2 = str2.split(" ");

        List<String> strList1 = Arrays.asList(strArr1);
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList(strArr2));
        MultiListCLS<String> multiListCLS = new MultiListCLS<>(strList1);
        multiListCLS.compareListToListLength(strList2);
    }
}