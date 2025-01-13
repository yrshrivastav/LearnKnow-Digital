public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        String result = removeSpace(str);
        System.out.println(result);
    }
    public static String removeSpace(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i)!=' '){
                result += str.charAt(i);
            }
        }
        return result;
    }
}
