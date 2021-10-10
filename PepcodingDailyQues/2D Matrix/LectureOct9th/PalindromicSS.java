//Brute Force Approach of time complexity---> n^3
//APPROACH 
//Find all substrings of the string
//Then check for every substring if it is palindrome or not


import java.io.*;
import java.util.*;

public class Main {

  public static void solution(String str) {
 
     for(int i=0;i<str.length();i++){
         for(int j=i+1;j<=str.length();j++){
             String s=str.substring(i,j);
            if( isPalindrome(s)){
                System.out.println(s);
            }
             
         }

     }

  }

  public static boolean isPalindrome(String s){
      boolean flag=true;
      int left=0,right=s.length()-1;
      while(left<right){
          if(s.charAt(left)!=s.charAt(right)){
              flag=false;
              break;
          }
          left++;
          right--;
      }
      return flag;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }

}