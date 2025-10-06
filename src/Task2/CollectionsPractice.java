package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] fixedArray = new int[3];

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> dynamicList = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (tidak bisa menambah ukuran, kita bisa assign hanya 3 elemen)
        fixedArray[0] = 1;
        fixedArray[1] = 2;
        fixedArray[2] = 3;
        // jika kita mencoba fixedArray[3] = 4 -> akan ArrayIndexOutOfBoundsException

        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        for (int i = 1; i <= 5; i++) dynamicList.add(i * 10);

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("fixedArray length = " + fixedArray.length + " (tetap)");
        System.out.println("dynamicList size = " + dynamicList.size() + " (dinamis, bisa berubah)");

        // ===== GENERICS DASAR =====
        System.out.println("\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawList = new ArrayList();
        rawList.add("String");
        rawList.add(123);
        rawList.add(45.6);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Halo");
        stringList.add("Dunia");

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah (komentar)
        // stringList.add(10); // compile error jika dicoba

        System.out.println("rawList = " + rawList);
        System.out.println("stringList = " + stringList);
        System.out.println("doubleList = " + doubleList);

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        daftarMahasiswa.add("Andi");
        daftarMahasiswa.add("Budi");
        daftarMahasiswa.add("Citra");
        daftarMahasiswa.add("Dewi");
        daftarMahasiswa.add("Eka");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(2, "Fajar"); // disisipkan di index 2

        // - Print daftar mahasiswa
        printArrayList(daftarMahasiswa, "Daftar Mahasiswa (setelah add)");

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        System.out.println("Mahasiswa pertama: " + daftarMahasiswa.get(0));
        // - Baca mahasiswa terakhir
        System.out.println("Mahasiswa terakhir: " + daftarMahasiswa.get(daftarMahasiswa.size() - 1));
        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        System.out.println("Apakah 'Citra' ada? " + daftarMahasiswa.contains("Citra"));
        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        System.out.println("Index 'Dewi': " + daftarMahasiswa.indexOf("Dewi"));
        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Jumlah mahasiswa: " + daftarMahasiswa.size());

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        daftarMahasiswa.set(1, "Bagus"); // ubah Budi -> Bagus
        printArrayList(daftarMahasiswa, "Daftar Mahasiswa (setelah set)");

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        daftarMahasiswa.remove(3); // hapus index 3
        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("Eka");
        printArrayList(daftarMahasiswa, "Daftar Mahasiswa (setelah remove)");

        // - Hapus semua mahasiswa menggunakan clear()
        ArrayList<String> tempList = new ArrayList<>(daftarMahasiswa);
        tempList.clear();
        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("tempList kosong? " + tempList.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        angka.addAll(Arrays.asList(10, 20, 30, 40, 50));

        // - Iterasi menggunakan traditional for loop
        System.out.print("for loop: ");
        for (int i = 0; i < angka.size(); i++) System.out.print(angka.get(i) + " ");
        System.out.println();

        // - Iterasi menggunakan enhanced for loop (for-each)
        System.out.print("enhanced for: ");
        for (Integer n : angka) System.out.print(n + " ");
        System.out.println();

        // - Iterasi menggunakan while loop
        System.out.print("while loop: ");
        int i = 0;
        while (i < angka.size()) {
            System.out.print(angka.get(i) + " ");
            i++;
        }
        System.out.println();

        // - Iterasi menggunakan Iterator
        System.out.print("iterator: ");
        Iterator<Integer> it = angka.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        dataMahasiswa.add(new String[]{"Andi", "101", "Teknik Informatika"});
        dataMahasiswa.add(new String[]{"Budi", "102", "Sistem Informasi"});
        dataMahasiswa.add(new String[]{"Citra", "103", "Teknik Elektro"});

        // - Print semua data dengan format tabel
        System.out.println(String.format("%-10s %-6s %-20s", "Nama", "NIM", "Jurusan"));
        for (String[] row : dataMahasiswa) {
            System.out.println(String.format("%-10s %-6s %-20s", row[0], row[1], row[2]));
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        numbers.addAll(Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        System.out.println("original: " + numbers);

        // - Gunakan Collections.sort() untuk mengurutkan
        Collections.sort(numbers);
        System.out.println("sorted: " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        Collections.reverse(numbers);
        System.out.println("reversed: " + numbers);

        // - Gunakan Collections.shuffle() untuk mengacak
        Collections.shuffle(numbers, new Random(1)); // deterministic shuffle for demo
        System.out.println("shuffled: " + numbers);

        // - Gunakan Collections.max() dan Collections.min()
        System.out.println("max: " + Collections.max(numbers));
        System.out.println("min: " + Collections.min(numbers));

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        numbers.add(22);
        System.out.println("numbers with duplicate: " + numbers);
        System.out.println("frequency of 22: " + Collections.frequency(numbers, 22));

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        buah.addAll(Arrays.asList("Apel", "Jeruk", "Mangga", "Pisang", "Anggur"));
        System.out.println("buah (unsorted): " + buah);

        // - Sort secara alfabetis
        Collections.sort(buah);
        System.out.println("buah (sorted): " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        int idx = Collections.binarySearch(buah, "Mangga");
        System.out.println("'Mangga' ditemukan di index (binarySearch): " + idx);

        // - Implementasikan linear search untuk list yang tidak diurutkan
        ArrayList<String> unsortedBuah = new ArrayList<>(Arrays.asList("Pisang", "Apel", "Anggur", "Jeruk"));
        int linIdx = linearSearch(unsortedBuah, "Anggur");
        System.out.println("'Anggur' ditemukan di index (linearSearch on unsorted): " + linIdx);

        // ===== ARRAYLIST 2D =====
        System.out.println("\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        matrix2D.add(new ArrayList<>(Arrays.asList(1, 2, 3)));       // row 0 length 3
        matrix2D.add(new ArrayList<>(Arrays.asList(4, 5)));          // row 1 length 2
        matrix2D.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9)));    // row 2 length 4

        // - Isi dengan nilai dan print dalam format matriks
        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"
        daftarBuku.add(new String[]{"Pemrograman Java", "S. Nugroho", "2015", "tersedia"});
        daftarBuku.add(new String[]{"Dasar-Dasar Algoritma", "R. Santoso", "2012", "tersedia"});
        daftarBuku.add(new String[]{"Struktur Data", "M. Irfan", "2018", "dipinjam"});
        daftarBuku.add(new String[]{"Jaringan Komputer", "L. Wibowo", "2016", "tersedia"});
        daftarBuku.add(new String[]{"Basis Data", "N. Prasetya", "2019", "tersedia"});

        // - Print daftar buku
        printDaftarBuku(daftarBuku, "Semua Buku (awal)");

        // - Implementasikan fungsi pinjam buku (ubah status)
        boolean pinjamResult = pinjamBuku(daftarBuku, "Dasar-Dasar Algoritma");
        System.out.println("Pinjam 'Dasar-Dasar Algoritma' sukses? " + pinjamResult);

        // - Implementasikan fungsi kembalikan buku
        boolean kembaliResult = kembalikanBuku(daftarBuku, "Struktur Data");
        System.out.println("Kembalikan 'Struktur Data' sukses? " + kembaliResult);

        // - Implementasikan pencarian buku berdasarkan judul
        String[] found = cariBuku(daftarBuku, "Basis Data");
        System.out.println("Hasil cari 'Basis Data': " + (found != null ? Arrays.toString(found) : "Tidak ditemukan"));

        // - Print daftar buku yang tersedia
        System.out.println("Buku tersedia:");
        for (String[] b : daftarBuku) {
            if ("tersedia".equalsIgnoreCase(b[3])) {
                System.out.println(Arrays.toString(b));
            }
        }

        // Latihan 13: Sistem nilai mahasiswa dinamis (sederhana demo)
        ArrayList<String[]> nilaiMahasiswa = new ArrayList<>();
        // format: [nim, nama, nilai]
        nilaiMahasiswa.add(new String[]{"101", "Andi", "85"});
        nilaiMahasiswa.add(new String[]{"102", "Budi", "78"});
        nilaiMahasiswa.add(new String[]{"103", "Citra", "92"});
        printArrayList(nilaiMahasiswa, "Nilai Mahasiswa");

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\n=== PERFORMANCE COMPARISON (Sederhana) ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList (demo sederhana - pengukuran waktu)
        int n = 100_000;
        int[] arr = new int[n];
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int k = 0; k < n; k++) {
            arr[k] = k;
            al.add(k);
        }

        // akses random 1_000 kali untuk perbandingan
        Random rnd = new Random(1);
        long startArr = System.nanoTime();
        int s = 0;
        for (int k = 0; k < 1000; k++) {
            s += arr[rnd.nextInt(n)];
        }
        long endArr = System.nanoTime();

        long startAl = System.nanoTime();
        int t = 0;
        for (int k = 0; k < 1000; k++) {
            t += al.get(rnd.nextInt(n));
        }
        long endAl = System.nanoTime();

        System.out.println("Waktu akses array (ns): " + (endArr - startArr));
        System.out.println("Waktu akses ArrayList (ns): " + (endAl - startAl));
        // Catatan: hasil dapat bervariasi, tapi akses index pada ArrayList juga O(1) karena backing array.

    }

    // ===== HELPER METHODS =====

    public static void printArrayList(ArrayList<?> list, String title) {
        System.out.println("---- " + title + " ----");
        int idx = 0;
        for (Object o : list) {
            System.out.println("[" + (idx++) + "] " + o);
        }
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) return i;
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        System.out.println("Matrix 2D (jagged):");
        for (ArrayList<Integer> row : matrix) {
            for (Integer v : row) {
                System.out.print(v + "\t");
            }
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul)) {
                if ("tersedia".equalsIgnoreCase(buku[3])) {
                    buku[3] = "dipinjam";
                    return true;
                } else {
                    return false; // sudah dipinjam
                }
            }
        }
        return false; // tidak ditemukan
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul)) {
                if ("dipinjam".equalsIgnoreCase(buku[3])) {
                    buku[3] = "tersedia";
                    return true;
                } else {
                    return false; // sudah tersedia
                }
            }
        }
        return false; // tidak ditemukan
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] buku : daftarBuku) {
            if (buku[0].equalsIgnoreCase(judul)) return buku;
        }
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        if (values == null || values.isEmpty()) return 0.0;
        double sum = 0.0;
        for (int v : values) sum += v;
        return sum / values.size();
    }

    private static void printDaftarBuku(ArrayList<String[]> daftarBuku, String title) {
        System.out.println("---- " + title + " ----");
        System.out.println(String.format("%-25s %-15s %-6s %-10s", "Judul", "Pengarang", "Tahun", "Status"));
        for (String[] b : daftarBuku) {
            System.out.println(String.format("%-25s %-15s %-6s %-10s", b[0], b[1], b[2], b[3]));
        }
    }
}
