package praktikum;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        LinkedList<String> keretaApi = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());

            if (n >= 100 || n < 0) {
                System.out.println("Jumlah input di luar batas");
                System.exit(1); // Keluar dengan kode non-nol untuk menunjukkan adanya kesalahan
            }else{
                for (int i = 0; i < n; i++) {
                    String input = scanner.nextLine();
                    String[] tokens = input.split(" ");
   
                    String command = tokens[0];
                    switch (command) {
                        case "INSERT":
                            String gerbong = tokens[1];
                            keretaApi.add(gerbong);
                            System.out.println("Gerbong " + getTipeGerbong(gerbong) + " berhasil ditambahkan");
                            break;
                        case "LEPAS":
                            if (keretaApi.isEmpty()) {
                                System.out.println("Jumlah gerbong kosong");
                            } else {
                                String removedGerbong = keretaApi.removeLast();
                                System.out.println("Gerbong " + getTipeGerbong(removedGerbong) + " berhasil dilepas");
                            }
                            break;
                        case "SISIP":
                            int index = Integer.parseInt(tokens[1]);
                            if (index < 0 || index > keretaApi.size()) {
                                System.out.println("Index melebihi batas");
                            } else {
                                String insertedGerbong = tokens[2];
                                keretaApi.add(index, insertedGerbong);
                                System.out.println("Gerbong " + getTipeGerbong(insertedGerbong) +
                                        " berhasil ditambahkan pada index ke-" + index);
                            }
                            break;
                        case "CETAK":
                            if (keretaApi.isEmpty()) {
                                System.out.println("Kereta tidak memiliki gerbong");
                            } else {
                                System.out.print("Start - ");
                                for (String gerbongItem : keretaApi) {
                                    System.out.print("Gerbong " + getTipeGerbong(gerbongItem) + " - ");
                                }
                                System.out.println("End");
                            }
                            break;
                    }
                }
            }
        }
    }

    private static String getTipeGerbong(String gerbong) {
        String jenis = "";
        switch (gerbong) {
            case "G1":
                jenis = "Eksekutif"; break;
            case "G2":
                jenis = "Bisnis"; break;
            case "G3":
                jenis = "Ekonomi"; break;
            case "GM":
                jenis = "Makanan"; break;
        }
        return jenis;
    }
}