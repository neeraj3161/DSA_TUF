package org.yourcompany.yourproject;

public class REVERSE_NUMBER {
    public static void main(String[] args) {
        int n = 10400;
        int revNumber = 0;
        while(n>0)
        {
            int lastDigit = n%10;
            n = n/10;
            revNumber = revNumber * 10 + lastDigit;
            
        }
        System.out.println(revNumber);
    }
}
