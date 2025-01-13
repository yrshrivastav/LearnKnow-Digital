public class TCSNQT3 {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = new int[N];
        arr[0] = 7;
        arr[1] = 4;
        arr[2] = 8;
        arr[3] = 2;
        arr[4] = 9;
        countGreaterElem(N, arr);
    }

    private static void countGreaterElem(int n, int[] arr) {
       int x = 1;
       int toCheck = arr[x];
       int count = 1;
       for (int i = 1; i<arr.length; i++){
            if (toCheck>arr[i]){
                
            }
       }
    }
}
