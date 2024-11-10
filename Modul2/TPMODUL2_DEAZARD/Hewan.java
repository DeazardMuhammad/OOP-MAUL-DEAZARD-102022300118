package MODUL2.TPMODUL2_DEAZARD;

class Hewan {
    protected String nama;
    protected int umur;
    protected String mood;  // Properti baru untuk menggambarkan suasana hati

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.mood = "normal";  // Default mood
    }

    public void suara() {
        System.out.println(nama + " mengeluarkan suara khasnya.");
    }

    public void makan() {
        System.out.println(nama + " sedang makan dengan tenang.");
    }

    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + " dengan penuh semangat!");
    }

    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
    }

    public void berinteraksi() {
        System.out.println(nama + " berinteraksi dengan suasana hati " + mood + ".");
    }
}
