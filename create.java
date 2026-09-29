import java.util.Scanner;
public class create {
    public static void main(String[] arg){
        
        Scanner sc =new Scanner(System.in);
        System.out.print("enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the values");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
                
            }
        

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        

    }}

}
