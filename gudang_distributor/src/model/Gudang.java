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

    public void addProduct(Produk product) {
        daftarProduk.add(product);
    }

    public void removeProduct(String productName) {
        daftarProduk.removeIf(product -> product.ambilNama().equalsIgnoreCase(productName));
    }

    public void displayAllProducts() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Gudang kosong.");
        } else {
            System.out.println("Daftar Produk di Gudang:");
            for (Produk product : daftarProduk) {
                product.tampilkanProduk();
                System.out.println("-------------------");
            }
        }
    }
    
    public void perbaruiProduk(String productName, double hargaBaru, int stokBaru) {
        for (Produk product : daftarProduk) {
            if (product.ambilNama().equalsIgnoreCase(productName)) {
                product.aturHarga(hargaBaru);
                product.aturStock(stokBaru);
                System.out.println("Produk berhasil diupdate.");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }
}