/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob96a;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Prob96A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        char temp = c.charAt(0);
        String ans = "NO";
        int count = 1;
        for(int i = 1 ; i < c.length() ; i++)
        {
            if(temp == c.charAt(i))
                count++;
            else
            {
                temp = c.charAt(i);
                count = 1;
            }
            if(count >= 7)
                ans = "YES";
        }
        
        System.out.println(ans);
    }
    
}
