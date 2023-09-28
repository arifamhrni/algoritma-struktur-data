//tugas 2: LinkedList
//Arifa Maharani Salsabil
//225150701111034
//Mata Kuliah Algoritma dan Struktur Data

import java.util.LinkedList;
import java.util.Scanner;

class SortedItemList {
    LinkedList<Integer> items;

    public SortedItemList() {
        items = new LinkedList<>();
    }

    public void addAndSort(int value) {
        int index = 0;
        while (index < items.size() && items.get(index) < value) {
            index++;
        }
        items.add(index, value);
    }

    public void displaySortedItems() {
        System.out.print("Angka yang sudah diurutkan: ");
        for (Integer item : items) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public void removeItem(int value) {
        if (items.contains(value)) {
            items.remove(Integer.valueOf(value));
            System.out.println("Angka " + value + " telah dihapus.");
        } else {
            System.out.println("Angka " + value + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedItemList itemList = new SortedItemList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan angka");
            System.out.println("2. Tampilkan angka terurut");
            System.out.println("3. Hapus angka");
            System.out.println("4. Keluar");
            System.out.print("Pilih tindakan (1/2/3/4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    int newValue = scanner.nextInt();
                    itemList.addAndSort(newValue);
                    break;
                case 2:
                    itemList.displaySortedItems();
                    break;
                case 3:
                    System.out.print("Masukkan angka yang ingin dihapus: ");
                    int valueToDelete = scanner.nextInt();
                    itemList.removeItem(valueToDelete);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}