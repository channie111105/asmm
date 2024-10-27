public class QuickSortExample {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Tìm chỉ số pivot
            int pivotIndex = partition(arr, low, high);

            // Đệ quy sắp xếp hai phần
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // Chỉ số của phần tử nhỏ hơn

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Đưa pivot về đúng vị trí
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array using Quick Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
