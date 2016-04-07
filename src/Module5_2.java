//Отсортировать массив (пузырьком (Bubble),
// это потом- выбором (Select), вставками (Insert))
// //    Покрыть юнит-тестами код к домашним заданиям лекций №4, №5, №9 и №10.
import java.util.Arrays;

public class Module5_2 {

    public static void main(String[] args) {
        int[] arr1 = {11, 2, 3, 4, 999, 5, 6, 77, 8};
        System.out.println("начальный массив");
        System.out.print(Arrays.toString(arr1));
        bubleSort(arr1);
        System.out.println("\nконечный массив");
        System.out.print(Arrays.toString(bubleSort(arr1)));
    }

    static int[] bubleSort(int[] arr1) {
        int tmp;
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length - j - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    tmp = arr1[i + 1];
                    arr1[i + 1] = arr1[i];
                    arr1[i] = tmp;
                }
            }
        }
    return arr1;
    }
}
