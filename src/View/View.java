package View;

import Controller.Controller;
import Models.Kund;
import ViewModel.Mv_Kund;

import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Controller c = new Controller();
        Mv_Kund k;
        c.printUsers();
        System.out.println("ange användarnamn och password");
        String pw = scan.nextLine().trim();
        String[] s = pw.split("\\s+");
        String namn = s[0];
        String pass = s[1];
        if(c.checkUser(namn,pass)){
            c.addUser(namn,pass);

            while(true) {
                c.printProducts();
                System.out.println("ange skonummer på den sko du vill lägga till");
                int id = scan.nextInt();
                c.printOrders();
                c.addToCart(id);
                //meddela kund att allt gick bra
                System.out.println(" vill du lägga in ännu en produkt? y/n");
                if(scan.next().equalsIgnoreCase("n")){
                    System.out.println("hejdå");
                    break;
                }
            }


        }
        else{
            System.out.println("fel");
        }


    }
}
