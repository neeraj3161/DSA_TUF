package org.yourcompany.yourproject.Recurssion;

public class factorialOfGivenNumber {
    public static void main(String[] args)
{
    //System.out.println("Sum of given number: "+sum(5));
    System.out.println("Factorial of  given number: "+factorial(2));
}

public static int sum(int n)
{
    if(n==0)
    {
        return 0;
    }
    return n+sum(n-1);
}

public static int factorial(int n)
{
    if(n==0)
    {
        return 1;
    }

    return n*factorial(n-1);
}
}
