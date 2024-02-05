import java.io.*;
import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String splits[] = s.split("[!,?._ '@]+");
        System.out.println(splits.length);
        for(String split : splits) {
            System.out.println(split);
        }
        scan.close();
    }
}