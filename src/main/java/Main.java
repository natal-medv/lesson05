import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayIndexStorage ais = new ArrayIndexStorage(a);
        System.out.println(Arrays.toString(ais.arr));
        System.out.println(Arrays.toString(ais.reverse()));
    }
}
