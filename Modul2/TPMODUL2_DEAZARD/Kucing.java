package MODUL2.TPMODUL2_DEAZARD;

class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
        this.mood = "senang";  // Mood khusus untuk kucing
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeong dengan suara lembut.");
    }

    @Override
    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
        System.out.println("Ras: " + ras);
    }

    @Override
    public void berinteraksi() {
        System.out.println(nama + " berguling di lantai, terlihat " + mood + "!");
    }
}
