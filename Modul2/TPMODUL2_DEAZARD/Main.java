package MODUL2.TPMODUL2_DEAZARD;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Detail Hewan Peliharaan ===\n");

        // Kucing
        Kucing kucing = new Kucing("Blacky", 4, "Munchkin");
        kucing.infoHewan();
        kucing.suara();
        kucing.makan();
        kucing.makan("Whiskas");
        kucing.berinteraksi();

        System.out.println("\n--------------------------------\n");

        // Burung
        Burung burung = new Burung("Elang", 9, "Putih");
        burung.infoHewan();
        burung.suara();
        burung.makan();
        burung.makan("Daging");
        burung.berinteraksi();
    }
}
