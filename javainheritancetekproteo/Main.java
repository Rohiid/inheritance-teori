/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainheritancetekproteo;

/**
 *
 * @author victu
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<DVD> daftarDVD = new ArrayList<DVD>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih opsi:");
            System.out.println("1. Tambah DVD Film");
            System.out.println("2. Tambah DVD Musik");
            System.out.println("3. Lihat daftar DVD");
            System.out.println("4. Keluar");

            int pilihan = input.nextInt();
            input.nextLine(); // Mengonsumsi karakter newline

            switch (pilihan) {
                case 1:
                    tambahDVDFilm();
                    break;
                case 2:
                    tambahDVDMusik();
                    break;
                case 3:
                    lihatDaftarDVD();
                    break;
                case 4:
                    keluar();
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
                    break;
            }
            System.out.println();
        }
    }

    private static void tambahDVDFilm() {
        System.out.print("Judul: ");
        String judulFilm = input.nextLine();
        System.out.print("Pemeran: ");
        String pemeran = input.nextLine();
        System.out.print("Sutradara: ");
        String sutradara = input.nextLine();
        System.out.print("Publisher: ");
        String publisherFilm = input.nextLine();
        System.out.print("Kategori (SU/D/R/A): ");
        String kategoriFilm = input.nextLine();
        System.out.print("Stok: ");
        int stokFilm = input.nextInt();
        input.nextLine(); // Mengonsumsi karakter newline

        DVD film = new DVDFilm(judulFilm, pemeran, sutradara, publisherFilm, kategoriFilm, stokFilm);
        daftarDVD.add(film);

        System.out.println("DVD Film berhasil ditambahkan.");
    }

    private static void tambahDVDMusik() {
        System.out.print("Judul: ");
        String judulMusik = input.nextLine();
        System.out.print("Penyanyi: ");
        String penyanyi = input.nextLine();
        System.out.print("Produser: ");
        String produser = input.nextLine();
        System.out.print("Publisher: ");
        String publisherMusik = input.nextLine();
        System.out.print("Top hits: ");
        String topHits = input.nextLine();
        System.out.print("Kategori (C/J/P/R/O): ");
        String kategoriMusik = input.nextLine();
        System.out.print("Stok: ");
        int stokMusik = input.nextInt();
        input.nextLine(); // Mengonsumsi karakter newline

        DVD musik = new DVDMusik(judulMusik, penyanyi, produser, publisherMusik, topHits, kategoriMusik, stokMusik);
        daftarDVD.add(musik);

        System.out.println("DVD Musik berhasil ditambahkan.");
    }

    private static void lihatDaftarDVD() {
    if (daftarDVD.isEmpty()) {
        System.out.println("Tidak ada DVD yang tersimpan.");
    } else {
        System.out.println("Daftar DVD:");
        for (int i = 0; i < daftarDVD.size(); i++) {
            DVD dvd = daftarDVD.get(i);
            if (dvd instanceof DVDFilm) {
                DVDFilm film = (DVDFilm) dvd;
                System.out.println((i + 1) + ". " + film.judul + " - " + film.publisher + " (Film)");
            } else if (dvd instanceof DVDMusik) {
                DVDMusik musik = (DVDMusik) dvd;
                System.out.println((i + 1) + ". " + musik.judul + " - " + musik.publisher + " (Musik)");
            }
        }
    }
}

    private static void keluar() {
        System.out.println("Terima kasih telah menggunakan program ini.");
        System.exit(0);
    }
}

