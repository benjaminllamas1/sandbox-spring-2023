package org.example.sorting;

public class SortingUtility {

    public static <T extends Comparable<T>> void selectionSort(T[] data) {

        int min;

        for (int index = 0; index < data.length - 1; index++) {

            //Assume first value is the minimum
            min = index;

            for (int scan = index + 1; scan < data.length; scan++) {

                //Find minimum value
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }

            //swap min value with lowest index
            swap(data, min, index);
        }
    }
        private static <T extends Comparable<T>> void swap (T[] data, int min, int index){
            T temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }

    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for(int index = 1; index < data.length; index++){

            T key = data[index];
            int position = index;

            //shift larger values to the right
            while (position > 0 && data [position - 1].compareTo(key) > 0){
                data[position] = data[position-1];
                position--;
            }

            data [position] = key;
        }
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] data) {

    int position, scan;
    for(position = data.length -1; position >= 0; position--){

        for(scan =0; scan <= position -1; scan++){
            if(data[scan].compareTo(data[scan+1])>0){
                swap(data, scan, scan+1);
            }
    }
        public static <T extends Comparable<T>> void quickSort(T[] data) {
            quickSort(data, 0, data.length - 1);
            private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {

                if (min < max) {

                    // create partitions
                    int indexofpartition = partition(data, min, max);

                    // sort the left partition (lower values)
                    quickSort(data, min, indexofpartition - 1);

                    // sort the right partition (higher values)
                    quickSort(data, indexofpartition + 1, max);
                }

            }
        }
    }
}
}