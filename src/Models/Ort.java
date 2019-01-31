package Models;

public class Ort {
    int id;
    String namn;
    int postnr;

    public Ort(int id, String namn, int postnr) {
        this.id = id;
        this.namn = namn;
        this.postnr = postnr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getPostnr() {
        return postnr;
    }

    public void setPostnr(int postnr) {
        this.postnr = postnr;
    }
}
