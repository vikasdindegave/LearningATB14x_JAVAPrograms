package ex_03_arrays;

public class Lab003_SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,11,13,15};
        int sum = 0;

        for (int i=0; i< array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum ="+sum);
    }
}
