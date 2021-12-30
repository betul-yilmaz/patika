/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicigirisi;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class KullaniciGirisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kullaniciAdi,passw;
        Scanner inp=new Scanner(System.in);
        System.out.println("Kullanıcı adı gir:");
        kullaniciAdi=inp.nextLine();
        System.out.println("şifre gir:");
        passw=inp.nextLine();
        String yeni,c;
        if(kullaniciAdi.equals("patika")&& passw.equals("123")){
            System.out.println("giriş başarılı");
                    
        }
        else{
            System.out.println("şifre yanlış");
            System.out.println("şifre yenilemek için 1, çıkmak için 2");
            int a = inp.nextInt();
            
            if(a == 1){
                System.out.println("yeni şifre gir:");
                yeni=inp.nextLine();
                if(yeni.equals(passw)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz:");
                    c = inp.nextLine();
                }
                else{
                    System.out.println("Şifre oluşturuldu");
                }
            }
           
        }
        
        
        
    }
    
}
