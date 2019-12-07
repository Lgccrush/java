package cn.tedu.java;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,0,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 0;i < arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
