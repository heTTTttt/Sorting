public class ShakerSorting2 {

        public int[] shakerSort2(int[] nums) {
            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i <= nums.length - 2; i++) {
                    if (nums[i] > nums[i + 1]) {
                        //test if two elements are in the wrong order
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
                swapped = false;
                for (int i = nums.length - 2; i >= 0; i--) {
                    if (nums[i] > nums[i + 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);

            return nums;
        }
    }
