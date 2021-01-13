/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob158a;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Prob158A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int ans = 0, temp = 0;
        int[] in = new int[n];
        for(int i = 0; i < n; i++)
        {
            in[i] = input.nextInt();
        }
        for(int i : in)
        {
            if(i <= 0)
                break;
            
            if(ans >= k && temp > i)
                break;
            ans++;
            temp = i;
        }
        System.out.println(ans);
    }
    
}
