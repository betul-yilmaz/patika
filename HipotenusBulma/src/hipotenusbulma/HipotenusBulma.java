/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusbulma;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class HipotenusBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kenar1, kenar2, kenar3;
        Scanner inp=new Scanner(System.in);
        
        System.out.println("1.kenar giriniz: ");
        kenar1 = inp.nextInt();
        System.out.println("2.kenar giriniz: ");
        kenar2 = inp.nextInt();
        System.out.println("3.kenar giriniz: ");
        kenar3 = inp.nextInt();
        
        int u =(kenar1+kenar2+kenar3)/2;
        int cevre = 2*u;
        int alan = u * (u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.println("cevre: "+cevre);
        System.out.println("cevre: "+ Math.sqrt(alan));
        System.out.println("hipotenus bulmak için:");
        System.out.println("1.kenar giriniz: ");
        int hkenar1 = inp.nextInt();
        System.out.println("2.kenar giriniz: ");
        int hkenar2 = inp.nextInt();
        double hipotenus = Math.sqrt((hkenar1*hkenar1)+(hkenar2*hkenar2));
        System.out.println("hipotenus: "+hipotenus);

    }
    
}
