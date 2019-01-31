package Repository;

import Models.*;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

public class Repository {


    public List getKund() {
        List<Kund> kundList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from kund ");

        ) {
            while (rs.next()) {
                kundList.add(new Kund(rs.getInt("id")
                        , rs.getString("namn"), rs.getString("efternamn"),
                        rs.getInt("ortid"), rs.getString("password")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kundList;
    }

    public List getSko() {
        List<Sko> skoList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select sko.lagerantal,sko.id,sko.storlek,pris,märke.namn as märke,färg.namn as färg, kategori.namn as knamn from sko " +
                     "inner join märke on sko.märkeID = märke.id " +
                     "inner join skofärg on sko.id = skofärg.skoID " +
                     "inner join färg on skofärg.färgID = färg.id " +
                             "inner join skokategorier on sko.id = skokategorier.skoID" +
                             " inner join kategori  on skokategorier.kategoriID = kategori.id "

                     );

        ) {
            while (rs.next()) {
                skoList.add(new Sko(rs.getInt("id")
                        , rs.getDouble("storlek")
                ,rs.getDouble("pris")
                ,rs.getInt("lagerantal")
                ,rs.getString("märke")
                ,rs.getString("färg")
                , rs.getString("knamn")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return skoList;
    }

    public List getSkobeställning() {
        List<Skobeställning> SkobeställningList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from skobeställning ");

        ) {
            while (rs.next()) {
                SkobeställningList.add(new Skobeställning(rs.getInt("id")
                        , rs.getInt("skoid"),
                        rs.getInt("beställningid")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SkobeställningList;
    }

    public List getSkoFärg() {
        List<Skofärg> SkofärgList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Skofärg ");

        ) {
            while (rs.next()) {
                SkofärgList.add(new Skofärg(rs.getInt("id")
                        , rs.getInt("skoid"),
                        rs.getInt("färgid")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SkofärgList;
    }

    public List getSkoKategorier() {
        List<Skokategorier> SkokategorierList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Skokategorier ");

        ) {
            while (rs.next()) {
                SkokategorierList.add(new Skokategorier(rs.getInt("id")
                        , rs.getInt("skoid"),
                        rs.getInt("kategoriid"),
                        rs.getInt("betygid")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SkokategorierList;
    }

    public List getSlutILager() {
        List<Slutilager> SlutilagerList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Slutilager ");

        ) {
            while (rs.next()) {
                SlutilagerList.add(new Slutilager(rs.getInt("id")
                        , rs.getInt("skoid")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SlutilagerList;
    }

    public List getOrt() {
        List<Ort> OrtList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Ort ");

        ) {
            while (rs.next()) {
                OrtList.add(new Ort(rs.getInt("id")
                        , rs.getString("namn"),
                        rs.getInt("postnr")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return OrtList;
    }

    public List getMärke() {
        List<Märke> MärkeList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Märke ");

        ) {
            while (rs.next()) {
                MärkeList.add(new Märke(rs.getInt("id")
                        , rs.getString("namn")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return MärkeList;
    }

    public List getBeställning() {
        List<Beställning> beställningList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select beställning.id , beställning.kundid ,beställning.expedierad , kund.namn, kund.efternamn from Beställning " +
                     " inner join kund on beställning.kundID = kund.id ");
             /*Statement stm2 = connection.createStatement();
             ResultSet rs2 = stm2.executeQuery("select ")*/

        ) {
            while (rs.next()) {
                beställningList.add(new Beställning(rs.getInt("id")
                        , rs.getString("namn")
                        , rs.getString("efternamn")
                        , rs.getInt("kundid")
                        , rs.getBoolean("expedierad")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return beställningList;
    }

    public List getKommentar() {
        List<Kommentar> KommentarList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Kommentar ");

        ) {
            while (rs.next()) {
                KommentarList.add(new Kommentar(rs.getInt("id")
                        , rs.getString("kommentar")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return KommentarList;
    }

    public List getBetyg() {
        List<Betyg> BetygList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Betyg ");

        ) {
            while (rs.next()) {
                BetygList.add(new Betyg(rs.getInt("id")
                        , rs.getInt("skalaid"),
                        rs.getInt("kommentarid"),
                        rs.getInt("kundid"),
                        rs.getInt("skoid"),
                        rs.getInt("sifferbetyg")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return BetygList;
    }

    public List getFärg() {
        List<Färg> FärgList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Färg ");

        ) {
            while (rs.next()) {
                FärgList.add(new Färg(rs.getInt("id")
                        , rs.getString("namn")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return FärgList;
    }

    public List getSkala() {
        List<Skala> SkalaList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select id,betygskala from Skala ");

        ) {
            while (rs.next()) {
                SkalaList.add(new Skala(rs.getInt("id")
                        , rs.getString("betygskala")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SkalaList;
    }

    public List getKategori() {
        List<Kategori> KategoriList = new ArrayList<>();
        Properties p = new Properties();

        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("select * from Kategori ");

        ) {
            while (rs.next()) {
                KategoriList.add(new Kategori(rs.getInt("id")
                        , rs.getString("namn")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return KategoriList;
    }


    public void addToCart(int beställingsid, int kundid, int skoid) {
        Properties p = new Properties();
        //String errormessage = null;
        try {
            p.load(new FileInputStream("C:\\Users\\stevi\\IdeaProjects\\tomtensdb\\pp.properties"));
        } catch (Exception ae) {
            ae.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webshop", p.getProperty("name"),
                p.getProperty("password"));
             CallableStatement stm = connection.prepareCall("call addtocart(?,?,?)");){

            stm.setInt(1,beställingsid);
            stm.setInt(2,kundid);
            stm.setInt(3,skoid);
            stm.execute();
            /*ResultSet rs = stm.getResultSet();
            while(rs.next()){
                errormessage = rs.getString("error");
            }*/
        } catch (SQLException e) {
            e.printStackTrace();

        }

        //return errormessage;
    }
}
