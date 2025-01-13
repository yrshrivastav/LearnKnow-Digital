public class ReverseNumber {
    public static void main(String[] args) {
        int number = 2001;
        int reverseNumber = reverseNumber(number);
        System.out.println("Reverse of "+number+" is : "+reverseNumber);
    }
    public static int reverseNumber(int num){
        int temp = num;
        int reverseNumber = 0, rem;
        while (temp!=0){
            rem = temp % 10;
            reverseNumber = reverseNumber * 10 + rem;
            temp = temp /10;
        }
        
        return reverseNumber;
        
    }
}
