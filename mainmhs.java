import java.util.Scanner;

public class mainmhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah buku yang dipinjam: ");
        int jumlah = input.nextInt();
        input.nextLine();

        mahasiswa mhs = new mahasiswa(nim, nama, jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1));

            System.out.print("Masukkan ISBN buku ke-" + (i + 1) + ": ");
            String isbn = input.nextLine();

            System.out.print("Masukkan Judul buku ke-" + (i + 1) + ": ");
            String judul = input.nextLine();

            buku b = new buku(isbn, judul);
            mhs.setBuku(i, b);
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("NIM   : " + mhs.getNim());
        System.out.println("Nama  : " + mhs.getNama());
        System.out.println("-----------------------------------------------------");
        System.out.println("No | ISBN            | Judul");
        System.out.println("-----------------------------------------------------");

        buku[] daftar = mhs.getDaftarBuku();
        for (int i = 0; i < daftar.length; i++) {
            System.out.println((i + 1) + "  | " + daftar[i].getIsbn() + "      | " + daftar[i].getJudul());
        }

        System.out.println("-----------------------------------------------------");

        input.close();
    }
}
