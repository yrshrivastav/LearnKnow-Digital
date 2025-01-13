public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        String isAmstrong = isAmstrong(number);
        System.out.println("Number "+number+" is Armstrong : "+isAmstrong);
    }
    public static String isAmstrong(int num){
        int temp = num;
        int sum = 0, rem;
        while (temp!=0){
            rem = temp % 10;
            sum += (rem*rem*rem);
            temp = temp /10;
        }
        if (sum == num){
            return "Yes!";
        }
        else {
            return "No!";
        }
    }
}
