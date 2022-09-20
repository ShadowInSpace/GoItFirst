package Utils;

public class ArrayUtils {
    public static int[] subarray(int[] array, int startIndex, int endIndex){
        int[] resultArr = new int[endIndex-startIndex];
        int counter = 0;
        for (int i = startIndex; i < endIndex; i++) {
            resultArr[counter++] = array[i];
        }
        return resultArr;
    }
}
