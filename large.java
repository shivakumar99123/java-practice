import java.util.Scanner;
public class large {
    public static void main(String[] args){
        System.out.println("Enter the numbers");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){  
            System.out.println("largest number is"+a);
        }else if(b>a && b>c){   
            System.out.println("largest number is"+b);
        }else{
            System.out.println("largest number is"+c);

        }  
    }








    }
    

