EXIT POINT OF A MATRIX

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       int c=sc.nextInt();
       int a[][]=new int[r][c];
       
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               a[i][j]=sc.nextInt();
           }
       }
       
       int dir=0;
       int i=0,j=0;
       while(true){
           dir=dir+(a[i][j])%4;
           if(dir==0){
               j++;
               if(j==a[0].length){
                   j--;
                   break;
               }
           }
           else if(dir==1){
               i++;
               if(i==a.length){
                   i--;
                   break;
               }
           }
           else if(dir==2){
               j--;
               if(j==-1){
                   j++;
                   break;
               }
           }
           else if(dir==3){
               i--;
               if(i==-1){
                   i++;
                   break;
               }
           }
       }
       System.out.println(i);
       System.out.println(j);
    }

}