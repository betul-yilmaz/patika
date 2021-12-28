/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesi;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        int n1,n2;
        System.out.println("sayı 1 gir: ");
         n1 = inp.nextInt();
        System.out.println("sayı 2 gir: ");
         n2 = inp.nextInt();
        System.out.println("yapılacak işlem seçiniz \n toplama:1, çıkarma:2, çarpma:3, bölme:4");
        int islem = inp.nextInt();
        double sonuc;
        switch(islem){
            case 1: 
                sonuc=n1+n2;
                 System.out.println(sonuc);
                 break;
            case 2:
                sonuc=n1-n2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.println(sonuc);
                break;
            case 4:    
                sonuc=n1/n2;
                System.out.println(sonuc);
                break;
                 
        }
        
        
        
    }
    
}
