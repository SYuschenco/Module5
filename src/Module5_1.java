
public class Module5_1 {

    //Найти максимальный элемент массива

    public static void main(String[] args)
    {
        int [] arr1 = {-11,2,3,4,5,6,7,8,9,10,11,12,-999};
        int m = 0;
        m = arr1[1];

        for(int i = 0; i <= arr1.length  - 1; i++) {
            System.out.print(arr1[i] + "  ");

            if (m < arr1[i]){
                m=arr1[i];
            }
        }
        System.out.print("\n" +"максимальный элемент массива = " + m );

        for(int i = 0; i <= arr1.length  - 1; i++) {
        //    System.out.print(arr1[i] + "  ");

            if (m > arr1[i]){
                m=arr1[i];
            }
        }
        System.out.print("\n" +"Минимальный элемент массива = " + m );
    }
}
