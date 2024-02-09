import java.io.*;
import java.util.*;

class demo {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] currentSums = new int[size];

        for(int i=1; i <= size; i++) {
            int value = scan.nextInt();       
         for (int j=0; j<i; j++){
            currentSums[j] += value; 
                if (currentSums[j] < 0) {
                    count++;
                }
             }
        }
        System.out.println(count);
    }
}