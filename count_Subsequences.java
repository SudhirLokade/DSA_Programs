
import java.util.Scanner;

public class count_Subsequences {
    static int func(int ind,int s,int sum,int n,int[] arr)
    {
        if(ind==n)
        {
            if(s==sum){
                return 1;
            }
            return 0;
        }
       
        s+=arr[ind];
        int l=func(ind+1, s, sum, n, arr);
        
        s-=arr[ind];
        int r=func(ind+1, s, sum, n, arr);

        return l+r;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        System.out.println("Enter sum: ");
        int sum = sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(func(0,0,sum,n,arr));
        sc.close();
    }
   
}
