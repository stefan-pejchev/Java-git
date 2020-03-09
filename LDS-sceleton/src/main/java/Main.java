import implementations.ArrayList;
import interfaces.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("one");
        names.add("2");
        names.add("3");
        names.add("4");
        names.add("five");

        names.add(2, "almost two");
        names.add(2, "almost two1");
        names.add(2, "almost two2");
        names.add(2, "almost two3");
        names.add(2, "almost two4");

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));
        System.out.println(names.get(5));
        System.out.println(names.get(6));
        System.out.println(names.get(7));
        System.out.println(names.get(8));
        System.out.println(names.get(9));

        System.out.println(names.indexOf("five"));
        System.out.println(names.indexOf("almost two3"));
    }
}
