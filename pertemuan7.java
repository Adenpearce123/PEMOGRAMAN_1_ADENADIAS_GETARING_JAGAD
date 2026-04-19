import java.util.Scanner;

public class pertemuan7 {
    public static void main(String[] args) {

        Scanner simpan = new Scanner(System.in);

        int pilihan, jumlah;
        String rasa;
        String menu = "";
        int harga = 0;
        int total = 0;
        char lagi;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Ayam Goreng  (Rp10000)");
            System.out.println("2. Ayam Bakar   (Rp12000)");
            System.out.println("3. Ayam Geprek  (Rp15000)");
            System.out.println("4. Ayam Crispy  (Rp13000)");
            System.out.println("5. Ayam BBQ     (Rp14000)");

            System.out.print("Masukkan pilihan (1-5): ");
            pilihan = simpan.nextInt();
            simpan.nextLine(); // biar ga loncat

            // 🔹 IF-ELSE buat validasi
            if (pilihan >= 1 && pilihan <= 5) {

                // 🔹 SWITCH buat menu
                switch (pilihan) {
                    case 1:
                        menu = "Ayam Goreng";
                        harga = 10000;
                        break;
                    case 2:
                        menu = "Ayam Bakar";
                        harga = 12000;
                        break;
                    case 3:
                        menu = "Ayam Geprek";
                        harga = 15000;
                        break;
                    case 4:
                        menu = "Ayam Crispy";
                        harga = 13000;
                        break;
                    case 5:
                        menu = "Ayam BBQ";
                        harga = 14000;
                        break;
                }

                System.out.print("Masukkan variasi (rasa/level): ");
                rasa = simpan.nextLine();

                System.out.print("Masukkan jumlah: ");
                jumlah = simpan.nextInt();

                int subtotal = harga * jumlah;
                total += subtotal;

                System.out.println("\n--- Struk Sementara ---");
                System.out.println("Menu   : " + menu + " " + rasa);
                System.out.println("Harga  : Rp" + harga);
                System.out.println("Jumlah : " + jumlah);
                System.out.println("Subtotal: Rp" + subtotal);
                System.out.println("Total sementara: Rp" + total);

            } else {
                System.out.println("❌ Pilihan tidak tersedia");
            }

            System.out.print("\nMau pesan lagi? (y/n): ");
            lagi = simpan.next().charAt(0);

        } while (lagi == 'y' || lagi == 'Y');

        System.out.println("\n=== TOTAL AKHIR ===");
        System.out.println("Total bayar: Rp" + total);
        System.out.println("Terima kasih 🙏");
    }
}