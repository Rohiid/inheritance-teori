/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainheritancetekproteo;

/**
 *
 * @author victu
 */
public class DVDFilm extends DVD {
    private String pemeran;
    private String sutradara;

    public DVDFilm(String judul, String pemeran, String sutradara, String publisher, String kategori, int stok) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Pemeran: " + pemeran);
        System.out.println("Sutradara: " + sutradara);
    }
}


