import java.util.Scanner;
public class Max_Min_element_in_array {
    static void max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max is"+max);
    }
    static void min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min is" + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array");
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arrlen;i++){
            arr[i]=sc.nextInt();
        }
        max(arr);
        min(arr);
    }
}
