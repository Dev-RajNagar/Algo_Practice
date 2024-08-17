import java.util.Arrays;

/**
 * sortedSuared
 */
public class sortedSuared {
    public static void main(String[] args) {
        int[] ar1 = new int[] { 1, 2 };

        int[] sortedsquared2 = new int[ar1.length];
        sortedsquared2 = squared(ar1);
        System.out.println(sortedsquared2);
    }

    public static int[] squared(int[] array) {
        int[] sortedsquared = new int[array.length];
        for (int idx = 0; idx < array.length; idx++) {
            int value = array[idx];
            sortedsquared[idx] = value * value;
        }
        Arrays.sort(sortedsquared);
        System.out.println(sortedsquared);
        return sortedsquared;
    }
}