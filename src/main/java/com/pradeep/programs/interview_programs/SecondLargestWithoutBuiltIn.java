public class SecondLargestWithoutBuiltIn {
    public static void main(String[] args) {
        int arr[] = {20, 100, 10, 20, 150, 200};
        int temp = 0, largest = 0, secondLargest = 0, index = 1;
        sortArryInDecendingOrder(arr);
        largest = arr[0];
        secondLargest = getSecondlargest(index, arr, largest, secondLargest);
        System.out.println(secondLargest);
    }

    private static int getSecondlargest(int index, int[] arr, int largest, int slargest) {
        while (index < arr.length) {
            if (largest != arr[index]) {
                slargest = arr[index];
                break;
            }
            index++;
        }
        return slargest;
    }

    private static void sortArryInDecendingOrder(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
