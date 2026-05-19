class infinitearray {

    public static int infinitearray(int arr[],int target,int start,int end)










    public static int BinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            else if (target < arr[mid]) {

                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 10, 12, 20, 50, 82 };
        int target = 20;

        int result = BinarySearch(arr, target);
        System.out.println(result);

    }

}