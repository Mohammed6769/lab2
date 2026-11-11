import java.util.Comparator;

public class ByGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int rezultat = o1.getGrupa().compareTo(o2.getGrupa());
        if (rezultat != 0) {
            return rezultat;
        }
        rezultat = o1.getNume().compareTo(o2.getNume());
        if (rezultat != 0) {
            return rezultat;
        }
        return o1.getPrenume().compareTo(o2.getPrenume());
    }
}
