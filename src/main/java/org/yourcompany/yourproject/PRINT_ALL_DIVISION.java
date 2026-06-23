package org.yourcompany.yourproject;

public class PRINT_ALL_DIVISION {
    public static void main(String[] args) {
        LessTC();
        int n = 36;
        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void LessTC()
    {
        int n = 36;
        for(int i = 1; i<= Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
            if((n/i)!=i)
            {
                System.out.println(n/i);
            }
        }
    }
}
