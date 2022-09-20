import java.util.Arrays;

public class AlgorTest {
    public static void main(String[] args) {
        //quickSorts, mergeSort
        int[] arr = {2, 4, 30, 5, 3};
        //bSort(arr);
        findGratestElement(arr);

        System.out.println("Sorted Array = " + Arrays.toString(arr));
    }

    public static void findGratestElement (int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
    public static void bSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }

            }
            System.out.println("current Array = " + Arrays.toString(arr));
        }

    }

}
