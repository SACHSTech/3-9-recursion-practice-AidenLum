package recursion;

public class ReverseAString {
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("lolipop"));
    }
}
