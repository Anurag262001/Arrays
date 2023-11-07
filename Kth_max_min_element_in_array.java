import java.util.Scanner;
public class Kth_max_min_element_in_array {
    static void kthmaxmin(int arr[], int kthnumber,int arrlen){
        int num = kthnumber;
        System.out.println("kth min" + arr[num-1]);
        System.out.println("max is" + arr[arrlen-num]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int arrlen = sc.nextInt();
        int arr[] = new int[arrlen];
        System.out.println("enter the element");
        for(int i=0;i<arrlen;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
       
       
        for(int i=0;i<arrlen;i++){
            for(int j=0;j<arrlen-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arrlen;i++){
            System.out.println(arr[i]);
        }
         System.out.println("enter the kth max and min element you want");
          int kthnumber = sc.nextInt();
        kthmaxmin(arr, kthnumber, arrlen);
    }
}
