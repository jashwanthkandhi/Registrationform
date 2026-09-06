import java.util.Scanner;

class f1{


    public static void prob2(){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter string");
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt(),sum=0;

        for(int i=0;i<n-1;i++){
            sum+=sc.nextInt();
        }

        System.out.println("missing ="+ (n*(n+1)/2-sum));
    }

 }
