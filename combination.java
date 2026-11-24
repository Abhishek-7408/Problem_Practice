import java.util.Scanner;

public class combination {
    public static long factoria(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact*=i;
    
        }
        return fact;

        }

        public static long comb(int n,int r){
            return factoria(n)/factoria(r)*factoria(n-r);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("Combination is: "+ comb(n, r));
        }


}