import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        String sebelum = "hallo";
        String sesudah = reverse(sebelum);
        System.out.println(sebelum);
        System.out.println(sesudah);
    }

    public static String reverse(String kata) {
        Stack<Character> stack = new Stack<>();
        String reversedkata = "";

        // Push setiap karakter ke dalam stack
        for (char c : kata.toCharArray()) {
            stack.push(c);
        }

        // Pop karakter dari stack untuk membalikkan string
        while (!stack.isEmpty()) {
            reversedkata += stack.pop();
        }

        return reversedkata;
    }
}