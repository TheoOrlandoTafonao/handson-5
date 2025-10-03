package Task1;

import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini ...
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1
        int[][] matriks = new int[3][4];
        matriks[0] = new int[]{1, 2, 3, 4};
        matriks[1] = new int[]{5, 6, 7, 8};
        matriks[2] = new int[]{9, 10, 11, 12};

        System.out.println("Isi matriks:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        // Latihan 2: papan catur
        String[][] catur = new String[3][3];
        for (int i = 0; i < catur.length; i++) {
            for (int j = 0; j < catur[i].length; j++) {
                catur[i][j] = ".";
            }
        }
        catur[0][0] = "X"; catur[1][1] = "X"; catur[2][2] = "X";
        catur[0][2] = "O"; catur[1][0] = "O"; catur[2][1] = "O";

        System.out.println("Papan Catur 3x3:");
        for (int i = 0; i < catur.length; i++) {
            for (int j = 0; j < catur[i].length; j++) {
                System.out.print(catur[i][j] + "\t");
            }
            System.out.println();
        }

        // ===== ARRAY JAGGED =====
        System.out.println("\n=== ARRAY JAGGED (IRREGULAR) ===");
        int[][] jagged = new int[4][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
        jagged[3] = new int[5];

        int angka = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = angka++;
            }
        }

        System.out.println("Isi array jagged:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Baris " + i + " (panjang " + jagged[i].length + "): ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + "\t");
            }
            System.out.println();
        }

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\n=== OPERASI LANJUTAN PADA ARRAY ===");

        int[][] matriksA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matriksB = {
                {6, 5, 4},
                {3, 2, 1}
        };

        // gunakan method yang diimplementasikan di bawah
        int[][] hasilTambah = addMatrices(matriksA, matriksB);
        int[][] hasilKaliScalar = multiplyByScalar(matriksA, 2);

        System.out.println("Matriks A:");
        printMatrix(matriksA);

        System.out.println("\nMatriks B:");
        printMatrix(matriksB);

        System.out.println("\nHasil Penjumlahan (A + B):");
        printMatrix(hasilTambah);

        System.out.println("\nHasil Perkalian Matriks A × 2:");
        printMatrix(hasilKaliScalar);

        // ===== LATIHAN 5: array sebagai parameter/return =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        int[] sorted = sortArray(numbers); // mengembalikan array baru yang terurut
        System.out.println("Sorted: " + Arrays.toString(sorted));

        int[] reversed = reverseArray(numbers);
        System.out.println("Reversed original: " + Arrays.toString(reversed));

        int[] minmax = findMinMax(numbers);
        System.out.println("Min: " + minmax[0] + ", Max: " + minmax[1]);

        // ===== LATIHAN 6: Arrays utility =====
        System.out.println("\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");
        int[] data = {5, 2, 8, 1, 9, 3};
        System.out.println("Data asli: " + Arrays.toString(data));
        Arrays.sort(data);
        System.out.println("Data terurut: " + Arrays.toString(data));
        int idx = Arrays.binarySearch(data, 8); // array sudah diurutkan
        System.out.println("Index angka 8: " + idx);

        int[] copy = Arrays.copyOf(data, 8);
        System.out.println("Copy with length 8: " + Arrays.toString(copy));

        // ===== LATIHAN 7: Array 3D =====
        System.out.println("\n=== ARRAY 3D DAN KOMPLEKS ===");
        int[][][] arr3d = new int[2][3][4];
        int val = 1;
        for (int a = 0; a < arr3d.length; a++) {
            System.out.println("Matrix ke-" + a + ":");
            for (int b = 0; b < arr3d[a].length; b++) {
                for (int c = 0; c < arr3d[a][b].length; c++) {
                    arr3d[a][b][c] = val++;
                    System.out.print(arr3d[a][b][c] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        // ===== LATIHAN 8: Sistem nilai mahasiswa (contoh sederhana) =====
        System.out.println("\n=== SKENARIO APLIKASI NYATA ===");
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int[][] grades = new int[namaMahasiswa.length][mataKuliah.length];
        fillRandomGrades(grades, 60, 100);

        System.out.println("Nilai mahasiswa (per mahasiswa):");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            double avg = calculateAverage(grades[i]);
            System.out.println(" | Avg: " + String.format("%.2f", avg));
        }
    }

    // ===== IMPLEMENTASI METHODS =====

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] A, int[][] B) {
        if (A == null || B == null) return null;
        int rows = A.length;
        int cols = A[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] A, int scalar) {
        if (A == null) return null;
        int rows = A.length;
        int cols = A[0].length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = A[i][j] * scalar;
            }
        }
        return res;
    }

    // Method untuk sorting array (mengembalikan copy terurut)
    public static int[] sortArray(int[] arr) {
        if (arr == null) return null;
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }

    // Method untuk reverse array (mengembalikan array baru)
    public static int[] reverseArray(int[] arr) {
        if (arr == null) return null;
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) return new int[]{0, 0};
        int min = arr[0];
        int max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[]{min, max};
    }

    // Method untuk mencetak matriks
    public static void printMatrix(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rnd.nextInt(max - min + 1) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        if (values == null || values.length == 0) return 0.0;
        double sum = 0;
        for (int v : values) sum += v;
        return sum / values.length;
    }
}
