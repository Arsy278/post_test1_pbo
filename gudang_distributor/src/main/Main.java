package main;

import model.Produk;
import model.Gudang;
import java.util.Scanner;

public class Main {
    static Gudang gudang = new Gudang();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("===== Aplikasi Manajemen Gudang Distributor =====");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Update Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1 -> tambahProduk(scanner);
                case 2 -> gudang.displayAllProducts();
                case 3 -> removeProduct(scanner);
                case 4 -> updateProduct(scanner);
                case 5 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
    
    public static void tambahProduk(Scanner scanner) {
        System.out.print("Nama Produk: ");
        String name = scanner.nextLine();
        System.out.print("Harga Produk: ");
        double price = scanner.nextDouble();
        System.out.print("Stok Produk: ");
        int stock = scanner.nextInt();
        
        Produk product = new Produk(name, price, stock);
        gudang.addProduct(product);
        System.out.println("Produk berhasil ditambahkan.");
    }
    
    public static void removeProduct(Scanner scanner) {
        System.out.print("Nama produk yang akan dihapus: ");
        String name = scanner.nextLine();
        gudang.removeProduct(name);
        System.out.println("Produk berhasil dihapus.");
    }
    
    public static void updateProduct(Scanner scanner) {
        System.out.print("Nama Produk yang akan diupdate: ");
        String name = scanner.nextLine();
        System.out.print("Harga baru: ");
        double price = scanner.nextDouble();
        System.out.print("Stok baru: ");
        int stock = scanner.nextInt();
        gudang.perbaruiProduk(name, price, stock);
    }
}