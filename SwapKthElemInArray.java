public class SwapKthElemInArray {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {4, 3, 5, 2, 6, 7};
        int k = 1;
        swapKthElemInArray(n, k, arr);
    }
    public static void swapKthElemInArray(int n, int k, int[] ar){
        int temp;
        int p = n-k;
        for(int i=0; i<k; i++){
            
            for(int j=n-1; j>=p; j--){
                if(i==(k-1) && j==p){
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int i : ar) {
            System.out.print(i);
        }
    }
}
