public class QuickSorting {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*  Ця функція розміщує останній елемент як опору
        поворотний елемент у правильному положенні відсортовано
        масив і розміщує всі менші розміри (менше опорної точки)
        ліворуч від опори, а всі більші елементи – праворуч
        опори */
    static int partition(int[] arr, int low, int high)
    {

        // опора
        int pivot = arr[high];

        // Індекс меншого елемента і
        // вказує правильне положення
        // опорних значень
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // Якщо поточний елемент менший
            // ніж опорний
            if (arr[j] < pivot) {

                // Індекс приросту
                // менший елемент
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /*  Основний метод, який реалізує QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi - індекс поділу, arr[p]
            // зараз у потрібному місці
            int pi = partition(arr, low, high);

            // Окремо відсортуйте елементи раніше
            // перегородки та після перегородки
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Метод друку масиву
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

