public class Main {
    public static void main(String[] args) {
        int [] array1 = {84, 93, 8, 46, 0, 2, 0};
        int [] array2 = {93, 5, 8, 54, -38, 45, 87};
        int [] array3 = {50, 9, 2, 6, 2, -50, 22, 39};
        int[] array = {0, 3};
        System.out.println("Количество чётных элементов :" + Evens.evens(array));
        System.out.println("Количество чётных элементов :" + Evens.evens(array1));
        System.out.println("Количество чётных элементов :" + Evens.evens(array2));
        System.out.println("Количество чётных элементов :" + Evens.evens(array3));

        System.out.println();

        System.out.println("Разница между мин. и макс :" + Difference.difference(array));
        System.out.println("Разница между мин. и макс :" + Difference.difference(array1));
        System.out.println("Разница между мин. и макс :" + Difference.difference(array2));
        System.out.println("Разница между мин. и макс :" + Difference.difference(array3));

        System.out.println();

        System.out.println("Eсть два соседних элемента, с нулевым значением :" + Truth.truth(array));
        System.out.println("Eсть два соседних элемента, с нулевым значением :" + Truth.truth(array1));
        System.out.println("Eсть два соседних элемента, с нулевым значением :" + Truth.truth(array2));
        System.out.println("Eсть два соседних элемента, с нулевым значением :" + Truth.truth(array3));
    }
}