import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class yey {
    public static void main(String[] args) {
        LinkedList<Kereta> krt = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            String input = "";
            String[] tokens = new String[3];
            for(int i = 0; i < n; i++) {
                input = br.readLine();
                tokens = input.split(" ");
                
                String command = tokens[0];
                
                if(command.equalsIgnoreCase("INSERT")) {
                    krt.add(new Kereta(tokens[1]));
                    System.out.printf("Gerbong %s berhasil ditambahkan\n", krt.getLast().getJenisGerbong());
                }
                else if (command.equalsIgnoreCase("LEPAS")) {
                    if(krt.isEmpty()) System.out.println("Jumlah gerbong kosong");
                    else System.out.printf("Gerbong %s berhasil dilepas\n", krt.removeLast().getJenisGerbong());
                }
                else if (command.equalsIgnoreCase("SISIP")) {
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index > krt.size()) System.out.println("Index melebihi batas");
                    else {
                        krt.add(index, new Kereta(tokens[2]));
                        System.out.printf("Gerbong %s berhasil ditambahkan pada index ke-%d\n", krt.get(index).getJenisGerbong(), index);
                    }
                }
                else if (command.equalsIgnoreCase("CETAK")) {
                    if(krt.isEmpty()) System.out.println("Kereta tidak memiliki gerbong");
                    else {
                        System.out.print("Start - ");
                        for(Kereta kereta : krt) {
                            System.out.printf("Gerbong %s - ", kereta.getJenisGerbong());
                        }
                        System.out.println("End");
                    }
                }
                
            }
        } catch (IOException iox) {
            System.out.println(iox);
        }
    }
}

class Kereta {
    private String jenisGerbong;

    public Kereta(String jenis) {
        if(jenis.toUpperCase().equals("G1")) this.jenisGerbong = "Eksekutif";
        else if(jenis.toUpperCase().equals("G2")) this.jenisGerbong = "Bisnis";
        else if(jenis.toUpperCase().equals("G3")) this.jenisGerbong = "Ekonomi";
        else if(jenis.toUpperCase().equals("GM")) this.jenisGerbong = "Makanan";
    }

    public String getJenisGerbong() {
        return jenisGerbong;
    }
}