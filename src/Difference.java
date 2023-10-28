public class Difference {
    public static int difference(int [] array) {
        if (array.length <= 1) {
            return 0; // или другое значение по умолчанию
        }

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max - min;

        }
}
