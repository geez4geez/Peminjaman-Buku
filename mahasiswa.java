public class mahasiswa {
    private String nim;
    private String nama;
    private buku[] daftarBuku;

    public mahasiswa(String nim, String nama, int jumlahBuku) {
        this.nim = nim;
        this.nama = nama;
        this.daftarBuku = new buku[jumlahBuku];
    }

    public void setBuku(int index, buku b) {
        this.daftarBuku[index] = b;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public buku[] getDaftarBuku() {
        return daftarBuku;
    }
}
