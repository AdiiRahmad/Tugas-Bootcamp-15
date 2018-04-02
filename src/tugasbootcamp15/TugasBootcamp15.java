/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbootcamp15;

/**
 *
 * @author AdiRahmad
 */
public class TugasBootcamp15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Hitung Perkalian
        TugasBootcamp15 kali = new TugasBootcamp15();
        System.out.println("Hasil Perkalian " + kali.Kali(-100, 3));

        //Hitung Perpangkatan
        TugasBootcamp15 pangkat = new TugasBootcamp15();
        System.out.println("Hasil Pangkatnya " + pangkat.Pangkat(3, -3));

        //Hitung Faktorial
        TugasBootcamp15 coba = new TugasBootcamp15();
        System.out.println("Hasil Faktorial " +coba.Faktorial(6));
        
        //Hitung Permutasi
        TugasBootcamp15 mutasi = new TugasBootcamp15();
        System.out.println("Hasil Permutasi " + mutasi.Permutasi(7, 4));
        
        //Hitung Kombinasi
         TugasBootcamp15 kombi = new TugasBootcamp15();
        System.out.println("Hasil Kombinasi " + kombi.Kombinasi(20 , 11));
    }

    //Perkalian
    public int Kali(int bilanganA, int bilanganB) {
        int hasil = 0;

        if (bilanganA <= 0) {
            for (int i = 0; i < bilanganB; i++) {
                hasil = hasil + bilanganA;
            }
        }
        if (bilanganA <= 0 && bilanganB <= 0) {
            for (int i = 0; i > bilanganB; i--) {
                hasil = hasil - (bilanganA);
            }
        }
        for (int i = 0; i < bilanganA; i++) {
            hasil = hasil + bilanganB;
        }
        return hasil;
    }

    //Perpangkatan
    public double Pangkat(int bilanganDasar, int bilanganPangkatnya) {
        double hasil = 1;
        if (bilanganPangkatnya < 0) {
            for (int i = 0; i > bilanganPangkatnya; i--) {
                hasil = hasil / bilanganDasar;
            }
        }

        for (int i = 1; i <= bilanganPangkatnya; i++) {
            hasil = hasil * bilanganDasar;
        }

        return hasil;
    }

    //Faktorial
    public int Faktorial(int bilanganA) {
        int hasil = 1;

        for (int i = 2; i <= bilanganA; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }

    //Permutasi
    public double Permutasi(double bilanganN, double bilanganR) {

        if (bilanganN < bilanganR) {
            System.err.println("Bilangan N tidak Boleh lebih kecil dari R");
        }
        double bilanganC = bilanganN - bilanganR;

        double hasilS1 = 1;
        double hasilS2 = 1;
        double hasilS3 = 1;

        for (int i = 1; i <= bilanganN; i++) {
            hasilS1 = hasilS1 * i;
        }

        for (int i = 1; i <= bilanganC; i++) {
            hasilS3 = hasilS3 * i;
        }
        double hasilpermutasi = hasilS1/hasilS3;

        return hasilpermutasi;

    }

    //Kombinasi
     public double Kombinasi(double bilanganN, double bilanganK) {

        double bilanganC = bilanganN - bilanganK;

        double hasilS1 = 1;
        double hasilS2 = 1;
        double hasilS3 = 1;

        for (int i = 2; i <= bilanganN; i++) {
            hasilS1 = hasilS1 * i;
        }

        for (int i = 2; i <= bilanganK; i++) {
            hasilS2 = hasilS2 * i;
        }
                        
        for (int i = 2; i <= bilanganC; i++) {
            hasilS3 = hasilS3 * i;
        }
        double hasilS4 = hasilS2 * hasilS3;

//            
        double hasilkombinasi = hasilS1/hasilS4;
        
//double hasilkombinasi = hasilS1 / (hasilS3 * hasilS2);
//        

        return hasilkombinasi;

    }
}
