package Models;

public class Skobeställning {
    int id;
    int skoid;
    int beställningid;

    public Skobeställning(int id, int skoid, int beställningid) {
        this.id = id;
        this.skoid = skoid;

        this.beställningid = beställningid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkoid() {
        return skoid;
    }

    public void setSkoid(int skoid) {
        this.skoid = skoid;
    }

    public int getBeställningid() {
        return beställningid;
    }

    public void setBeställningid(int beställningid) {
        this.beställningid = beställningid;
    }
}
