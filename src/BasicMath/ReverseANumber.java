package BasicMath;

public class ReverseANumber {
    //PS: Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    public static void main(String[] args) {
        ReverseNumber(77890);
    }

    public static void ReverseNumber(int number)
    {
        while (number > 0)
        {
            int lastDigit = number % 10;
            number = number / 10;
            if(lastDigit > 0)
                System.out.print(lastDigit);
                
        }
    }
}
