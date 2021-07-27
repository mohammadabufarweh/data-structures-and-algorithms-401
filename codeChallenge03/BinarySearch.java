
    public class Library {
    public static void main(String[] args) {
        BinarySearch(new int[]{4, 8, 15, 16, 23, 42}, 42);
    }

    public static int[] BinarySearch(int[] arr, int num) {
        int k;
        for (k = 0; k < arr.length / 2; k++) {
            if (num == arr[k]) {
                System.out.println(k);
                k = 100;
            }
        }
        System.out.println(k);
        if (k ==3) {
            for (int w = k ; w < arr.length; w++) {
                if (num == arr[w]) {
                    System.out.println("this the ans "+ w);
                    w = 100;
                }
            }
        }
        return arr;
    }
    }