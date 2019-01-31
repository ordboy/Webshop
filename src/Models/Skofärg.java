package Models;

public class Skofärg {
    int id;
    int skoid;
    int färgid;

    public Skofärg(int id, int skoid, int färgid) {
        this.id = id;
        this.skoid = skoid;
        this.färgid = färgid;
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

    public int getFärgid() {
        return färgid;
    }

    public void setFärgid(int färgid) {
        this.färgid = färgid;
    }
}
