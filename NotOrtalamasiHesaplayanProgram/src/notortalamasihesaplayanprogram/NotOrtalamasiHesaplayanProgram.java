/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notortalamasihesaplayanprogram;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class NotOrtalamasiHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matematik, fizik, kimya, turkce, tarih, muzik;
        
        Scanner inp=new Scanner(System.in);
        
        System.out.print("Matematik notu gir: ");
        matematik = inp.nextInt();
        
        System.out.print("fizik notu gir: ");
        fizik = inp.nextInt();
        
        System.out.print("kimya notu gir: ");
        kimya = inp.nextInt();
        
        System.out.print("turkce notu gir: ");
        turkce = inp.nextInt();
        
        System.out.print("tarih notu gir: ");
        tarih = inp.nextInt();
        
        System.out.print("muzik notu gir: ");
        muzik = inp.nextInt();
        
        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        
        System.out.println("not ortlamasi:" +ortalama);
        
        while(ortalama>60){
            System.out.println("sinifi gecti");
            break;
        }
        while(ortalama<60){
            System.out.println("sinifta kaldi");
            break;
        }
    }
    
}
