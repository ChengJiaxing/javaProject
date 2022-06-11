import java.util.Scanner;

public class do_while {
   public static  void main(String[] args){
       Scanner reader=new Scanner(System.in);
       int password=6789;
       int num=0;
       do{
           System.out.println("please input password");
           num=reader.nextInt();
       }while(num!=password);
       System.out.println("correct");
       reader.close();
   }

}
