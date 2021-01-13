/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob266a;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Prob266A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        String c = sc.next();
        char temp = c.charAt(0);
        int count = 0;
        for(int i = 1 ; i < n ; i++)
        {
            if(temp == c.charAt(i))
                count++;
            else
                temp = c.charAt(i);
        }
        System.out.println(count);
    }
    
}
