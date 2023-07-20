package Arrays;

//25-01-2023
//Move all 0 to right and 1s to left
public class Right_left_side {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 1,0};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 1;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
