import java.util.Scanner;

public class Pallindrome_String {
    Boolean func(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            return false;
        }
        return func(i + 1, s);
    }

    public static void main(String[] args) {
        Pallindrome_String obj = new Pallindrome_String(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String testString = sc.nextLine();
        String newString = testString.toUpperCase();        //To handle case sensitivity 
        boolean isPalindrome = obj.func(0, newString);
        System.out.println(isPalindrome);
        sc.close();
    }
}
