import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum {
    
    static void func(int ind, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans, int n, int target, int[] arr) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < n; i++) {
            if (arr[i] <= target) {
                ds.add(arr[i]);
                func(i, ds, ans, n, target - arr[i], arr);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        func(0, new ArrayList<>(), ans, n, target, arr);

        // Print the combinations
        for (ArrayList<Integer> combination : ans) {
            System.out.println(combination);
        }
        sc.close();
    }
    
    
}
