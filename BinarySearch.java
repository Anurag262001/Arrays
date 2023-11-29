class BinarySearch{
    public static void main(String[] args) {
        int arr[] = {3,2,3,523,445,34,24,43,65,76,86,543432,344,6,565,78,2};
        int num = 98;
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
             }
        }
    }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        int l=0;
        int h=arr.length-1;
        int mid=(l+h)/2;
        while(l<=h){
            if(num==arr[mid]){
                System.out.println("found at"+mid);
                break;
            }else if(num>arr[mid]){
                l=mid+1;
            }else if(num<arr[mid]){
                h=mid-1;
            }
            mid=(l+h)/2;
        }
    if(l>h){
        System.out.println("not found");
    }
    }    
}