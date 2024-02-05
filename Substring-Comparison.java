import java.util.Scanner;

class main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String test = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        smallest = largest;
        for(int i=0; i <= s.length() - k ; i++) {
         test = s.substring(i, i+k);
          if(smallest.compareTo(test) > 0) {
           smallest = test;
          }           
        }
        
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i <= s.length() - k ; i++) {
            test = s.substring(i, i+k);
            if(largest.compareTo(test) < 0) {
             largest = test;
            }
         }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}