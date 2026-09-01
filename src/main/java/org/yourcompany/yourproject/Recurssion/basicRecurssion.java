package org.yourcompany.yourproject.Recurssion;


//when a function calls itself until a specific condition is met
public class basicRecurssion {

    public static void main(String[] args)
{
    printNumber(5);

}

public static void printNumber(int n)
{
    if(n==0)
    {
        return;
    }
    else
    {
    printNumber(n-1);
    System.out.println(n);

    }
}
    
    
}
