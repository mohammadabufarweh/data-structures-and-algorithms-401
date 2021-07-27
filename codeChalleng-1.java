     public static void main(String[] args) {
    public static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reversedArray[arr.length-1-i] = arr[i];
        }
        return reversedArray;
    }

}