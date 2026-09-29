public class arrays{
    public static void main(String[] args){
        int[] arr={1,3,5,7,8,9};
        int key=13;
         int result=search(arr,key);
        System.out.print(result);

    }
    static int search(int[] arr,int key){
        int low=0,high=arr.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

            
        }
        
        return -1;
       
    }

}