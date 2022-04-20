import java.util.Arrays;

public class Main {
    public static void arr1() {
        int[] arr = new int[]{1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arr2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arr3() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arr4() {
        int[][] arr = new int[5][5];

        for (int j = arr.length - 1, i = 0; i < arr.length; i++) {

            arr[i][i] = 1;
            arr[i][j] = 1;
            j = j - 1;

        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void arr5(int len, int initialValue ) {
        int[] arr =new int[len];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = initialValue;

        }
        System.out.println(Arrays.toString(arr));
    }


    public static void minMax() {
        int[] arr = new int[]{1,2,5,7,6,113,185,185,10,10,-10};
        int min = 0, max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(min >= arr[i]){
               min  = arr[i];
            }
            if(max <= arr[i]){
                max = arr[i];
            }

        }
        System.out.println("min = " + min + "\n" + "max = " + max );

    }

    public static boolean leftRight(int[] arr) {
        int left = 0, right=0;



        for (int i = 0, j=0; i < arr.length-j ; i++) {
            left = left + arr[i];
            if(left > right){
                right= right+arr[arr.length-1-j++];
            }


        }
        System.out.println("right = " + right + "\n" + "left = " + left );
        return true;
    }


    public static void main(String[] args) {
        arr1();
        arr2();
        arr3();
        arr4();
        arr5(5, 8);
        minMax();
        leftRight(new int[]{2,2,2,1,2,2,10,1});


    }
}