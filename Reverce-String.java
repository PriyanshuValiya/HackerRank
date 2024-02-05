import java.io.*;
import java.util.*;

class main {

    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";
        
        for(int i=0; i <= A.length()-1; i++) {
            B += A.charAt(A.length()-1-i);
        }
        
        if(A.compareTo(B) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }    
}