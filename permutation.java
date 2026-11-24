import java.util.Scanner;

public class permutation{
    public static long factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    
    public static long permutate(int n,int r){
        return factorial(n)/factorial(n-r);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        System.out.println("Permutation is: "+permutate(n, r));
    }
}