/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob339a;

/**
 *
 * @author Admin
 */

import java.util.*;
public class Prob339A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] arr = new int[input.length()/2 + input.length()%2];
        int i = 0;
        while(i < input.length())
        {
            if(i%2==0)
            {
                arr[i/2] = Character.getNumericValue(input.charAt(i));
            }
            i+=2;
        }
        Arrays.sort(arr);
        for(int j = 0; j < arr.length ; j++)
        {
            System.out.print(arr[j]);
            if(j!= arr.length-1)
            {
                System.out.print('+');
            }
        }
        System.out.println();
    }
    
}
