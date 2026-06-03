package org.yourcompany.yourproject;

public class COUNT_DIGIT {
    public static void main(String[] args) {
       int n = 765579;
       int count = 0;
       while(n > 0)
       {
            int lastDigit = n % 10;
            n = n/10;
            System.out.println("n:" +lastDigit);
            count+=1;

       }
       System.out.println("COUNT of digits: "+ count);
    }
}