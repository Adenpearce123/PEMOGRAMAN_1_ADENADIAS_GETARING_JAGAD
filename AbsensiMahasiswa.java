package tugas_pert8;

import java.util.Scanner;

public class AbsensiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        String[] status = new String[100];
        int jumlah = 0;

        int hadir = 0, izin = 0, alfa = 0;
        int pilihan;

        boolean jalan = true;

        System.out.println("=== Sistem Absensi Mahasiswa ===");

        while (jalan) {
            // S1: input pilihan
            System.out.println("\nMenu:");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Tampilkan Rekap");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            // IF kondisi
            if (pilihan == 1) {
                char ulang;

                do {
                    // S2: input data
                    System.out.print("\nNama Mahasiswa: ");
                    nama[jumlah] = input.nextLine();

                    System.out.print("Status (Hadir/Izin/Alfa): ");
                    status[jumlah] = input.nextLine();

                    // hitung rekap
                    if (status[jumlah].equalsIgnoreCase("Hadir")) {
                        hadir++;
                    } else if (status[jumlah].equalsIgnoreCase("Izin")) {
                        izin++;
                    } else {
                        alfa++;
                    }

                    jumlah++;

                    System.out.print("Input lagi? (y/n): ");
                    ulang = input.next().charAt(0);
                    input.nextLine();

                } while (ulang == 'y' || ulang == 'Y');

            } else if (pilihan == 2) {
                // S3: tampilkan data + rekap
                System.out.println("\n=== Data Absensi ===");
                for (int i = 0; i < jumlah; i++) {
                    System.out.println((i + 1) + ". " + nama[i] + " - " + status[i]);
                }

                System.out.println("\n=== Rekap ===");
                System.out.println("Hadir : " + hadir);
                System.out.println("Izin  : " + izin);
                System.out.println("Alfa  : " + alfa);

            } else {
                // S4: keluar
                System.out.println("\nProgram selesai. Terima kasih.");
                jalan = false;
            }
        }

        input.close();
    }
}