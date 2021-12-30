/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
       
        int N = inp.nextInt();
        
        if(N<2){
            System.out.println("Weird");
        }
        else if(N<=5 && N>=2){
            System.out.println("Not Weird");
        }
        else if(N<=20 && N>=6){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        
    }
    
}
