package test.com;

import java.util.Arrays;

public class bubbleSort {

    private static int[] mergedArray;

    public static void bubbleSortMain(){
        int[] arr1 = {8, 10, 25};
        int[] arr2 = {5, 7, 10, 15, 18, 20};
        mergeArray(arr1, arr2);
        bubbleSortMethod();
    }

    private static void mergeArray(int[]...array){
        int totalSize = 0;
        for(int[] a : array){
            totalSize += a.length;
        }

        int[] finalArray = new int[totalSize];
        int m = 0;

        for(int[] a : array){
            for(int n: a ){
                finalArray[m++] = n;
            }
        }
        mergedArray = finalArray;
    }

    private static void bubbleSortMethod(){

        for(int i=0;i<mergedArray.length-1;i++){
            for(int j=0;j<mergedArray.length-1;j++){
                if(mergedArray[j]>mergedArray[j+1]){
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j+1];
                    mergedArray[j+1] = temp;
                }
            }
        }

        int[] uniNums = new int[mergedArray.length];
        int uniInd = 0;

        for(int i=0;i<mergedArray.length-1;i++){
            if(!(mergedArray[i] ==mergedArray[i+1])){
                uniNums[uniInd++] = mergedArray[i];
            }
        }
        int[] finalNums = new int[uniInd];
        for(int i=0;i<=uniInd-1;i++){
            finalNums[i] = uniNums[i];
        }
        System.out.println("finalNums: "+Arrays.toString(finalNums));
    }

}
