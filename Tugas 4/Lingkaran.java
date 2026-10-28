package TugasPKLalan_P6;

public class Lingkaran {
    double jarijari;
    
    public Lingkaran(double jarijari){
        if (jarijari <= 0) {
            this.jarijari = 1.0;
        }else{
            this.jarijari = jarijari;
        }
    }

    void tampilkan() {
        double luas = 3.14 * jarijari * jarijari;
        System.out.println("Jari - Jari : " + jarijari);
        System.out.println("Luas        : " + luas);
    }
}
