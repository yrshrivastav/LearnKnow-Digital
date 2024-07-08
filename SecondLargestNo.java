public class SecondLargestNo {
    public static void main(String[] args) {
        //initializing the array
        int[] arr = {1, 2, 3, 4, 5, 6};
        int largest = arr[0];
        int secondLargest = arr[0];
        //iterating through the array to check for second largest number
        for (int i = 1; i < arr.length; i++) {
            if(largest>secondLargest){
                secondLargest = largest;
            }
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        //printing the second largest number in an array
        System.out.println("Second largest number in array is :"+secondLargest);
        }

}


