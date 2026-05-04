package pertemuan.pkg5;

public class pertemuan5_MenuCafe {
    public static void main(String[] args) {
        // Array menu minuman
        String[] menuNama = {"Kopi Hitam", "Latte", "Matcha", "Cappuccino", "Espresso"};
        int[] energi = {30, 50, 40, 45, 60};

        // Daftar menu
        System.out.println("=== Menu Cafe ===");
        for (int i = 0; i < menuNama.length; i++) {
            System.out.println((i + 1) + ". " + menuNama[i] + " (Energi: " + energi[i] + ")");
        }

        // Energi pelanggan
        int energiPelanggan = 70;
        System.out.println("\nEnergi awal pelanggan: " + energiPelanggan);

        // Minum Kopi Hitam (index 0)
        energiPelanggan += energi[0];
        System.out.println("Pelanggan meminum " + menuNama[0]);
        System.out.println("Energi setelah minum: " + energiPelanggan);
    }
}