package Models;

public class Betyg {
    int id;
    int skalaid;
    int kommentarid;
    int kundid;
    int skoid;
    int sifferbetyg;

    public Betyg(int id, int skalaid, int kommentarid, int kundid, int skoid, int sifferbetyg) {
        this.id = id;
        this.skalaid = skalaid;
        this.kommentarid = kommentarid;
        this.kundid = kundid;
        this.skoid = skoid;
        this.sifferbetyg = sifferbetyg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkalaid() {
        return skalaid;
    }

    public void setSkalaid(int skalaid) {
        this.skalaid = skalaid;
    }

    public int getKommentarid() {
        return kommentarid;
    }

    public void setKommentarid(int kommentarid) {
        this.kommentarid = kommentarid;
    }

    public int getKundid() {
        return kundid;
    }

    public void setKundid(int kundid) {
        this.kundid = kundid;
    }

    public int getSkoid() {
        return skoid;
    }

    public void setSkoid(int skoid) {
        this.skoid = skoid;
    }

    public int getSifferbetyg() {
        return sifferbetyg;
    }

    public void setSifferbetyg(int sifferbetyg) {
        this.sifferbetyg = sifferbetyg;
    }
}
