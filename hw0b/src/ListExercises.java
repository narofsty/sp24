import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
       int total = 0;
       for(int num : L) {
           total += num;
       }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evens = new ArrayList<>();
        for(int num : L) {
            if(num % 2 == 0)
                evens.add(num);
        }
        return evens;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> common = new ArrayList<>();
        for (int i = 0; i < L1.size(); i++) {
            for(int j = 0; j < L2.size(); j++) {
                if(Objects.equals(L1.get(i), L2.get(j))) {
                    common.add(L1.get(i));
                }
            }
        }
        return common;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int num = 0;
        for(String word : words) {
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == c) {
                    num++;
                }
            }
        }
        return num;
    }
}
