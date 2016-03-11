//Отсортировать массив (пузырьком (Bubble),
                                                    // это потом- выбором (Select), вставками (Insert))

public class Module5_2 {

    public static void main(String[] args) {
        int[] arr1 = {11, 2, 3, 4, 5, 6, 77, 8, 999};
        int m = arr1.length;// длинна массива
        int[] arr2 = new int[m];
        int e = 0;

        System.out.println("\nначальный массив\n");
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + "  ");
        }

        for (int j = 0; j < m; j++) {

            for (int i = 0; i < m - j - 1; i++) {

                if (arr1[i] > arr1[i + 1]) {
                    e = arr1[i + 1];
                    arr1[i + 1] = arr1[i];
                    arr1[i] = e;
                }
            }
        }

        System.out.println();
        System.out.println("\nконечный массив\n");

        for (int i = 0; i < m; i++) {
            //	arr1[i]=arr2[i];
            System.out.print(arr1[i] + "  ");
        }
    }
}
