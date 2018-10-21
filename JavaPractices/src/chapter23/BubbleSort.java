package chapter23;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};

        for (int i : bubbleSort(arr)) {
            System.out.print(i + " ");

        }

    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;

            for (int k = 0; k < list.length - i; k++) {
                if (list[k] > list[k + 1]) {
                    int temp = list[k];
                    list[k] = list[k + 1];
                    list[k + 1] = temp;
                    needNextPass = true;

                }
            }

        }
        return list;
    }
}
