/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob153d;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Prob153D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String st;
        Scanner sc = new Scanner(System.in);
        st = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal = Calendar.getInstance();
        try
        {
            cal.setTime(sdf.parse(st));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        int n = sc.nextInt();
        cal.add(Calendar.DATE, n);
        System.out.println(sdf.format(cal.getTime()));
            
    }
    
}
