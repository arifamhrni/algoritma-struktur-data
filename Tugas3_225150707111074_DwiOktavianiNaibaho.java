//Ananda Annisa Sungkar (225150701111033)
//Arifa Maharani Salsabil (225150701111034)
//Dwi Oktaviani Naibaho (225150707111074)


import java.util.Scanner;
import java.util.Stack;

public class Tugas3_225150707111074_DwiOktavianiNaibaho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> riwayatPasien = new Stack<>();

        System.out.print("Riwayat Pasien: ");
        String kalimat = scanner.nextLine();
        String[] urutKata = kalimat.split(" ");

        for (String kata : urutKata) {
            riwayatPasien.push(kata);
        }

        while (true) {
            System.out.print("Ketik kalimat riwayat (q untuk keluar, z untuk undo, y untuk redo): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            } else if (input.equals("z")) {
                if (!riwayatPasien.isEmpty()) {
                    riwayatPasien.pop();
                } else {
                    System.out.println("Tidak ada yang bisa di-undo.");
                }
            } else if (input.equals("y")) {
                if (riwayatPasien.size() < urutKata.length) {
                    riwayatPasien.push(urutKata[riwayatPasien.size()]);
                } else {
                    System.out.println("Tidak ada yang bisa di-redo.");
                }
            } else {
                riwayatPasien.push(input);
            }

            System.out.println();
            System.out.println("Riwayat Pasien: " + String.join(" ", riwayatPasien));
        }

        scanner.close();
    }
}
