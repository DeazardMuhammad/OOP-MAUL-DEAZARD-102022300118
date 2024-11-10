package MODUL1.MODUL1_DEAZARD;
// Todo : Import Arraylist and Scanner
import java.util.Scanner;

import java.util.ArrayList;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Makanan:");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Makanan:");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Makanan:");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan Brand Makanan:");
        String brand = scanner.nextLine();
        // Todo : Create a new object for MakananKering
        MakananKering makanan = new MakananKering(nama,jumlah,harga,brand);
        daftarMakananKering.add(makanan);
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Makanan:");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Makanan:");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Makanan:");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan Brand Makanan:");
        String brand = scanner.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah makanan = new MakananBasah(nama, jumlah, harga, brand);
        daftarMakananBasah.add(makanan);
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Basah berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            }
            for (MakananKering makananKering : daftarMakananKering) {
            System.out.println();
            makananKering.ShowDataKering();
            }
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah makananBasah : daftarMakananBasah) {
            System.out.println();
            makananBasah.ShowDataBasah();
            }
        }
    }
