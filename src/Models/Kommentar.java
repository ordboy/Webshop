package Models;

public class Kommentar {
    int id;
    String kommentar;

    public Kommentar(int id, String kommentar) {
        this.id = id;
        this.kommentar = kommentar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
