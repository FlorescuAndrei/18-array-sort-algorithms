package com.andrei;

public class MergeSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray(intArray);

        mergeSort(intArray, 0, intArray.length);

        printArray(intArray);

    }

    public static void mergeSort(int[] input, int start, int end){
        // start = first index
        //end = one greater than the last index

        //braking condition
        if(end - start < 2){
           return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){

        //optimization
        if (input[mid -1] <= input[mid]){
                return;
        }

        int i = start;
        int j = mid;

        int[] temp = new int[end - start];
        int tempIndex = 0;

        while(i < mid && j < end){

            //<= preserve relative order => stable algorithm
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        }

        //handling the remaining elements.
        // Second optimization, if we have elements in the second (right) array we do not copy in temp array, they are already bigger.
        System.arraycopy(input, i, input, start + tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);




    }


    public static void printArray(int[] array){
        for(int value: array){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
