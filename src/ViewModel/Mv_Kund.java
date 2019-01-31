package ViewModel;

import Models.Beställning;

import java.util.List;

public class Mv_Kund {
    int id;
    String namn;
    List<Beställning> cart;

    public Mv_Kund(int id, String namn, List<Beställning> cart) {
        this.id = id;
        this.namn = namn;
        this.cart = cart;
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

    public List<Beställning> getCart() {
        return cart;
    }

    public void setCart(List<Beställning> cart) {
        this.cart = cart;
    }
}
