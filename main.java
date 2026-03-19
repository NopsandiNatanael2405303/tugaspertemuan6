package Pertemuan6.Soal1Ganjil;

import Pertemuan6.Soal1Ganjil.segitiga;

// public class main { 
public class main { 
    public static void main(String[] args) {

        // Cara 1: constructor kosong + setter
        segitiga s1 = new segitiga();
        s1.setAlas(1);
        s1.setTinggi(1);
        s1.setSisi(1);

        // Cara 2: langsung constructor
        segitiga s2 = new segitiga(30, 10, 90);
        segitiga s3 = new segitiga(20, 30, 60);

        // Output
        System.out.println("Segitiga 1:");
        System.out.println("Luas = " + s1.getLuas());
        System.out.println("Keliling = " + s1.getKeliling());

        System.out.println("\nSegitiga 2:");
        System.out.println("Luas = " + s2.getLuas());
        System.out.println("Keliling = " + s2.getKeliling());

        System.out.println("\nSegitiga 3:");
        System.out.println("Luas = " + s3.getLuas());
        System.out.println("Keliling = " + s3.getKeliling());
    }
}
// }
