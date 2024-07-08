public class Prime {
    public static void main(String[] args) {
        //initializing the number for checking whether it is prime or not
        int number = 9;
        //calling the method 
        isPrime(number);
        
    }
    //method for checking the number is prime or not
    public static void isPrime(int num){
        int count=0;
        if(num==0 || num==1){
            System.out.println("Given number is "+ num+" Please enter a valid no to check for Prime" );
        }
        else{
            for(int i=2; i<num/2; i++){
                if(num%i==0){
                    count++;
                }
                
            }
            if (count==0) {
                System.out.println("Given number "+num+" is prime");
            } else {
                System.out.println("Given number "+num+" is not prime");
            }
        }
        
    }   
}
