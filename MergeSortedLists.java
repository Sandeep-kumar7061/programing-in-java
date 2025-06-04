// merge Two Sorted Lists
import java.util.*;

public class MergeSortedLists {
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number of elements in the first sorted list: ");
            int n1 = scanner.nextInt();
            List<Integer> list1 = new ArrayList<>();
            System.out.println("Enter elements for the first sorted list:");
            for (int i = 0; i < n1; i++) {
                list1.add(scanner.nextInt());
            }

            System.out.print("Enter the number of elements in the second sorted list: ");
            int n2 = scanner.nextInt();
            List<Integer> list2 = new ArrayList<>();
            System.out.println("Enter elements for the second sorted list:");
            for (int i = 0; i < n2; i++) {
                list2.add(scanner.nextInt());
            }

            List<Integer> mergedList = mergeLists(list1, list2);
            System.out.println("Merged Sorted List: " + mergedList);
        }
    }
}