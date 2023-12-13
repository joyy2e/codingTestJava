import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] arr = a.split("");
        char[] charArray = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) { 
                charArray[i] = arr[i].charAt(0); 
            }
        }
        
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
            System.out.print(charArray[i]);
        }
        
    }
}