package MODUL2.MODUL2_DEAZARD;

class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivate;
    // To do: Buatlah constructor pada class KomputerPremium

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivate) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivate = ruangPrivate;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    public void Informasi(){
        System.out.println("=== INFORMASI KOMPUTER ===");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga Per Jam:Rp."+hargaPerJam);
        if (ruangPrivate == true) {
            String status = "Ruangan Premium";
            System.out.println("Status: "+ status);
            System.out.println("\nFasilitas:");
            System.out.println("- Ruangan Ber-AC");
            System.out.println("- Sofa Gaming Ekslusif");
            System.out.println("- Komputer spek super");
            System.out.println("- Koneksi kencang banget\n");
        }else{
            String status = "Ruangan Standar";
            System.out.println("Status: "+ status);
            System.out.println("\nFasilitas:");
            System.out.println("- Panas wkwk\n");
        }
        
           
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer){
        System.out.println("Memesan Komputer Nomor: " + nomorKomputer);
    }

    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah Layanan Makanan: " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Tambahlayanan(String makanan, String minuman){
        System.out.println("Menambah Layanan Makanan: " + makanan + " dan Minuman: " + minuman);
        }

    
}
