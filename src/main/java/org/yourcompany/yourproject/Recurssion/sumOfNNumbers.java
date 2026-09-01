package org.yourcompany.yourproject.Recurssion;

public class sumOfNNumbers{
    public static void main(String[] args)
{
    sum(5, 0);
}

 //sum of n to 1
    public static void sum(int i, int sum)
    {
        if(i<1)
        {
            System.out.println("Sum of n numbers: "+sum);
            return;
        }

        sum+=i;
        sum(i-1, sum);
    }

}