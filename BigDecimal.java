//import java.math.BigDecimal;
import java.util.*;

class BigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        for(int i=0; i <= n-1; i++) {
            for(int j=0; j <= n-1-i; j++) {
                if(s[j] > s[j+1]) {
                    
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}