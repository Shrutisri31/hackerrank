import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
         boolean valid = true;
        
        for(int i = 0; i < (S.length() / 2); i++) {
            if(S.charAt(i) != S.charAt((S.length() - 1) - i)) {
                valid = false;
                break;
            } // end if
        } // end for(i)
        
        if(valid){
            System.out.println("Yes");
        }
        else{
        System.out.println("No");
    }
       } 
}