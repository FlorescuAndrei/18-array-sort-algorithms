package com.andrei;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray(intArray);

        quickSort(intArray, 0, intArray.length);

        printArray(intArray);

    }

    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){        // = 2 => one element array
            return;
        }

        //return final position of the pivot
        int pivotIndex = partition(input, start, end);

        quickSort(input,  start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){

        //This is using first element as the pivot
        int pivot = input[start];

        int i = start;
        int j = end;

        //Process will alternate from left to right looking for values that are smaller and then larger that the pivot
        while(i < j){

            //Note: empty loop body. We using the loop to decrement j
            while (i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }

            //Note: empty loop body
            while(i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }


        }

        input[j] = pivot;
        return j;
    }

    public static void printArray(int[] array){
        for(int value: array){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
