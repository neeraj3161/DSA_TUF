package org.yourcompany.yourproject;

public class ARMSTRONG_NUMBER{
    public static void main(String[] args) {
        int n = 153;
        int original = 153;
        int reverse = 0;
        int result = 0;
        while(n>0)
        {
            int lastDigit = n%10;
            n = n/10;
            reverse = reverse * 10 + lastDigit;
            result+= Math.pow(lastDigit, 3);

        }
        if(original == result)
        {
            System.out.println("is armstrong number");
        }else{
            System.out.println("is not a armstrong number");
        }
    }
}