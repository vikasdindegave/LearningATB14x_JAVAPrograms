package ex_03_arrays;

public class Lab002_ReverseArray {
    public static void main(String[] args) {

        int[] array = {1,3,5,7,9,11,13,15};

        System.out.println("length of array is :"+array.length);

        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i] +",");
        }

    }
}
