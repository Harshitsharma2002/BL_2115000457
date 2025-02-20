import java.util.*;

public class ListRotator {
    public static void rotateList(ArrayList<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = positions; i < size; i++) {
            temp.add(list.get(i));
        }
        for (int i = 0; i < positions; i++) {
            temp.add(list.get(i));
        }

        for (int i = 0; i < size; i++) {
            list.set(i, temp.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original List: " + numbers);

        rotateList(numbers, 2);

        System.out.println("Rotated List: " + numbers);
    }
}