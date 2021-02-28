import java.util.Arrays;

public class UpperCase {
    private static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] stringsArray = {"hh", "ee", "ll", "ll", "oo"};

        System.out.println("Initial state: " + Arrays.toString(stringsArray));
        System.out.println();

        convertToUpperCase(stringsArray);
        System.out.println("Final state: " + Arrays.toString(stringsArray));
    }
}
