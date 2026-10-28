package TugasPKLalan_P6;

public class Main {
    public static void main(String[] args) {
        System.out.println("No 1");
        System.out.println("-----------------------------------------------");        
        Buku b = new Buku("Cara Menangkap Belalang", "Franz Kafka", 2026);
        Buku b1 = new Buku("Cara Menangkap Belalang", "Franz Kafka");
        Buku b2 = new Buku("Cara Menangkap Belalang");
        Buku b3 = new Buku();
        b.tampilkan();
        System.out.println("-----------------------------------------------");
        b1.tampilkan();
        System.out.println("-----------------------------------------------");        
        b2.tampilkan();
        System.out.println("-----------------------------------------------");        
        b3.tampilkan();
        System.out.println("-----------------------------------------------");        
        
        System.out.println("===============================================");
        
        System.out.println("No 2");
        System.out.println("-----------------------------------------------");        
        Mobil m = new Mobil("Toyota", "Avanza");
        Mobil m1 = new Mobil("Honda", "Civic", 2020);
        m.tampil();
        System.out.println("-----------------------------------------------");        
        m1.tampil();
        
        System.out.println("===============================================");
        
        System.out.println("No 3");
        System.out.println("-----------------------------------------------");
        Lingkaran l1 = new Lingkaran(5);
        l1.tampilkan();
        
        }
        
}
