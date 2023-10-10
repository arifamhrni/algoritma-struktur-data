import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> rangkaian = new LinkedList<>();
        
        int jumlahGerbong = scanner.nextInt();
        for (int i = 0; i < jumlahGerbong; i++) {
            String jenisGerbong = scanner.next();
            if (jenisGerbong.equals("Lokomotif")) {
                rangkaian.addFirst(jenisGerbong);
            } 
            else if (jenisGerbong.equals("Bagasi")) {
                rangkaian.addLast(jenisGerbong);
            } 
            else if (jenisGerbong.equals("Restorasi")) {
                rangkaian.add(1, jenisGerbong);
            }
        }
        
        System.out.println(rangkaian);
    }
}
