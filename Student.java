import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String nume;
    private final String prenume;
    private final String grupa;
    private final List<Integer> note;

    public Student(String nume, String prenume, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public List<Integer> getNote() {
        return note;
    }

    public void adaugaNota(int nota) {
        note.add(nota);
    }

    public int numarRestante() {
        int restante = 0;
        for (int nota : note) {
            if (nota < 5) {
                restante++;
            }
        }
        return restante;
    }

    public boolean esteIntegralist() {
        return numarRestante() == 0;
    }

    public double medie() {
        if (note.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return (double) suma / note.size();
    }

    @Override
    public String toString() {
        String result = "";
        result += grupa;
        result += String.format(" %-12s", nume);
        result += String.format(" %-10s", prenume);
        result += String.format(" %s", note);
        result += String.format("  medie=%.2f", medie());
        result += String.format("  restante=%d", numarRestante());
        return result;
    }
}
