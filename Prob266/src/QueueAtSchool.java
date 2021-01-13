import java.util.ArrayList;
import java.util.Scanner;
 
public class QueueAtSchool {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t = s.nextInt();
        String a = s.next();
        if(!a.contains("G"))
            System.out.println(a);
        else {
        int[] b = new int[a.length()];
        for(int i = 0; i < b.length; i++)
            if(a.charAt(i) == 'B') b[i] = 1;

        for(int i = t; i > 0; i--) {
            int[] ans = new int[b.length];
            int temp = b[0];
            for(int j = 1; j < b.length; j++) {
               if(temp==1)
                {
                    if(b[j]==0) {
                        ans[j-1] = 0;
                        ans[j] = 1;
                        j++;
                    }
                    else
                        ans[j-1] = temp;
                }
               else
                   ans[j-1] = temp;
               if(j < b.length)
                    temp = b[j];
               if(j == b.length-1)
                   ans[j] = temp;
               
            }
            b = ans;
           for(int K = 0; K < b.length; K++)
            System.out.print(((b[K] == 1)? "B" : "G"));
           System.out.println();
        
        }
        for(int i = 0; i < b.length; i++)
            System.out.print(((b[i] == 1)? "B" : "G"));
        }
    }
}