package Week26;

public class Example5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(arr, 7, 0, arr.length - 1));
    }
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return - 1;
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid -1, target);
        }
        return binarySearch(arr, mid + 1, right, target);
    }
}
