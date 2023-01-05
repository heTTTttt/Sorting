public class ShakerSorting {
    public int[] shakerSort(int[] arr){ // метод сортування.
        for (int i = 0; i < arr.length/2; i++){
            boolean swapped = false;
            for (int j = i; j < arr.length - i - 1; j++){
                if (arr[j] < arr[j + 1]){
                    int tmp = arr[j];    // завдяки цим рядкам нам вдається змінювати елементи
                    arr[j] = arr[j + 1]; // масиву місцями між собою.
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
            if (!swapped) break; // блок (розривається, якщо не було замінено жодного елемента - масив сортується)
        }
        return arr;
    }
}
