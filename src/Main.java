import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner reader=new Scanner(System.in);
         System.out.println("please input password");
         int num=reader.nextInt();
         int password=6789;
         while(num!=password){
             System.out.println("please input passowrd");
             num=reader.nextInt();
         }
         System.out.print("correct");
         reader.close();
    }
}