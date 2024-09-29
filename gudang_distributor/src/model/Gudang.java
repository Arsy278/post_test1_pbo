package model;

import java.util.ArrayList;

public class Gudang {
    private final ArrayList<Produk> daftarProduk;

    public Gudang() {
        daftarProduk = new ArrayList<>();
        daftarProduk.add(new Produk("Jelly", 16000, 348));
        daftarProduk.add(new Produk("Biskuit", 11000, 263));
        daftarProduk.add(new Produk("Marshmallow", 10500, 238));
        daftarProduk.add(new Produk("Permen", 7500, 290));
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public void hapusProduk(String namaProduk) {
        daftarProduk.removeIf(produk -> produk.ambilNama().equalsIgnoreCase(namaProduk));
    }

    public void tampilkanProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Gudang kosong.");
        } else {
            System.out.println("Daftar Produk di Gudang:");
            for (Produk produk : daftarProduk) {
                produk.tampilkanProduk();
                System.out.println("-------------------");
            }
        }
    }
    
    public void perbaruiProduk(String namaProduk, double hargaBaru, int stokBaru) {
        for (Produk produk : daftarProduk) {
            if (produk.ambilNama().equalsIgnoreCase(namaProduk)) {
                produk.aturHarga(hargaBaru);
                produk.aturStok(stokBaru);
                System.out.println("Produk berhasil diupdate.");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }
}