import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();            
            int sum = a;
            for (int j = 0; j<n; j++) {                
                int num = (int)Math.pow(2, j)*b;
                sum = sum + num;
                System.out.printf("%s ",sum);                                
            }
            if (i < q-1) {
                System.out.print("\n");
            }
        }
        sc.close();       
    }
}
