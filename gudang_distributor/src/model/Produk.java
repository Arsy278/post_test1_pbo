package model;

public class Produk {
    private String nama;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String ambilNama() {
        return nama;
    }

    public double ambilHarga() {
        return harga;
    }

    public int ambilStok() {
        return stok;
    }

    public void aturNama(String nama) {
        this.nama = nama;
    }

    public void aturHarga(double harga) {
        this.harga = harga;
    }

    public void aturStok(int stok) {
        this.stok = stok;
    }

    public void tampilkanProduk() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga (Per Pack): " + "Rp "+ harga);
        System.out.println("Stok: " + stok);
    }
}