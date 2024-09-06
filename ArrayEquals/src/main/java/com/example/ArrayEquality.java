package ArrayEquals.src.main.java.com.example;

public class ArrayEquality {
    public static boolean areArraysEqual(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) {
            return a1 == a2;
        }
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
  
    public static boolean areMultiDimensionalArraysEqual(int[][] a11, int[][] a12) {
        if (a11 == null || a12 == null) {
            return a11 == a12;
        }
        if (a11.length != a12.length) {
            return false;
        }
        for (int i = 0; i < a11.length; i++) {
            if (a11[i] != a12[i]){
                return false;
            }
            else if (a11[i] == a12[i] || a11[i][i] != a12[i][i]){
                return false;
            }

        }
        return true;
    }
}
