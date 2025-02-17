import java.util.*;

public class DataStructureComparison {

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 100000, 1000000};  
        int target = 500;  

        for (int size : datasetSizes) {
            System.out.println("Testing with dataset size: " + size);

          
            int[] dataArray = generateArray(size);
            Set<Integer> hashSet = generateHashSet(size);
            Set<Integer> treeSet = generateTreeSet(size);

            
            long startTime = System.nanoTime();
            searchArray(dataArray, target);
            long endTime = System.nanoTime();
            System.out.println("Array Search Time: " + (endTime - startTime) / 1000000.0 + " ms");

            startTime = System.nanoTime();
            searchHashSet(hashSet, target);
            endTime = System.nanoTime();
            System.out.println("HashSet Search Time: " + (endTime - startTime) / 1000000.0 + " ms");

          
            startTime = System.nanoTime();
            searchTreeSet(treeSet, target);
            endTime = System.nanoTime();
            System.out.println("TreeSet Search Time: " + (endTime - startTime) / 1000000.0 + " ms");

            System.out.println();
        }
    }

    private static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

 
    private static Set<Integer> generateHashSet(int size) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(random.nextInt(size));
        }
        return set;
    }

 
    private static Set<Integer> generateTreeSet(int size) {
        Random random = new Random();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            set.add(random.nextInt(size));
        }
        return set;
    }

    
    private static void searchArray(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                break;
            }
        }
    }

    
    private static void searchHashSet(Set<Integer> set, int target) {
        set.contains(target);
    }

    private static void searchTreeSet(Set<Integer> set, int target) {
        set.contains(target);
    }
}
