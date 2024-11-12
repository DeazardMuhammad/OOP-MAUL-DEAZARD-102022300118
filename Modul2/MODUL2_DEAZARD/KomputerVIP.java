package MODUL2.MODUL2_DEAZARD;

class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected  boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    public void Informasi(){
        System.out.println("=== INFORMASI KOMPUTER ===");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga Per Jam:Rp."+hargaPerJam);
        if (vipCard == true) {
            String status = "Member VIP";
            System.out.println("Status: "+ status);
            System.out.println("\nBenefit:");
            System.out.println("- Diskon 10% untuk bermain 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam");
            System.out.println("- Prioritas komputer gaming\n");
        }else{
            String status = "Non VIP";
            System.out.println("Status: "+ status);
            System.out.println("\nBenefit:");
            System.out.println("- Tidak ada benefit wkwk\n");
        }
        
           
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username){
        System.out.println("Login dengan username: " + username);
    }

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam){
        System.out.println("Bermain selama " + jam + " jam");
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan){
        System.out.println("Nambah billing selama "+jam+" jam "+menitTambahan+" menit");
    }
}