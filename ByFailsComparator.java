import java.util.Comparator;

public class ByFailsComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.numarRestante(), o2.numarRestante());
    }
}
