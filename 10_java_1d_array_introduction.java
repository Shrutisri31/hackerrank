import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       sc.close();
       //print each element of an array.
       for(int i=0;i<n;i++){
           System.out.println(a[i]);
       }
    }
}

