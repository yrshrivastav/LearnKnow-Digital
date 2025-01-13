public class TCSNQT2 {
    public static void main(String[] args) {
        String str = "hello#";
        isValidString(str);
    }

    public static void isValidString(String str) {
        int starCount = 0;
        int hashCount = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)=='*'){
                starCount++;
            }
            else if (str.charAt(i)=='#'){
                hashCount++;
            }   
        } 
         // Calculate the difference
         int difference = starCount - hashCount;
        
         // Output the result based on the difference
         if (difference > 0) {
             System.out.println(difference); // Positive integer if '*' > '#'
         } else if (difference < 0) {
             System.out.println(difference); // Negative integer if '#' > '*'
         } else {
             System.out.println(0); // Zero if '*' = '#'
         }
 
    }
}
