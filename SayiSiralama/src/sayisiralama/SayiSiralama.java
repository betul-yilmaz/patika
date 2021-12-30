/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayisiralama;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class SayiSiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("1.sayi giriniz: ");
        s1 = inp.nextInt();
        
        System.out.println("2.sayi giriniz: ");
        s2 = inp.nextInt();
        
        System.out.println("3.sayi giriniz: ");
        s3 = inp.nextInt();
        System.out.println("Sayilarin kucukten buyuge siralamasi");
        if((s1<s2)&&(s1<s3)){
            if(s2<s3){
                System.out.println("s1<s2<s3");
            }
            if(s3<s2){
                System.out.println("s1<s3<s2");
            }
        }
        else if(s2<s3 && s2<s1){
            if(s3<s1){
                System.out.println("s2<s3<s1");
            }
            if(s1<s3){
                System.out.println("s2<s1<s3");
            }
        }
        else if(s3<s1 && s3<s2){
            if(s1<s2){
                System.out.println("s3<s1<s2");
            }
            if(s2<s1){
                System.out.println("s3<s2<s1");
            }
        }
        
        
        
    }
    
}
