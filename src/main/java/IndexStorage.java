public class IndexStorage {
    protected int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index % 2 == 0) {
            return index;
        } else {
            return -index;
        }
    }

    public int[] reverse() {
        int[] dstArr = new int[size];

        for (int i = 0; i < dstArr.length; i++) {
            dstArr[i] = get(dstArr.length - i - 1);
        }

        return dstArr;
    }
}
