import java.util.*;

public class f2 {
    
    public static int fact(int n){
        
        int mul=1;

        for(int i=1;i<=n;i++){
            mul*=i;
        }

        return mul;
    }
    public static void main(String[] args) {
        
       
       Scanner sc =new Scanner(System.in);

       int n=sc.nextInt(),sum=0,max=0;

       for(int i=0;i<n;i++){

            sum=Math.max(0,sum+sc.nextInt());
            max=Math.max(sum,max);
       }

       System.out.println("max sum "+max);


    }
}
