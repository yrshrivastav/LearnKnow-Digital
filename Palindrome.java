public class Palindrome {
    public static void main(String[] args) {
        int number = 2002;
        String isPalindrome = isPalindrome(number);
        System.out.println("Number "+number+" is Palindrome : "+isPalindrome);
    }
    public static String isPalindrome(int num){
        int temp = num;
        int reverse = 0, rem;
        while (temp!=0){
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp /10;
        }
        if (reverse == num){
            return "Yes!";
        }
        else {
            return "No!";
        }
    }
}
