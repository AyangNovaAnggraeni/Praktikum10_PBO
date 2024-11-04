
package ArrayList_Praktikum;

public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private double Nilai1, Nilai2, Nilai3, Nilai4, Nilai5;  

    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, double Nilai1, double Nilai2, double Nilai3, double Nilai4, double Nilai5) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.Nilai1 = Nilai1;
        this.Nilai2 = Nilai2;
        this.Nilai3 = Nilai3;
        this.Nilai4 = Nilai4;
        this.Nilai5 = Nilai5;
    }
    
    public String getAlamat() {
        return Alamat;
    }

    public String getNIM() {
        return NIM;
    }  

    public String getNama() {
        return Nama;
    }

    public String getMataKuliah() {
        return MataKuliah;
    }

    public double getNilaiAkhir() {
        return 0.1 * Nilai1 + 0.15 * Nilai2 + 0.25 * Nilai3 + 0.15 * Nilai4 + 0.35 * Nilai5;
    }
}
