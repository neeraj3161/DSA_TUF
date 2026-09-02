package org.yourcompany.yourproject.Recurssion;

public class factorialOfGivenNumber {
    public static void main(String[] args)
{
    System.out.println("Factorial of given number: "+factorial(5));
}

public static int factorial(int n)
{
    if(n==0)
    {
        return 0;
    }
    return n+factorial(n-1);
}
}
