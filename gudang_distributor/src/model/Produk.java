package model;

public class Produk {
    private String name;
    private double price;
    private int stock;

    public Produk(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String ambilNama() {
        return name;
    }

    public double ambilHarga() {
        return price;
    }

    public int ambilStok() {
        return stock;
    }

    public void aturNama(String name) {
        this.name = name;
    }

    public void aturHarga(double price) {
        this.price = price;
    }

    public void aturStock(int stock) {
        this.stock = stock;
    }

    public void tampilkanProduk() {
        System.out.println("Nama Barang: " + name);
        System.out.println("Harga (Per Pack): " + "Rp "+ price);
        System.out.println("Stok: " + stock);
    }
}