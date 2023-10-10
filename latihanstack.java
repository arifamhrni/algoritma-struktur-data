import java.util.Stack;

public class latihanstack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.pop();
        s.push(1);
        s.push(2);
        s.pop();
        s.pop();
        s.pop();
        s.push(2);
        s.pop();

        System.out.println(s);

    }
}