import java.lang.reflect.Array;
import java.util.Arrays;

class SumOfAllElementInArray{
    public static void main(String[] args) {
        int arr[] = {2,1,4,1,2};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
        }
    }    
