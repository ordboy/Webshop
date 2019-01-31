package Models;

public class Kund {
    int id;
    String namn;
    String efternamn;
    int ortid;
    String password;

    public Kund(int id, String namn, String efternamn, int ortid, String password) {
        this.id = id;
        this.namn = namn;
        this.efternamn = efternamn;
        this.ortid = ortid;
        this.password = password;
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

    public String getEfternamn() {
        return efternamn;
    }

    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    public int getOrtid() {
        return ortid;
    }

    public void setOrtid(int ortid) {
        this.ortid = ortid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
