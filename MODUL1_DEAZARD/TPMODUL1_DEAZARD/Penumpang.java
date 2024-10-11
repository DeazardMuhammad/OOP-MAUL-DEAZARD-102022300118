package MODUL1_DEAZARD.TPMODUL1_DEAZARD;
public class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    // Constructor
    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    // Method untuk menampilkan daftar penumpang
    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + namaDepan + " " + namaBelakang);
    }
}

