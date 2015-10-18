package ch10;

/**
 * Created by apple on 9/26/15.
 */
public class test {
    public static void main(String[] args) {
        int[] array={1,4,5,6,2,3,5,6,9};
//        bubbleSort(array);
//        selectionSort(array);
//        insertionSort(array);
        quickSort(array,0,array.length-1);

        printArray(array);

    }
    public static void bubbleSort(int[] array){
        int len=array.length;
        for(int j=len-1; j>=0; j--){
            for (int i=0; i<j; i++){
                if(array[i]>array[i+1]){
                    int t=array[i];
                    array[i]=array[i+1];
                    array[i+1]=t;
                }
            }
        }
    }

    public static void selectionSort(int[] array){
        for(int i=0; i<array.length; i++){
            int minIndex=i;
            for (int j=i; j<array.length; j++){
                if (array[j]<array[minIndex]) minIndex=j;
            }
            int t=array[minIndex];
            array[minIndex]=array[i];
            array[i]=t;
        }
    }

    public static void insertionSort(int[] array){
        for(int i=0; i<array.length; i++){
            int index = array[i];
            int j=i;
            for( ; j>0 && array[j-1]>index; j--){
                    array[j]=array[j-1];
            }
            array[j]=index;
        }
    }

    public static void quickSort(int[] array, int left, int right){
        int index = partition(array,left,right);
        if (left<index-1) quickSort(array,left,index-1);
        if (index<right)quickSort(array,index,right);
    }
    public static int partition(int[] array, int left, int right){
        int pilot = array[(left+right)/2];
        while(left<=right){
            while (array[left]<pilot) left++;
            while (array[right]>pilot) right--;
            if (left<=right){
                int t = array[left];
                array[left]=array[right];
                array[right]=t;
                left++;
                right--;
            }
        }
        return left;
    }










    public static void printArray(int[] array){
        for(int i: array){
            System.out.print(i);
        }
    }


}
