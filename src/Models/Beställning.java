package Models;

import java.util.List;

public class Beställning {
    int id;
    String kundnamn;
    String kundefternamn;
    int kundid;
    boolean expedierad;
   // List<Sko> cart;

    public Beställning() {
    }

    public Beställning(int id, String kundnamn, String kundefternamn, int kundid, boolean expedierad) {
        this.id = id;
        this.kundnamn = kundnamn;
        this.kundefternamn = kundefternamn;
        this.kundid = kundid;
        this.expedierad = expedierad;
    }

    public String getKundnamn() {
        return kundnamn;
    }

    public void setKundnamn(String kundnamn) {
        this.kundnamn = kundnamn;
    }

    public String getKundefternamn() {
        return kundefternamn;
    }

    public void setKundefternamn(String kundefternamn) {
        this.kundefternamn = kundefternamn;
    }

    public boolean isExpedierad() {
        return expedierad;
    }

    public void setExpedierad(boolean expedierad) {
        this.expedierad = expedierad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKundid() {
        return kundid;
    }

    public void setKundid(int kundid) {
        this.kundid = kundid;
    }
}
