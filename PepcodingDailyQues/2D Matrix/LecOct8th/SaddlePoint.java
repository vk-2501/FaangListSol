SADDLE POINT 

Approach
1. Find min in every row.
2.Check whether the min number is maximum in its column as well
3. If so return that point
4. If no return invalid input




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[][]=new int[n][n];
       
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       
       for(int i=0;i<arr.length;i++){
           int min=arr[i][0];
           int psj=0;
           for(int j=1;j<arr[0].length;j++){
               if(arr[i][j]<min){
                   min=arr[i][j];
                   psj=j;
               }
           }
           
         boolean  isSaddle=true;
           for(int k=0;k<arr.length;k++){
               if(arr[k][psj]>min){
                   isSaddle=false;
                   break;
               }
           }
           
           if(isSaddle==true){
               System.out.println(min);
               return;
           }
          
       }
       System.out.println("Invalid input");
    }

}