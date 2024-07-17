import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {2, 1, 2, 0, 3, 9, 0, 2, 2, 0};
        //int[] array = {2, 0, 1, 0, 2, 0};
        //int[] array = {1,3,5};
        System.out.println(countEvens(array));
        System.out.println(differenceMaxMin(array));
        System.out.println(twoZero(array));

    }

    public static int countEvens(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int differenceMaxMin(int[] array){
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length-1];
        return max - min;
    }

    public static boolean twoZero(int[] array){
        int zero = 0;
        int temp = 1;

        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                if(array[i] == zero){
                    if(array[i] == array[i-1]){
                        return true;
                    }
                }
            } else if (array[i] == zero){
                if(array[i] == array[temp]){
                    if(array[i+1] == array[temp]){
                        return true;
                        }
                    }
                }
                temp++;
            }
        return false;
    }
}