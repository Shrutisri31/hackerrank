import java.io.*;
import java.util.*;

public class Solution {
    
    static boolean isAnagram(String a, String b){
             a =  a.toLowerCase();
              b = b.toLowerCase();
             if(a.length() == b.length()) {
             char[] charArray1 = a.toCharArray();
             char[] charArray2 = b.toCharArray();
             Arrays.sort(charArray1);
             Arrays.sort(charArray2);
              boolean result = Arrays.equals(charArray1, charArray2);

             if(result) {
               return true;
             }
               else {
                  return false;
            }
         }
         else{
             return false;
         }
 }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
          String a = sc.nextLine();
          String b = sc.nextLine();
         boolean R = isAnagram(a,b);
         if(R==true){
             System.out.println("Anagrams");
         }
         else{
             System.out.println("Not Anagrams");
         }

    }
}
