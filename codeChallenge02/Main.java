    public static void main(String[] args) {
        int[] arr1  = {4,8,18,23,42};
        System.out.println(Arrays.toString(insertArray(arr1, 15)));


          public static int[] insertArray(int[] arr, int num){
        int[] newArr = new int[arr.length+1];
        int middleNumber = (int) Math.ceil(arr.length/2.0);
        for(int k=0; k<arr.length ;k++){
            newArr[k]= arr[k];
        }
        for(int i =newArr.length-1; i > middleNumber ; i--){
            newArr[i] = newArr[i-1];
        }
        newArr[middleNumber] = num;
        return newArr;


    }
    }