package ex_03_arrays;

public class Lab001_MaxOfArray {
    public static void main(String[] args) {

        int[] array = {12,45,34,67,86,44,24,23,11};

        int max = array[0];

        for(int i=0; i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("max :"+max);
    }
}
