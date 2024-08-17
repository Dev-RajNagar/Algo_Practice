
import java.util.*;

class validate_subsequence {
    public static void main(String[] args) {
        List<Integer> sub = Arrays.asList(3, 6, 2, 1);
        List<Integer> array = Arrays.asList(21, 62, 3, 12, 5, 6, 9, 2, 1);
        boolean k;
        k = validate_subsequencee(array, sub);
        System.out.println(k);
    }

    public static boolean validate_subsequencee(
            List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < 
        
        
        
        
        
        
        
        
        
        
        
        
        
        0..size() && seqIdx < sequence.size()) {
            if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }
}