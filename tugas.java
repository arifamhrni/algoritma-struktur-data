import java.util.Stack;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> riwayatPasien = new Stack<>();
        
        while (true) {
            System.out.println("Riwayat Pasien: " + riwayatPasien);
            System.out.print("Ketik kalimat riwayat (q untuk keluar, z untuk undo, y untuk redo): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            } else if (input.equals("z")) {
                // Undo riwayat pasien
                if (!riwayatPasien.isEmpty()) {
                    riwayatPasien.pop();
                } else {
                    System.out.println("Tidak ada yang bisa di-undo.");
                }
            } else if (input.equals("y")) {
                // Redo riwayat pasien
                if (!riwayatPasien.isEmpty()) {
                    riwayatPasien.push(input.substring(1));
                } else {
                    System.out.println("Tidak ada yang bisa di-redo.");
                }
            } else {
                // Menambahkan input riwayat pasien
                riwayatPasien.push(input);
            }
        }
        scanner.close();
    }
}