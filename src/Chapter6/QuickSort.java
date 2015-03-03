package Chapter6;

public class QuickSort {

    public static void main(String[] args) {
        char[] items = new char[]{'y', 'a', 'c', 'f', 'd', 'l', 'a', 'x'};

        qsort(items);

        System.out.println(items);
    }

    static void qsort(char[] items) {
        sort(items, 0, items.length - 1);
    }

    private static void sort (char[] items, int left, int right) {

        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[ (left + right)/2 ];

        do {

            while ( (items[i] < x) && (i < right) ) {
                i++;
            }

            while ( (x < items[j]) && (j > left) ) {
                j--;
            }

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }

        } while ( i <= j);

        if (left < j) {
            sort(items, left, j);
        }
        if (i < right) {
            sort(items, i, right);
        }
    }
}
