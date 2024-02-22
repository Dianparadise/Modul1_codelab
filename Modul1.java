package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Data {
    String nama;
    char jenisKelamin;
    String tanggalLahir;

    void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = input.nextLine();

        System.out.print("Jenis kelamin (L/P): ");
        jenisKelamin = input.next().charAt(0);

        input.nextLine(); // membersihkan newline

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        tanggalLahir = input.nextLine();


    }

    void ouputData() {
        System.out.println("\n//output:");
        System.out.println("Nama: " + nama);
        //System.out.println("Jenis Kelamin: " + ((jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan"));

        switch (jenisKelamin){
            case ('L'):
                System.out.println("jenis kelamin: Laki-laki" );
                break;
            case ('P'):
                System.out.println("Jenis kelamin: Perempuan");

        }



        // Menghitung umur dan menampilkannya
        LocalDate tanggalLahirDate = LocalDate.parse(tanggalLahir);
        LocalDate tanggalSekarang = LocalDate.now();
        Period period = Period.between(tanggalLahirDate, tanggalSekarang);
        int umurDalamTahun = period.getYears();
        int umurDalamBulan = period.getMonths();
        System.out.println("Umur: " + umurDalamTahun + " tahun " + umurDalamBulan + " bulan");
    }
}

public class Modul1 {
    public static void main(String[] args) {
        Data dataDiri = new Data();
        dataDiri.inputData();
        dataDiri.ouputData();
    }
}
