import java.lang.reflect.Array;
import java.util.Arrays;

class MergeTwoArrays{
    public static void main(String[] args) {
    int arr1[] = {2,3,5,2};
    int arr2[] = {6,7,8,9};
    int mergearrlen = arr1.length+arr2.length;
    int mergearr[] = new int[mergearrlen];
    for(int i=0;i<arr1.length;i++){
        mergearr[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
        mergearr[arr1.length+i]=arr2[i];
    }
    for(int i=0;i<mergearrlen;i++){
        System.out.print(""+mergearr[i]);
    }
        }
    }    
