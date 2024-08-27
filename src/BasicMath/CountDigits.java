package BasicMath;

import static java.lang.Math.log10;

public class CountDigits {
    //PS: Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
    public static void main(String[] args) {
        int n = 1283749832;
        int count = 0;
        while(n>0)
        {
            //Get int and remove decimal
            n = n / 10;
            count = count+1;

        }
        System.out.println(count);

        System.out.println("Another way: "+ AnotherWayToSolveCountDigits(7789));
    }

    public static int AnotherWayToSolveCountDigits(int number)
    {
        return (int) (log10(number) + 1);
    }


}
