package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-11212));
    }

    public static boolean isPalindrome(int number) {
        number=Math.abs(number);
        String str=String.valueOf(number);
        int left=0;
        int rigth=str.length()-1;

        while(left<rigth){
            if(str.charAt(left)!=str.charAt(rigth)){
                return false;
            }
            left++;
            rigth--;
        }
        return true;




    }


}


