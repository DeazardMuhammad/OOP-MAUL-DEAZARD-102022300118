package MODUL2.MODUL2_DEAZARD;

public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(30 , "Warnet Gaming Deazard", 5000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();

        System.out.println();
        System.out.println("============================");


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP vip = new KomputerVIP(15, "Warnet Gaming Deazard", 7000, true);
        
        // To do: Panggillah Method Informasi dari class KomputerVIP
        vip.Informasi();
        // To do: Panggillah Method Login
        vip.Login("Deazard");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        vip.Bermain(3);
        vip.Bermain(3, 20);

        System.out.println();
        System.out.println("============================");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium premium = new KomputerPremium(5, "Warnet Gaming Deazard", 10000, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        premium.Informasi();
        // To do: Panggillah Method Pesan
        premium.Pesan(4);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        premium.TambahLayanan("Mie Goreng");
        premium.Tambahlayanan("Mie Goreng", "Es Teh Manis");
    }
}