package Task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
         counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");
        // Pemanggilan calculate dengan signature berbeda
        System.out.println("calculate(2,3) = " + calculate(2, 3));
        System.out.println("calculate(2.5,3.1) = " + calculate(2.5, 3.1));
        System.out.println("calculate(1,2,3) = " + calculate(1, 2, 3));
        System.out.println("calculate(\"Hi\",\"There\") = " + calculate("Hi", "There"));

        // ===== METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");
        print(10);
        print(3.1415);
        print("Hello overloaded print!");
        print(new int[]{1, 2, 3, 4});

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\n=== STATIC VS INSTANCE METHODS ===");
        System.out.println("Counter initial (static): " + getCounter());
        incrementCounter();
        System.out.println("Counter after incrementCounter(): " + getCounter());

        MethodsAdvancedPractice m1 = new MethodsAdvancedPractice("Instance-A");
        MethodsAdvancedPractice m2 = new MethodsAdvancedPractice("Instance-B");
        System.out.println("Counter after creating 2 instances: " + getCounter());
        System.out.println("m1 name: " + m1.getInstanceName());
        m1.displayInfo();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\n=== PASS BY VALUE - PRIMITIVES ===");
        int originalNumber = 10;
        System.out.println("Before modifyPrimitive: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("After modifyPrimitive: " + originalNumber + " (tidak berubah)");

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Array before modifyArray: " + Arrays.toString(originalArray));
        modifyArray(originalArray);
        System.out.println("Array after modifyArray: " + Arrays.toString(originalArray) + " (elem berubah)");

        int[] anotherArray = {10, 20, 30};
        System.out.println("anotherArray before reassignArray: " + Arrays.toString(anotherArray));
        reassignArray(anotherArray);
        System.out.println("anotherArray after reassignArray: " + Arrays.toString(anotherArray) + " (reference asli tetap)");

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedCopy = sortArrayCopy(numbers);
        System.out.println("original: " + Arrays.toString(numbers));
        System.out.println("sorted copy: " + Arrays.toString(sortedCopy));
        double[] stats = getArrayStats(numbers);
        System.out.println("stats [min,max,avg]: " + Arrays.toString(stats));
        int[] merged = mergeArrays(new int[]{1,2,3}, new int[]{4,5});
        System.out.println("merged: " + Arrays.toString(merged));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\n=== VARIABLE ARGUMENTS (VARARGS) ===");
        System.out.println("sum() = " + sum());
        System.out.println("sum(1,2,3) = " + sum(1,2,3));
        System.out.println("sum(5,10,15,20) = " + sum(5,10,15,20));
        printInfo("Scores", 80, 90, 75);

        // ===== METHOD CHAINING =====
        System.out.println("\n=== METHOD CHAINING ===");
        Calculator calc = new Calculator(10);
        double result = calc.add(5).multiply(2).subtract(4).getResult();
        System.out.println("Calculator chaining result: " + result);

        // ===== RECURSIVE METHODS =====
        System.out.println("\n=== RECURSIVE METHODS ===");
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("fibonacci(8) = " + fibonacci(8));
        int[] sortedForBinary = {1,2,3,4,5,6,7,8,9};
        System.out.println("binarySearchRecursive for 7: index = " + binarySearchRecursive(sortedForBinary, 7, 0, sortedForBinary.length - 1));

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\n=== UTILITY STATIC METHODS ===");
        System.out.println("power(2,10) = " + MathUtils.power(2, 10));
        System.out.println("isPrime(31) = " + MathUtils.isPrime(31));
        System.out.println("gcd(48,18) = " + MathUtils.gcd(48, 18));
        System.out.println("reverse(\"abcde\") = " + StringUtils.reverse("abcde"));
        System.out.println("isPalindrome(\"Level\") = " + StringUtils.isPalindrome("Level"));
        System.out.println("countWords(\"Hello world from Java\") = " + StringUtils.countWords("Hello world from Java"));
        int[][] mat = {{1,2,3},{4,5},{6}};
        ArrayUtils.printMatrix(mat);
        int[] dupTest = {1,2,3,2,4,1,5};
        System.out.println("findDuplicates: " + Arrays.toString(ArrayUtils.findDuplicates(dupTest)));
        System.out.println("areEqual([1,2],[1,2]) = " + ArrayUtils.areEqual(new int[]{1,2}, new int[]{1,2}));

        System.out.println("\n=== Semua demo selesai ===");
    }

    // ===== METHOD OVERLOADING EXAMPLES =====

    // Implementasi method calculate yang di-overload
    public static int calculate(int a, int b) {
        // Penjumlahan dua integer
        return a + b;
    }

    public static double calculate(double a, double b) {
        // Penjumlahan dua double
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        // Penjumlahan tiga integer
        return a + b + c;
    }

    public static String calculate(String a, String b) {
        // Concatenation dua string
        return a + b;
    }

    // Implementasi method print yang di-overload
    public static void print(int value) {
        System.out.println("[int] => " + value);
    }

    public static void print(double value) {
        System.out.println("[double] => " + value);
    }

    public static void print(String value) {
        System.out.println("[String] => " + value);
    }

    public static void print(int[] array) {
        System.out.println("[int[]] => " + Arrays.toString(array));
    }

    // ===== STATIC VS INSTANCE METHODS =====

    public static int getCounter() {
        // Return nilai counter static
        return counter;
    }

    public static void incrementCounter() {
        // Increment counter static
        counter++;
    }

    public String getInstanceName() {
        // Return instance name
        return instanceName;
    }

    public void setInstanceName(String name) {
        // Set instance name
        this.instanceName = name;
    }

    public void displayInfo() {
        // Display instance dan static information
        System.out.println("Instance name: " + this.instanceName + ", static counter: " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====

    public static void modifyPrimitive(int number) {
        // Modify parameter dan print perubahan
        System.out.println("Inside modifyPrimitive, before change: " + number);
        number = 999;
        System.out.println("Inside modifyPrimitive, after change: " + number);
    }

    public static void modifyArray(int[] array) {
        // Modify isi array (ubah elemen pertama sebagai demo)
        if (array != null && array.length > 0) {
            array[0] = array[0] * -1; // contoh modifikasi
            System.out.println("Inside modifyArray: first element changed to " + array[0]);
        }
    }

    public static void reassignArray(int[] array) {
        // Reassign reference array (hanya lokal)
        System.out.println("Inside reassignArray, before reassign: " + Arrays.toString(array));
        array = new int[]{99, 98, 97}; // hanya mengubah local reference
        System.out.println("Inside reassignArray, after reassign: " + Arrays.toString(array));
    }

    // ===== ARRAY METHODS =====

    public static int[] sortArrayCopy(int[] original) {
        // Return sorted copy tanpa mengubah original
        if (original == null) return null;
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy;
    }

    public static double[] getArrayStats(int[] array) {
        // Return array [min, max, average]
        if (array == null || array.length == 0) return new double[]{0,0,0};
        int min = array[0], max = array[0];
        double sum = 0;
        for (int v : array) {
            if (v < min) min = v;
            if (v > max) max = v;
            sum += v;
        }
        double avg = sum / array.length;
        return new double[]{min, max, avg};
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Merge dua array dan return hasil
        if (array1 == null) return array2 == null ? new int[0] : Arrays.copyOf(array2, array2.length);
        if (array2 == null) return Arrays.copyOf(array1, array1.length);
        int[] merged = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====

    public static int sum(int... numbers) {
        // Hitung sum dari varargs
        int s = 0;
        if (numbers == null) return 0;
        for (int n : numbers) s += n;
        return s;
    }

    public static void printInfo(String title, int... values) {
        // Print title dan semua values
        System.out.print(title + ": ");
        if (values == null || values.length == 0) {
            System.out.println("(no values)");
            return;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i < values.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    // ===== RECURSIVE METHODS =====

    public static long factorial(int n) {
        // Implementasi factorial recursive
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        // Implementasi fibonacci recursive (simple)
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // Implementasi binary search recursive (array harus terurut)
        if (array == null || left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] == target) return mid;
        if (array[mid] > target) return binarySearchRecursive(array, target, left, mid - 1);
        return binarySearchRecursive(array, target, mid + 1, right);
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====

    public static class MathUtils {
        public static double power(double base, int exponent) {
            // Implementasi power function (iteratif, menangani exponent >= 0)
            if (exponent == 0) return 1.0;
            double result = 1.0;
            int exp = Math.abs(exponent);
            for (int i = 0; i < exp; i++) result *= base;
            if (exponent < 0) return 1.0 / result;
            return result;
        }

        public static boolean isPrime(int number) {
            // Check apakah number adalah prime
            if (number <= 1) return false;
            if (number <= 3) return true;
            if (number % 2 == 0) return false;
            int r = (int)Math.sqrt(number);
            for (int i = 3; i <= r; i += 2) {
                if (number % i == 0) return false;
            }
            return true;
        }

        public static int gcd(int a, int b) {
            // Greatest Common Divisor (Euclidean)
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int t = a % b;
                a = b;
                b = t;
            }
            return a;
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            // Reverse string
            if (str == null) return null;
            return new StringBuilder(str).reverse().toString();
        }

        public static boolean isPalindrome(String str) {
            // Check palindrome (abaikan case dan spasi di kedua ujung)
            if (str == null) return false;
            String s = str.replaceAll("\\s+", "").toLowerCase();
            return s.equals(reverse(s));
        }

        public static int countWords(String str) {
            // Count words in string
            if (str == null) return 0;
            String trimmed = str.trim();
            if (trimmed.isEmpty()) return 0;
            return trimmed.split("\\s+").length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            // Print 2D array dengan format rapi
            System.out.println("Matrix:");
            if (matrix == null) {
                System.out.println("(null)");
                return;
            }
            for (int i = 0; i < matrix.length; i++) {
                System.out.print("Row " + i + ": ");
                if (matrix[i] == null) {
                    System.out.println("(null)");
                } else {
                    System.out.println(Arrays.toString(matrix[i]));
                }
            }
        }

        public static int[] findDuplicates(int[] array) {
            // Find duplicate elements (kembalikan array unik dari elemen yg muncul >1)
            if (array == null) return new int[0];
            Map<Integer, Integer> freq = new HashMap<>();
            for (int v : array) freq.put(v, freq.getOrDefault(v, 0) + 1);
            return freq.entrySet().stream()
                    .filter(e -> e.getValue() > 1)
                    .mapToInt(Map.Entry::getKey)
                    .toArray();
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            // Compare dua array
            return Arrays.equals(array1, array2);
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====

    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            // Add dan return this untuk chaining
            this.value += n;
            return this;
        }

        public Calculator multiply(double n) {
            // Multiply dan return this untuk chaining
            this.value *= n;
            return this;
        }

        public Calculator subtract(double n) {
            // Subtract dan return this untuk chaining
            this.value -= n;
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}
