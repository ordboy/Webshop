package ViewModel;

public class Mv_Sko {
    public Mv_Sko(int id, double storlek, double pris, String märke, String färg, String kategori) {
        this.id = id;
        this.storlek = storlek;
        this.pris = pris;
        this.märke = märke;
        this.färg = färg;
        this.kategori = kategori;
    }

    int id;
    double storlek;
    double pris;
    String märke;
    String färg;
    String kategori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getStorlek() {
        return storlek;
    }

    public void setStorlek(double storlek) {
        this.storlek = storlek;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
