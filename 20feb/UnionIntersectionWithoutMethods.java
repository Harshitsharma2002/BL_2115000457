import java.util.*;

public class UnionIntersectionWithoutMethods {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> union = new HashSet<>();
        for (int num : set1) {
            union.add(num);
        }
        for (int num : set2) {
            if (!union.contains(num)) {
                union.add(num);
            }
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : set1) {
            for (int num2 : set2) {
                if (num == num2) {
                    intersection.add(num);
                }
            }
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}