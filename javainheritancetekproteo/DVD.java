/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainheritancetekproteo;

/**
 *
 * @author victu
 */
public class DVD {
    protected String judul;
    protected String publisher;
    protected String kategori;
    protected int stok;

    public DVD(String judul, String publisher, String kategori, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    public void displayData() {
        System.out.println("Judul: " + judul);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
    }
}

