import java.util.Scanner;
public class Reverse_the_arrays {
    static void reverse(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        for(int i=0;i<arrlen;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
    }
}
