public class FirstNonRepeatingCharString {

    public static Character FirstNonRepeatingChar(String s) {
        for (Character ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return ch;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s = "java";
        System.out.println("First non repeat character = " + FirstNonRepeatingChar(s));
    }
}