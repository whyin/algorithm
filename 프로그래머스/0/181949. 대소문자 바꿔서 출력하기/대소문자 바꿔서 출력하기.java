import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for (int i = 0; i < a.length(); i++) {
            char aa = a.charAt(i);
            if (Character.isUpperCase(aa)) {
                answer += Character.toLowerCase(aa);
            } else {
                answer += Character.toUpperCase(aa);
            }
        }
        System.out.println(answer);
    }
}