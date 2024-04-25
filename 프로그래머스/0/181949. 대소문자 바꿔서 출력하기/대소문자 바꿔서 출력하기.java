import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] aStr = a.split("");
        StringBuilder result = new StringBuilder();

        for (String s : aStr) {
            char c = s.charAt(0);
            if (c >= 65 && c <= 90) { // 대문자인 경우
                // 대문자를 소문자로 변환
                c = (char) (c + 32);
            } else if (c >= 97 && c <= 122) { // 소문자인 경우
                // 소문자를 대문자로 변환
                c = (char) (c - 32);
            }
            result.append(c);
        }
        
        System.out.print(result.toString());
    }
}