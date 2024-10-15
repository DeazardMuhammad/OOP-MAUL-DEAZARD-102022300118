package MODUL1.TPMODUL1_DEAZARD;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pembelian {
    private static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    // Buat ArrayList untuk menyimpan pesanan tiket
    private static ArrayList<PesananTiket> daftarPesananTiket = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menambahkan data penerbangan
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
        daftarPenerbangan.add(new Penerbangan("TST123", "JPR, Jayapura", "BDG, Bandung", "15:00", "23:45", 2000000));
        daftarPenerbangan.add(new Penerbangan("LDR214", "DPS, Bali", "MLG, Malang", "12:00", "15:00", 1500000));
        daftarPenerbangan.add(new Penerbangan("IND520", "LPG, Lampung", "BDG, Bandung", "16:00", "21:30", 1800000));

        int pilihanMenu = 0;
        do {
            try {
                tampilkanMenuUtama();
                pilihanMenu = scanner.nextInt();
                scanner.nextLine(); // Menghindari masalah newline

                switch (pilihanMenu) {
                    case 1:
                        tampilkanDaftarPenerbangan();
                        break;
                    case 2:
                        beliTiket(scanner);
                        break;
                    case 3:
                        tampilkanPesananTiket();
                        break;
                    case 4:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Kembali ke menu awal.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah. Silakan masukkan angka yang sesuai.");
                scanner.nextLine(); // Membersihkan input buffer
            }
        } while (pilihanMenu != 4);

        scanner.close();
    }

    // Method untuk menampilkan menu utama
    private static void tampilkanMenuUtama() {
        System.out.println("====== EAD Ticket Booking System ======");
        System.out.println("1. Tampilkan Daftar Penerbangan");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Tampilkan Pesanan Tiket");
        System.out.println("4. Exit");
        System.out.print("Silahkan pilih menu: ");
    }

    // Method untuk menampilkan daftar penerbangan
    private static void tampilkanDaftarPenerbangan() {
        System.out.println("Daftar Penerbangan:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". ");
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
        }
    }

    // Method untuk membeli tiket
    private static void beliTiket(Scanner scanner) {
        System.out.println("Silahkan isi data diri anda terlebih dahulu");
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = scanner.nextLine();

        Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
        System.out.println("Terima Kasih telah Mengisi Data Pelanggan. Silahkan Pilih Tiket Penerbangan Yang Tersedia");

        tampilkanDaftarPenerbangan();
        
        int pilihan = 0;
        try {
            System.out.print("Pilih nomor penerbangan (ex: 1): ");
            pilihan = scanner.nextInt();

            // Cek apakah pilihan valid (dalam batas daftar penerbangan)
            if (pilihan < 1 || pilihan > daftarPenerbangan.size()) {
                System.out.println("Pilihan tidak valid. Kembali ke menu awal.");
                return; // Kembali ke menu utama
            }

            Penerbangan penerbanganDipilih = daftarPenerbangan.get(pilihan - 1);

            // Simpan pesanan ke dalam daftarPesananTiket
            PesananTiket pesanan = new PesananTiket(penumpang, penerbanganDipilih);
            daftarPesananTiket.add(pesanan);

            System.out.println("Pesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan angka yang sesuai.");
            scanner.nextLine(); // Membersihkan input buffer
        }
    }

    // Method untuk menampilkan semua pesanan tiket
    private static void tampilkanPesananTiket() {
        if (daftarPesananTiket.isEmpty()) {
            System.out.println("Tidak ada pembelian tiket.");
        } else {
            System.out.println("====== Daftar Pesanan Tiket ======");
            for (PesananTiket pesanan : daftarPesananTiket) {
                pesanan.tampilkanDetailPesanan();
            }
        }
    }
}


// Class untuk menyimpan pesanan tiket
class PesananTiket {
    private Penumpang penumpang;
    private Penerbangan penerbangan;

    // Constructor
    public PesananTiket(Penumpang penumpang, Penerbangan penerbangan) {
        this.penumpang = penumpang;
        this.penerbangan = penerbangan;
    }

    // Method untuk menampilkan detail pesanan tiket
    public void tampilkanDetailPesanan() {
        System.out.println("====== Detail Tiket Penerbangan ======");
        penumpang.tampilDaftarPenumpang();
        penerbangan.tampilDaftarPenerbangan();
    }
}

