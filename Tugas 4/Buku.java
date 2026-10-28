package TugasPKLalan_P6;

public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;
    
    public Buku(String judul,String pengarang, int tahunTerbit){
       this.judul = judul;
       this.pengarang = pengarang;
       this.tahunTerbit = tahunTerbit;
    }
    public Buku(String judul,String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 0;
    }
    public Buku(String judul){
        this.judul = judul;
        this.pengarang = "Tidak Diketahui";
        this.tahunTerbit = 0;
    }
    public Buku(){
        this.judul = "Belum Diisi";
        this.pengarang = "Tidak DiLetahui";
        this.tahunTerbit = 0;
    }
    void tampilkan(){
        System.out.println("Judul        : " + judul);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}
