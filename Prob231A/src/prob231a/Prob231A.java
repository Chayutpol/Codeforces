/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob231a;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Prob231A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int prob = n.nextInt();
        int ans = 0;
        for(int i = 0 ; i < prob ; i++)
        {
            ans = (n.nextInt() + n.nextInt() + n.nextInt() > 1) ? ans+1 : ans;
        }
        System.out.println(ans);
    }
    
}
