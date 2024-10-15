package MODUL1.MODUL1_DEAZARD;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        Scanner scanner = new Scanner(System.in);
        ManajemenInventaris TampilkanSemua = new ManajemenInventaris();
         // Todo : Create Loop list menu

        while (true) {
        System.out.println("===== Menu Inventaris Makanan EAD =====");
        System.out.println("1. Tambah Makanan Kering");
        System.out.println("2. Tambah Makanan Basah");
        System.out.println("3. Tampilkan Semua Makanan");
        System.out.println("4. Keluar");
        int pilihanMenu = 0;
        System.out.print("Pilih Menu: ");
        pilihanMenu = scanner.nextInt();
        scanner.nextLine();
        switch (pilihanMenu) {
            case 1:
            TampilkanSemua.tambahMakananKering();
                break;
            case 2:
            TampilkanSemua.tambahMakananBasah();
                break;
            case 3:
            TampilkanSemua.tampilkanSemuaMakanan();
                break;
            case 4:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid. Kembali ke menu awal.");
                break;
        }

        }
        

            }
        }

