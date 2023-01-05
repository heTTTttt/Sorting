public class ShakerSorting {
    public int[] shakerSort(int[] arr){
        for (int i = 0; i < arr.length/2; i++){
            boolean swapped = false;
            for (int j = i; j < arr.length - i - 1; j++){
                if (arr[j] < arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            for (int j = arr.length - 2 - i; j > i; j--){
                if (arr[j] > arr[j - 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    swapped = true;

                }
            }
            if (!swapped) break;
        }
        return arr;
    }
}
