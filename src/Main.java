import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 3, 2, 2, 1, 1, 6, 7, 8};
        int[] uniqueArray = method(array);
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] method(int[] array) {
        int с = 0;
        for (int i = 0; i < array.length; i++) {
            boolean bool = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                с++;
            }
        }
        int[] newArray = new int[с];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                newArray[index++] = array[i];
            }
        }

        return newArray;
    }
}
