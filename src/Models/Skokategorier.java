package Models;

public class Skokategorier {
    int id;
    int skoid;
    int kategoriid;
    int betygid;

    public Skokategorier(int id, int skoid, int kategoriid, int betygid) {
        this.id = id;
        this.skoid = skoid;
        this.kategoriid = kategoriid;
        this.betygid = betygid;
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

    public int getKategoriid() {
        return kategoriid;
    }

    public void setKategoriid(int kategoriid) {
        this.kategoriid = kategoriid;
    }

    public int getBetygid() {
        return betygid;
    }

    public void setBetygid(int betygid) {
        this.betygid = betygid;
    }
}
