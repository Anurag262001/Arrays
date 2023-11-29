import java.lang.reflect.Array;
import java.util.Arrays;

class TwoArraysContainSameElement{
    public static void main(String[] args) {
        int arr1[] = {2,3,1,4};
        int arr2[] = {4,3,1,2};
        boolean arrequals = arr1.length==arr2.length;
        if(arrequals){
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    arrequals=false;
                    break;
                }
            }
        }
        if(arrequals){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        }
    }    
