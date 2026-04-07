import java.util.Scanner;

public class pertemuan2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nama, nim, alamat, email;
        int umur;

        System.out.print("Input Nama   : ");
        nama = input.nextLine();

        System.out.print("Input NIM    : ");
        nim = input.nextLine();

        System.out.print("Input Umur   : ");
        umur = input.nextInt();
        input.nextLine(); // agar tidak loncat saat input berikutnya

        System.out.print("Input Alamat : ");
        alamat = input.nextLine();

        System.out.print("Input Email  : ");
        email = input.nextLine();

        System.out.println("\n===== Data Mahasiswa =====");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Email  : " + email);
    }
}