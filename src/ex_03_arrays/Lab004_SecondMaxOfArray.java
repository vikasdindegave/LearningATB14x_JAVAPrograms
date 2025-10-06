package ex_03_arrays;

public class Lab004_SecondMaxOfArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println("length of array :" + array.length);

        int max = array[0];
        int secondMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        System.out.println("second max :" + secondMax);

    }
}
