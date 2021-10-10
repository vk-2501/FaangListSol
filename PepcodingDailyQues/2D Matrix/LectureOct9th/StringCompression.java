import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String res="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
               //do nothing
            }
            else{
                res+=str.charAt(i);
            }
        }

        res+=str.charAt(str.length()-1);
        return res;
	}

	public static String compression2(String str){
        String res="";
        int c=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                c++;
            }
            else {
                res+=str.charAt(i);
                if(c>1){
                    res+=c;
                    c=1;
                }
            }
        }
        res+=str.charAt(str.length()-1);
        if(c>1){
        res+=c;
        }
        return res;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}

