package Pertemuan6.Soal1Ganjil;

public class segitiga {
    double alas;
    double tinggi;
    double sisi;

    public segitiga(){}

    public segitiga(double alas, double tinggi, double sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double getLuas(){
        return 0.5*alas*tinggi;
    }

    public double getKeliling(){
        return sisi*3;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void  setSisi(double sisi){
        this.sisi = sisi;
    }
}


//     public class Segitiga {
//     double alas;
//     double tinggi;
//     double sisi;

//     // constructor kosong
//     public Segitiga() {}

//     // constructor dengan parameter
//     public Segitiga(double alas, double tinggi, double sisi) {
//         this.alas = alas;
//         this.tinggi = tinggi;
//         this.sisi = sisi;
//     }

//     public double getLuas() {
//         return 0.5 * alas * tinggi;
//     }

//     public double getKeliling() {
//         return 3 * sisi;
//     }

//     public void setAlas(double alas) {
//         this.alas = alas;
//     }

//     public void setTinggi(double tinggi) {
//         this.tinggi = tinggi;
//     }

//     public void setSisi(double sisi) {
//         this.sisi = sisi;
//     }
// }
