import java.util.LinkedList;

public class pulkam {
    public static void main(String[] args) {
        String kalimat = "saya ingin pulang kampung ke kampung halaman saya";

        // Memisahkan kalimat menjadi kata-kata
        String[] kataKata = kalimat.split(" ");

        // Membuat LinkedList untuk menyimpan kata dan frekuensinya
        LinkedList<String[]> frekKata = new LinkedList<>();

        // Menghitung frekuensi kata dalam kalimat
        for (String kata : kataKata) {
            boolean kataDitemukan = false;
            for (String[] entry : frekKata) {
                if (entry[0].equals(kata)) {
                    // Jika kata sudah ada dalam LinkedList, tambahkan 1 ke frekuensinya
                    int frekuensi = Integer.parseInt(entry[1]) + 1;
                    entry[1] = Integer.toString(frekuensi);
                    kataDitemukan = true;
                    break;
                }
            }

            if (!kataDitemukan) {
                // Jika kata belum ada dalam LinkedList, tambahkan kata baru dengan frekuensi 1
                String[] entry = { kata, "1" };
                frekKata.add(entry);
            }
        }

        // Menampilkan hasil
        for (String[] entry : frekKata) {
            System.out.println(entry[0] + " = " + entry[1]);
        }
    }
}