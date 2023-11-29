import java.lang.reflect.Array;
import java.util.Arrays;

class SecondLargestElement{
    public static void main(String[] args) {
    //by sorting
    int arr1[] = {1,2,5,3,7,5,9,23};
    int temp;
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1.length-1;j++){
            if(arr1[j]>arr1[j+1]){
                temp = arr1[j+1];
                arr1[j+1]=arr1[j];
                arr1[j] = temp;
            }
        }
    }
    System.out.println(arr1[arr1.length-2]);
     

    //by min_value
    int arr[] = {1,3,2,45,3,5,7,6,498,5};
    int seclargest = 0;
    int firstlargest = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>firstlargest){
            seclargest=firstlargest;
            firstlargest=arr[i];
        }
    }
    System.out.println(seclargest);
        }
    }    
