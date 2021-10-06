import java.io.*;
DIAGONAL DISPLAY

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        //GAP STRATEGY
        
    //   1. The diagonal is getting printed till all columns
    //   2. Each diagonal has gap 0,gap 1 ...in their coordinate                   positions
      // 3. Condition for inner for loop will be going till all                    columns
        
        for(int g=0;g<a[0].length;g++){
            for(int i=0,j=g;j<a[0].length;i++,j++){
                System.out.println(a[i][j]);
            }
        }
    }

}