package Palindrome_Number_9;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        isPalindrome(25);
    }
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        else{
            // Khởi tạo y là số sau khi đảo x
            int y = 0, original;
            original = x;
            // Đảo x
            for (; x != 0; x /= 10) {
                int digit = x % 10;
                y  = y * 10 + digit;
            }

            if (y == original){
                return true;
            }
            else{
                return false;
            }
        }
    }
}