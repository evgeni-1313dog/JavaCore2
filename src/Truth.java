public class Truth {
    public static boolean truth (int[] array){
        if (array.length < 3) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[i + 2] == 0) {

                return true;
            }
        }

        return false;
    }
}
