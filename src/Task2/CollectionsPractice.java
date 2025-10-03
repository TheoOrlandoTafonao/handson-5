package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3

        // - Buat ArrayList<Integer> kosong

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        // - Tambahkan 5 elemen ke ArrayList (dinamis)

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar

        // ===== GENERICS DASAR =====
        System.out.println("\\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)

        // - Print daftar mahasiswa

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)

        // - Baca mahasiswa terakhir

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()

        // - Temukan index mahasiswa tertentu menggunakan indexOf()

        // - Print ukuran ArrayList menggunakan size()

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()

        // - Print daftar setelah update

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)

        // - Hapus semua mahasiswa menggunakan clear()

        // - Cek apakah ArrayList kosong menggunakan isEmpty()

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50

        // - Iterasi menggunakan traditional for loop

        // - Iterasi menggunakan enhanced for loop (for-each)

        // - Iterasi menggunakan while loop

        // - Iterasi menggunakan Iterator

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\\\\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\\\\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\\\\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"

        // - Sort secara alfabetis
        // TODO: Sort alphabetically

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search

        // ===== ARRAYLIST 2D =====
        System.out.println("\\\\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList

        // - Isi dengan nilai dan print dalam format matriks
        // TODO: Fill dan print matrix

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"

        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku

        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku

        // - Print daftar buku yang tersedia
        // TODO: Print available books

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\\\\n=== PERFORMANCE COMPARISON ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
    }

    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        // TODO: Print ArrayList dengan title
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        // TODO: Implementasi linear search
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        // TODO: Print 2D ArrayList matrix
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi pinjam buku
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi kembalikan buku
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi cari buku
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        // TODO: Hitung rata-rata
        return 0.0;
    }
}
