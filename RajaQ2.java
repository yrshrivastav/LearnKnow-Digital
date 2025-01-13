public class RajaQ2 {
    public static void main (String args []) {
        int a[] = {5,1,7}; 
        int sum = 0; 
        for (int i=0; i<a.length; i+=2) {
            sum= sum + a[i];
            i--; 
        }
    System.out.print(sum);
    }
}
