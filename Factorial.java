public class Factorial {
    public static void main(String[] args) {
        //initializing the number for finding the factorial
        int number = 5;
        //calling the method for finding factorial
        int factorial = factorial(number);
        System.out.println("The factorial of "+number+ " is : "+factorial);
    }
    //method for finding the factorial
    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        if (num == 2){
            return 2;
        }
        num = num * factorial(num-1);
        return num;
    }
}
