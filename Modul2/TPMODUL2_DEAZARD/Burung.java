package MODUL2.TPMODUL2_DEAZARD;

class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
        this.mood = "ceria";  // Mood khusus untuk burung
    }

    @Override
    public void suara() {
        System.out.println(nama + " berkicau dengan riang.");
    }

    @Override
    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
        System.out.println("Warna bulu: " + warnaBulu);
    }

    @Override
    public void berinteraksi() {
        System.out.println(nama + " terbang berputar-putar, tampak sangat " + mood + "!");
    }
}
