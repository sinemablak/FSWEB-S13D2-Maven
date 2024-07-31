package org.example;

public class Main {
    public static void main(String[] args) {
       System.out.println(isPalindrome(-1221));
       System.out.println(isPalindrome(707));
       System.out.println(isPalindrome(-11212));
       System.out.println("************************");
       System.out.println(isPerfectNumber(6));
       System.out.println(isPerfectNumber(28));
       System.out.println(isPerfectNumber(5));
       System.out.println(isPerfectNumber(-1));
       System.out.println("************************");
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
    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        }
        int sum=0;
        for (int i=1;i<=number/2;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;
    }

}


