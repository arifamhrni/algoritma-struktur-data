import java.util.Stack;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> riwayatPasien = new Stack<>();
        
        while (true) {
            System.out.println("Riwayat Pasien: " + riwayatPasien);
            System.out.print("Ketik kalimat riwayat (q untuk keluar, z untuk undo, y untuk redo): ");
            String input = scanner.nextLine();

            switch (input) {
                case "q":
                    scanner.close();
                    System.exit(0);
                    break;
                case "z":
                    if (!riwayatPasien.isEmpty()) {
                        riwayatPasien.pop();
                    } else {
                        System.out.println("Tidak ada yang bisa di-undo.");
                    }
                    break;
                case "y":
                    if (!riwayatPasien.isEmpty()) {
                        riwayatPasien.push(input.substring(1));
                    } else {
                        System.out.println("Tidak ada yang bisa di-redo.");
                    }
                    break;
                default:
                    riwayatPasien.push(input);
                    break;
            }
        }
    }
}