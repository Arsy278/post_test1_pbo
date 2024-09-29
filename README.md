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
   - Kelas Produk digunakan untuk memberikan identitas untuk produk yang ada di dalam gudang. Setiap produk tersebut memiliki nama, harga, dan stok.
   - Properties:
      - `nama (String)`
         - Nama dari produk.
      - `harga (double)`
         - Harga produk.
      - `stok (int)`
         - Jumlah stok produk yang tersedia.
   - Constructor:
      - `public Produk(String nama, double harga, int stok)`
   - Parameter:
      - `nama`: Nama produk.
      - `harga`: Harga produk.
      - `stok`: Jumlah stok produk.
      - Parameter tersebut berfungsi membuat objek Produk dengan nama, harga, dan stok tertentu.
   - Method:
      - ambilNama():
         - Untuk return nama produk.
      - ambilHarga():
         - Untuk return harga produk.
      - ambilStok():
         - Mengembalikan stok produk.
      - aturNama(String name):
         - Mengubah nama produk.
      - aturHarga(double price):
         - Mengubah harga produk.
      - aturStock(int stock):
         - Mengubah jumlah stok produk.
      - tampilkanProduk():
         - Menampilkan informasi produk seperti nama, harga, dan stok.

## Cara Kerja Program
![image](https://github.com/user-attachments/assets/d4353905-72ee-4ddf-97f1-79ba14c2f1d0)

Pada menu awal, terdapat beberapa menu yang dapat dipilih yaitu tambah produk, tampilkan semua produk, hapus produk dan update produk. Jika ingin keluar dari menu, silahkan pilih opsi keluar.

1. Tambah Produk

   - Pengguna dapat memilih opsi 1 untuk menambahkan produk baru dengan memasukkan nama produk, harga, dan stok.
   ![image](https://github.com/user-attachments/assets/1dc8dda6-0201-451a-8582-5c99aadff973)

2. Tampilkan Semua Produk

   - Pengguna dapat memilih opsi 2 untuk menampilkan semua produk yang ada di dalam gudang.
   ![image](https://github.com/user-attachments/assets/b64d802b-9f7c-4e1b-8170-ef4373f7b9ef)

3. Hapus Produk

   - Pengguna dapat memilih opsi 3 untuk menghapus produk yang ada di gudang berdasarkan nama.
   ![image](https://github.com/user-attachments/assets/6ff0b16c-e75f-4f57-a4a3-8a491d7cae85)
   - Berikut ini isi gudang setelah produk dihapus :
   
   ![image](https://github.com/user-attachments/assets/c3115eb1-9805-4448-b1a5-c1aaa70afcdf)

4. Update Produk
   - Opsi terakhir adalah opsi 4 yaitu opsi update produk. Opsi ini akan memperbarui produk, harga dan stok yang ada di gudang. Berikut contoh penggunaannya.
   - ![image](https://github.com/user-attachments/assets/1b2265f5-1ffc-4b94-bd25-8bd9689359ad)
   - Ini adalah daftar produk di gudang sebelum diupdate :
   - ![image](https://github.com/user-attachments/assets/925d8657-cb5b-49e5-8b26-d21a55b04de7)
   - Dan disini adalah daftar produk setelah diupdate :
   - ![image](https://github.com/user-attachments/assets/ee6920b9-f2d8-40fc-a9ed-9edd25541e24)

5. Keluar
   - Opsi ini digunakan untuk keluar dari program.

 


