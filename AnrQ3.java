public class AnrQ3 {
    public static void main(String[] args) {
        String input1 = "aabbbbbccccddddd";
        String input2 = "abcdefgh";

        
        System.out.println(longSubString(input1));
        System.out.println(longSubString(input2));
        

    }

    public static String longSubString(String s) {
        if (s == null || s.length() == 0)
            return "";
        int maxLength = 0;
        char maxChar = s.charAt(0);
        int currentLength = 0;
        char currentChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                currentLength++;
            } else {
                currentChar = s.charAt(i);
                currentLength = 1;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxChar = currentChar;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            result.append(maxChar);
        }
        return result.toString();
        
    }
}
