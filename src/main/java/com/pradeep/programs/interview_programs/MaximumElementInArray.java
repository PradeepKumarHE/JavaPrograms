public class MaximumElementInArray {
    static int arr[] = {20, 100, 10, 20, 200};
    static int largest() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(largest());
    }
}
