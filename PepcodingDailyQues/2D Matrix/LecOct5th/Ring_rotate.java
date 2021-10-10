RING ROTATE (IMP QSTN)



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
          Scanner sc=new Scanner(System.in);
          int r=sc.nextInt();
          int c=sc.nextInt();
          int arr[][]= new int[r][c];
          
          for(int i=0;i<r;i++){
              for(int j=0;j<c;j++){
                  arr[i][j]=sc.nextInt();
              }
          }
          int s=sc.nextInt();
          int k=sc.nextInt();
          
          
          
         //make 1d Array from 2d
         int oned[]=fillonedarray(arr,s);
         
         //rotate this 1d array 
           rotate(oned,k);
         
         
         
         //fill this 1d aray back to 2d array
         fill2darray(oned,arr,s);
         display(arr);
    }
    
     public static int[] fillonedarray(int twod[][],int s){
      int rows=twod.length;
        int cols=twod[0].length;
        int minr=s-1;
        int minc=s-1;
        int maxc=cols-s;
        int maxr=rows-s;
        int sz=2*maxc-2*minc+2*maxr-2*minr;
        int oned[]=new int[sz];
        
        int c=0;
        //left wall
        for(int i=minr;i<=maxr;i++)
        {
           oned[c] =twod[i][minc];
            c++;
        }
        minc++;
        
        //bottom wall
         for(int i=minc;i<=maxc;i++)
        {
            oned[c] =twod[maxr][i];
            c++;
        }
        maxr--;
        
        
        //right wall
         for(int i=maxr;i>=minr;i--)
        {
            oned[c] =twod[i][maxc];
             c++;
        }
        maxc--;
        //top wall
         for(int i=maxc;i>=minc;i--)
        {
            oned[c] =twod[minr][i];
             c++;
        }
        minr++;

        return oned;
        
     }
    
    public static void fill2darray(int oned[],int twod[][],int s){
        int rows=twod.length;
        int cols=twod[0].length;
        int minr=s-1;
        int minc=s-1;
        int maxc=cols-s;
        int maxr=rows-s;
        
        int c=0;
        //left wall
        for(int i=minr;i<=maxr;i++)
        {
            twod[i][minc]=oned[c];
            c++;
        }
        minc++;
        
        //bottom wall
         for(int i=minc;i<=maxc;i++)
        {
             twod[maxr][i]=oned[c];
            c++;
        }
        maxr--;
        
        
        //right wall
         for(int i=maxr;i>=minr;i--)
        {
           twod[i][maxc]=oned[c];
             c++;
        }
        maxc--;
        //top wall
         for(int i=maxc;i>=minc;i--)
        {
             twod[minr][i]=oned[c];
             c++;
        }
        minr++;
        
    }
    
    public static void rotate(int a[],int r){
        r=r%a.length;
        if(r<0){
            r+=a.length;
        }
        
        reverse(a,0,a.length-r-1);
        reverse(a,a.length-r,a.length-1);
        reverse(a,0,a.length-1);
        
    }
    
    public static void reverse(int a[],int l,int r){
        while(l<r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
        l++;
        r--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}