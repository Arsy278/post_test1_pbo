## Dokumentasi Program
1. Class **Main**
   - Kelas **Main** berfungsi sebagai entry point untuk menjalankan program. Kelas ini berfungsi untuk menambah produk, menampilkan semua produk, menghapus produk, dan update produk.
   - Properties:
     - `Gudang (static Gudang)`
       - Instance Gudang yang digunakan untuk menyimpan dan mengelola produk yang ada.
   - Method:
     - `main(String[] args)`
       - Ini berfungsi untuk memulai program dan menyediakan antarmuka interaktif kepada pengguna. Pengguna dapat memilih beberapa opsi seperti menambah produk, menghapus produk, memperbarui produk, dan menampilkan semua produk melalui menu pilihan.
     - `tambahProduk(Scanner scanner)`
       - Fungsi: Meminta input dari pengguna untuk menambahkan produk baru ke dalam gudang.
       - Parameter:
         - scanner: Digunakan untuk mengambil input dari pengguna.
     - `hapusProduk(Scanner scanner)`
       - Fungsi: Menerima input dari pengguna untuk menghapus produk berdasarkan nama produk.
       - Parameter:
         - `scanner`
           - Digunakan untuk mengambil input dari pengguna.
     - `perbaruiProduk(Scanner scanner)`
       - Fungsi: Menerima input dari pengguna untuk memperbarui harga dan stok dari produk berdasarkan nama.
       - Parameter:
         - `scanner`
           - Digunakan untuk mengambil input dari pengguna.
2. Class **Gudang**
   - Kelas Gudang digunakan untuk mengelola daftar produk yang ada. Kelas ini berfungsi untuk menambah, menghapus, menampilkan, dan update produk yang ada di gudang.
   - Properties:
     - `daftarProduk (ArrayList<Produk>)`
     - Menyimpan daftar produk yang ada di dalam gudang. Properti ini diberi modifier final agar referensinya tidak dapat diubah.
   - Constructor:
     - `public Gudang()`
     - Membuat instance Gudang dengan daftar produk awal.

   - Method:
     - `tambahProduk(Produk produk)`
       - Menambahkan produk baru ke dalam daftar produkList.
       - Parameter:
         - `produk`
     - `hapusProduk(String namaProduk)`
       - Menghapus produk dari produkList berdasarkan nama produk.
       - Parameter:
         - `namaProduk`
           - Nama produk yang ingin dihapus.
     - `tampilkanProduk()`
       - Menampilkan semua produk yang ada di dalam gudang. Jika gudang kosong, akan mencetak pesan "Gudang kosong."
     - `perbaruiProduk(String produkName, double newPrice, int stokBaru)`
       - Memperbarui informasi harga dan stok dari produk berdasarkan nama produk.
         - Parameter:
         - `namaProduk`
           - Nama produk yang akan di-update.
         - `hargaBaru`
           - Harga baru dari produk.
         - `stokBaru`
           - Jumlah stok baru dari produk.
3. Class **Produk**









## Cara Kerja Program
![image](https://github.com/user-attachments/assets/d4353905-72ee-4ddf-97f1-79ba14c2f1d0)

Pada menu awal, terdapat beberapa menu yang dapat dipilih yaitu tambah produk, tampilkan semua produk, hapus produk dan update produk. Jika ingin keluar dari menu, silahkan pilih opsi keluar.

