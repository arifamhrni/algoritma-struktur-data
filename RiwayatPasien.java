import java.util.Stack;
import java.util.Scanner;

public class RiwayatPasien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        String riwayat = "";

        while (true) {
            System.out.println("Riwayat Pasien: " + riwayat);
            System.out.print("Ketik kalimat riwayat (q untuk keluar, z untuk undo, y untuk redo): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            } else if (input.equals("z")) {
                if (!undoStack.isEmpty()) {
                    redoStack.push(undoStack.pop());
                    riwayat = undoStack.peek();
                } else {
                    System.out.println("Tidak ada yang bisa di-undo.");
                }
            } else if (input.equals("y")) {
                if (!redoStack.isEmpty()) {
                    undoStack.push(redoStack.pop());
                    riwayat = undoStack.peek();
                } else {
                    System.out.println("Tidak ada yang bisa di-redo.");
                }
            } else {
                undoStack.push(riwayat);
                redoStack.clear();
                riwayat = input;
            }
        }

        scanner.close();
    }
}
