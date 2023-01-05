import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ShakerSorting shakerSorting = new ShakerSorting();
        ShakerSorting2 shakerSorting2 = new ShakerSorting2();

        int[] arr = new int[]{1, 5, 3, 7, 4, 8, 2, 9, 0, 6};
        int n = arr.length;
        System.out.println("Shaker sort revers : " + Arrays.toString(shakerSorting.shakerSort(arr)));
        System.out.println("Shaker sort " + Arrays.toString(shakerSorting2.shakerSort2(arr)));

        QuickSorting.quickSort(arr, 0, n - 1);
        System.out.println("Quick sort: ");
        QuickSorting.printArray(arr, n);
    }
}
