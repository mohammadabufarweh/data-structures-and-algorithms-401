public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(binarySearch(new int[]{ 4, 8, 12, 54,74, 94 }, 8));
    }
    public static int binarySearch(int[] arr, int number) {
        boolean isThere=false;
        for (int i =0;i<arr.length;i++){
            if(arr[i]==number){
                 isThere=true;
            }
        }
        if (isThere) {
            int lower = 0;
            int higher = arr.length-1;
            int middle = (lower + higher) / 2;
                while (lower <= higher) {
                    if (arr[middle] < number) {
                        lower = middle + 1;
                    } else if (arr[middle] == number) {
                        return middle;
                    } else {
                        higher = middle - 1;
                    }
                    middle = (lower + higher) / 2;
                }
                return -1;
        }
        return -1;
    }
}