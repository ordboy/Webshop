package Models;

public class Skala {
    int id;
    String betygskala;

    public Skala(int id, String betygskala) {
        this.id = id;
        this.betygskala = betygskala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBetygskala() {
        return betygskala;
    }

    public void setBetygskala(String betygskala) {
        this.betygskala = betygskala;
    }
}
