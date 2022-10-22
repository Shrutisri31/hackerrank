import java.io.*;
import java.util.*;

public class Solution {
 
 
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        java.util.List<String> a = new java.util.ArrayList<>();

        for(int i=0;i<s.length()-k+1;i++){
                a.add(s.substring(i,i+k));   
        }
        java.util.Collections.sort(a);
         smallest = a.get(0);
         largest = a.get(a.size()-1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
         String s = sc.next();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
