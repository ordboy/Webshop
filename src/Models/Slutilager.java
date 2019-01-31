package Models;

public class Slutilager {
    int id;
    int skoid;

    public Slutilager(int id, int skoid) {
        this.id = id;
        this.skoid = skoid;
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
}
