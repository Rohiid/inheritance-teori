/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainheritancetekproteo;

/**
 *
 * @author victu
 */

public class DVDMusik extends DVD {
    private String penyanyi;
    private String produser;
    private String topHits;

    public DVDMusik(String judul, String penyanyi, String produser, String publisher, String topHits, String kategori, int stok) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Produser: " + produser);
        System.out.println("Top hits: " + topHits);
    }
}

