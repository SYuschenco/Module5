import java.util.Arrays;

public class Module5_1 {

    //Найти максимальный/минимальный элемент массива

    public static void main(String[] args) {

        FinderMinAndMaxElementOfArray finderMinAndMaxElementOfArray = new FinderMinAndMaxElementOfArray();
        int[] arr1 = finderMinAndMaxElementOfArray.arr1;
        System.out.println(Arrays.toString(arr1));
        finderMinAndMaxElementOfArray.getMin();
        finderMinAndMaxElementOfArray.getMax();
    }
}

class FinderMinAndMaxElementOfArray {
    int[] arr1 = {-11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -999};
    int min = 0, max = 0;

    public Integer getMin() {
        System.out.println();
        findMinElementOfArray(arr1);
        return min;
    }

    public Integer getMax() {
        System.out.println();
        findMaxElementOfArray(arr1);
        return max;
    }

    public Integer findMinElementOfArray(int[] arr1) {
        int arr[] = arr1;
        int m = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (m > arr1[i]) m = arr[i];
        }
        System.out.print("\n" + "Минимальный элемент массива = " + m);
        return m;
    }

    public int findMaxElementOfArray(int[] arr1) {
        int arr[] = arr1;
        int m = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (m < arr[i]) m = arr[i];
        }
        System.out.print("\n" + "Mаксимальный элемент массива = " + m);
        return m;
    }


}
