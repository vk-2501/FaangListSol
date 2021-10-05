SPIRAL DISPLAY



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        int minr=0;
        int maxxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        
        int co=1;
        int total=r*c;
        
        while( co<=total){
            //left wall downwards[what is constant & what varies]
            for(int i=minr;i<=maxxr && co<=total;i++){
                System.out.println(arr[i][minc]);
                co++;
            }
            minc++;
            
            
            //Bottom Wall Rightwards
            for(int i=minc;i<=maxc && co<=total;i++){
                System.out.println(arr[maxxr][i]);
                co++;
            }
            
            maxxr--;
            
            
            //right wall upwards
             for(int i=maxxr;i>=minr && co<=total;i--){
                System.out.println(arr[i][maxc]);
                co++;
            }
            maxc--;
            
            
            //top wall leftwards
             for(int i=maxc;i>=minc&& co<=total;i--){
                System.out.println(arr[minr][i]);
                co++;
            }
            
            minr++;
        }
    }

}