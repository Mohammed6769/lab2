import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercitiul2 {

    public static void ruleaza() {
        System.out.println("=== Exercitiul 2.7.2 ===");

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));

        Random rand = new Random();
        for (Student student : studenti) {
            for (int i = 0; i < 5; i++) {
                student.adaugaNota(4 + rand.nextInt(7));
            }
        }

        List<Student> integralisti = new ArrayList<>();
        List<Student> restantieri = new ArrayList<>();
        for (Student student : studenti) {
            if (student.esteIntegralist()) {
                integralisti.add(student);
            } else {
                restantieri.add(student);
            }
        }

        Collections.sort(studenti, new ByGroupComparator());
        Collections.sort(integralisti, new ByGradesComparator());
        Collections.sort(restantieri, new ByFailsComparator());

        System.out.println("--- b1) Alfabetic, pe grupe ---");
        afiseaza(studenti);

        System.out.println("--- b2) Integralisti, medii descrescatoare ---");
        afiseaza(integralisti);

        System.out.println("--- b3) Restantieri, numar restante crescator ---");
        afiseaza(restantieri);
    }

    private static void afiseaza(List<Student> lista) {
        if (lista.isEmpty()) {
            System.out.println("(nimeni)");
            return;
        }
        for (Student student : lista) {
            System.out.println(student);
        }
    }
}
