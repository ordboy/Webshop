package Controller;

import Models.*;
import Repository.Repository;
import ViewModel.Mv_Kund;
import ViewModel.Mv_Sko;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Controller {
    Scanner scan = new Scanner(System.in);
    Repository r = new Repository();
    List<Skobeställning> skobeställningList = r.getSkobeställning();
    List<Beställning> beställningList = r.getBeställning();
    List<Betyg> betygList = r.getBetyg();
    List<Färg> färgList = r.getFärg();
    List<Kategori> kategoriList = r.getKategori();
    List<Kommentar> kommentarList = r.getKommentar();
    List<Kund> kundList = r.getKund();
    List<Märke> märkeList = r.getMärke();
    List<Ort> ortList = r.getOrt();
    List<Skala> skalaList = r.getSkala();
    List<Sko> skoList = r.getSko();
    List<Skofärg> skofärgList = r.getFärg();
    List<Skokategorier> skokategorierList = r.getSkoKategorier();
    List<Slutilager> slutilagerList = r.getSlutILager();
    List<Mv_Kund> mv_kundList;
    List<Mv_Sko> mv_skoList;
    Mv_Kund k2;
    Kund ogkund;
   // Map<Skobeställning,List<String>> skoribest = skoList.stream().collect(Collectors.groupingBy(Sko::getMärke));
    public void printUsers() {
        kundList.forEach(k -> System.out.println(k.getNamn()+" " + k.getEfternamn()));
    }

    public boolean checkUser( String namn, String password){
        for (Kund k: kundList) {
            if(k.getNamn().equalsIgnoreCase(namn) && k.getPassword().equalsIgnoreCase(password)){
                System.out.println("välkommen " + k.getNamn() + " " + k.getEfternamn());
                return true;
            }

        }
        System.out.println("felaktigt användarnamn/password");
        return false;
    }

    public void addUser(String namn, String password){
         ogkund = kundList.stream().filter(k->k.getNamn().equalsIgnoreCase(namn)&&k.getPassword().equalsIgnoreCase(password)).findAny().get();
        k2 = new Mv_Kund(ogkund.getId(),ogkund.getNamn(),getBeställningList(ogkund.getId()));

    }

    public List<Beställning> getBeställningList(int kundid){
       return beställningList.stream()
                .filter(beställning -> beställning.getKundid()==kundid).collect(Collectors.toList());
    }

    public void printProducts() {

        //Sko a;

        skoList.forEach
                (s-> System.out.println("Skonummer: " + s.getId() +" Märke: "+s.getMärke() + ". Färg: "+
                        s.getFärg() + ". Pris: "+ s.getPris() + "kr. Storlek: "+ s.getStorlek() + ". Kategori: "+ s.getKategori() ));
    }

    public void addToCart(int nextInt) {
        Sko sko = skoList.stream().filter(s->s.getId() == nextInt).findAny().get();


        //printShoes();
        // metod kan brytas upp mer
        System.out.println("vill du lägga till i befintlig beställning? y/n");
        String a =scan.next();

        if(a.equalsIgnoreCase("y")){
            System.out.println("ange beställnings nr:t som du vill lägga till din produkt i");
            int b =scan.nextInt();
            r.addToCart(b,ogkund.getId(),sko.getId());
        }else if(a.equalsIgnoreCase("n")){
            System.out.println("en ny beställning skapas");

            r.addToCart(0,ogkund.getId(),sko.getId());
        }




    }

    public void printOrders() {
        for (Beställning b:k2.getCart()
             ) {

            List<Skobeställning> temp = skobeställningList.stream().filter(s-> s.getBeställningid()==b.getId()).collect(Collectors.toList());
            for (Skobeställning a: temp
                 ) {
                skoList.stream().filter(skolist-> skolist.getId() == a.getSkoid()).forEach(skolist-> System.out.println("Beställning nr: " + a.getSkoid()+" innehåller skorna av märket: "+ skolist.getMärke() +  " av färgen: " +
                        skolist.getFärg() +" pris: "+skolist.getPris()+ " storlek: "+ skolist.getStorlek()));
            }
        }
    }
}
