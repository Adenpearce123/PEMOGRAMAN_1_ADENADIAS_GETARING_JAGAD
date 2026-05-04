package pertemuan.pkg6;

class Mobil {
    String namaMobil;
    String jenis;
    int kecepatanMaks; // km/jam

    // Constructor
    Mobil(String namaMobil, String jenis, int kecepatanMaks) {
        this.namaMobil = namaMobil;
        this.jenis = jenis;
        this.kecepatanMaks = kecepatanMaks;
    }

    // Method untuk info
    void tampilkanInfo() {
        System.out.println("Nama Mobil: " + namaMobil);
        System.out.println("Jenis: " + jenis);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + " km/jam");
        System.out.println("------------------------");
    }
}

public class pertemuan6_DataMobil {
    public static void main(String[] args) {
        // Objek dari class Mobil
        Mobil mobil1 = new Mobil("Toyota Supra", "Sport", 250);
        Mobil mobil2 = new Mobil("Honda CR-V", "SUV", 200);
        Mobil mobil3 = new Mobil("Tesla Model S", "Electric", 300);

        // Informasi
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        mobil3.tampilkanInfo();
    }
}