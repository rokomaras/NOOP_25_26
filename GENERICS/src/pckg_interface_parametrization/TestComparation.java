package pckg_interface_parametrization;

public class TestComparation {
    public static void main(String[] args) {
        String sFst = "Tamo neki string...";
        String sSnd = "Novi string koji je puno duzi i nema kraja...";
        CompareTWO<String> stringCompareTWO = new CompareTWO<>(sFst, sSnd);
        stringCompareTWO.performComparison();
        System.out.println("-------------------");

        Integer iFst = 100;
        Integer iSnd = 100;
        CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(iFst, iSnd);
        integerCompareTWO.performComparison();
        System.out.println("-------------------");

        StringLenghtComparison fst = new StringLenghtComparison(sFst);
        StringLenghtComparison snd = new StringLenghtComparison(sSnd);
        CompareTWO<StringLenghtComparison> stringLenghtComparisonCompareTWO = new CompareTWO<>(fst, snd);
        stringLenghtComparisonCompareTWO.performComparison();
        System.out.println("-------------------");


    }
}
