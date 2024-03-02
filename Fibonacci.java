import java.util.Scanner;

public class Fibonacci {
    static int func(int n) 
    {
        if(n<=1)
        {
            return n;
        }
        int last = func(n-1);
        int slast = func(n-2);
        return last + slast;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(func(n));
        sc.close();
    }
}
