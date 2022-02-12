package com.andrei;

public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray(intArray);

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for(int i = 0; i <= lastUnsortedIndex; i++ ){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        printArray(intArray);

    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array){
        for(int value: array){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
