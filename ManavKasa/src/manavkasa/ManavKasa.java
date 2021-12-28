/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manavkasa;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class ManavKasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("armut kaç kilo?: ");
        int armut = inp.nextInt();
        System.out.println("elma kaç kilo?: ");
        int elma = inp.nextInt();
        System.out.println("domates kaç kilo?: ");
        int domates = inp.nextInt();
        System.out.println("muz kaç kilo?: ");
        int muz = inp.nextInt();
        System.out.println("patlıcan kaç kilo?: ");
        int patlican = inp.nextInt();
        double Armut=2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz= 0.95;
        double Patlican = 5.00;
        double tutar = (armut*Armut)+(elma*Elma)+(domates*Domates)+(muz*Muz)+(patlican*Patlican);
        System.out.println("Toplam tutar: "+tutar);
        
        
    }
    
}
