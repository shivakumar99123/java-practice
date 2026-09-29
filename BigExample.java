import java.io.*;
public class BigExample{
    public static void main(String[] args)throws IOException{
    DataInputStream dis=new DataInputStream(System.in);
    System.out.println("Enter the numbers");
     int a=Integer.parseInt(dis.readLine());
     int b=Integer.parseInt(dis.readLine());
     int c=Integer.parseInt(dis.readLine());
     int big=(a>b)?((a>c)?a:c):((b>c)?b:c);
     System.out.println("the biggest element is"+big);

}
}