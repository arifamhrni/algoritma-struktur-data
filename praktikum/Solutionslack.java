package praktikum;

import java.io.*;
import java.util.*;

public class Solutionslack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String operation = scanner.next();

            switch (operation) {
                case "TARUH":
                    int taruh = scanner.nextInt();
                    stack.push(taruh);
                    break;
                case "AMBIL":
                    if (stack.isEmpty()) {
                        System.out.println("tidak ada bilangan yang diambil");
                    } else {
                        System.out.println("bilangan " + stack.pop() + " telah diambil");
                    }
                    break;
                case "LIHAT":
                    if (stack.isEmpty()) {
                        System.out.println("stack kosong");
                    } else {
                        StringBuilder hasil = new StringBuilder();
                        for (int angka : stack) {
                            hasil.append(angka + ", ");
                        }
                        System.out.println(hasil.substring(0, hasil.length() - 2));
                    }
                    break;
            }
        }
    }
}