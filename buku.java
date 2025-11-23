public class buku {
    private String isbn;
    private String judul;

    public buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }
}
