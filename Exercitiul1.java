import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Exercitiul1 {

    public static void ruleaza() {
        System.out.println("=== Exercitiul 2.7.1 ===");

        Random rand = new Random();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        int p = 4;

        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);

        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);
        Collections.sort(xMinusY);

        List<Integer> xPlusYLimitedByP = xPlusY.stream()
                .filter(v -> v <= p)
                .collect(Collectors.toList());

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("a) xPlusY = " + xPlusY);
        System.out.println("b) zSet = " + zSet);
        System.out.println("c) xMinusY = " + xMinusY);
        System.out.println("d) xPlusYLimitedByP (p = " + p + ") = " + xPlusYLimitedByP);
    }
}
