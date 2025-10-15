package pckg_wildcards;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MultiListCLS<E> {
    private List<E> lst;

    public MultiListCLS(List<E> lst) {
        this.lst = lst;
    }

    public void listAllElements() {
        if (lst.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("List of elements: ");
            for (E element : lst) {
                System.out.println(element);
            }
        }
    }

    public void addElementToList(E element) {
        if (lst.contains(element)) {
            System.out.println("This element is already in the list.");
        } else {
            System.out.println("Adding " + element + " to the list.");
            lst.add(element);
        }
    }

    public void removeElementFromList(E element) {
        if (lst.contains(element)) {
            System.out.println("Removing " + element + " from the list.");
            lst.remove(element);
        } else {
            System.out.println("This element is not in the list.");
        }
    }

    public void compareListToListLength(List<?> lst) {
        System.out.println("This list info:");
        getClassElementTypeInfo(this.lst);
        System.out.println("Second list info:");
        getClassElementTypeInfo(lst);
        if (this.lst.size() > lst.size()) {
            System.out.println("The first list is longer than the second one.");
        } else if (this.lst.size() < lst.size()) {
            System.out.println("The first list is shorter than the second one.");
        } else {
            System.out.println("The lists are of the same length.");
        }
    }

    public void getClassElementTypeInfo(List<?> someList) {
        Stream<?> stream = someList.stream();
        Optional<?> fst = stream.findFirst();
        if (fst.isPresent()) {
            System.out.println("The list is of type: " + fst.get().getClass().getSimpleName());
            System.out.println("Size of the list: " + someList.size());
        } else {
            System.out.println("The list is empty.");
        }
    }
}