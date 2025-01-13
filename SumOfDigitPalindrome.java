public class SumOfDigitPalindrome {
    public static void main(String[] args) {
        int number = 55;
        int isSumOfDigitPalindrome = isSumOfDigitPalindrome(number);
        System.out.println(isSumOfDigitPalindrome);
    }
    public static int isSumOfDigitPalindrome(int num){
        int sumOfDigit = sumOfDigit(num);
        int temp = sumOfDigit;
        int reverse = 0, rem;
        while (temp!=0){
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp /10;
        }
        if (reverse == sumOfDigit){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int sumOfDigit(int number){
        int sum = 0, rem;
        while (number!=0){
            rem = number % 10;
            sum += rem;
            number = number /10;
        }
        return sum;
    }
}
