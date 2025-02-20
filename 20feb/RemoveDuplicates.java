import java.util.*;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        System.out.println("Original List: " + numbers);

        ArrayList<Integer> uniqueList = removeDuplicates(numbers);
        System.out.println("List After Removing Duplicates: " + uniqueList);
    }
}