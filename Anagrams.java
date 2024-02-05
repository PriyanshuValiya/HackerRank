import java.util.Scanner;

class main {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length()) {
            char aChar[]= a.toUpperCase().toCharArray();
            char bChar[]= b.toUpperCase().toCharArray();
            java.util.Arrays.sort(aChar);
             java.util.Arrays.sort(bChar);
             if(java.util.Arrays.equals(aChar, bChar)) {
                return true;
             } else {
                return false;
             }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}