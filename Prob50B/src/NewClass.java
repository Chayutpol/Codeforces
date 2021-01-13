/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class NewClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i = 0 ; i < m ; i++)
        {
            int n = sc.nextInt();
            int odd = 0, even = 0;
            for(int j = 0; j < n; j++)
            {
                int temp = sc.nextInt();
                if(temp%2 != j%2)
                {
                    if(j%2 == 0)
                        even++;
                    else
                        odd++;
                }
                
            }
            if(odd == even)
                System.out.println(odd);
            else
                System.out.println(-1);
                
        }
    }
}
