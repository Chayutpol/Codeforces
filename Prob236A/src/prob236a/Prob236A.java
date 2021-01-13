/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob236a;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Prob236A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Character, Boolean> a = new HashMap <Character, Boolean>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < s.length() ; i++)
        {
            if(a.get(s.charAt(i))==null)
            {
                count++;
                a.put(s.charAt(i), true);
            }
        }
        String ans = (count % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!";
        System.out.println(ans);
    }
    
}
