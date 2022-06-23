public class day2022_6_30 {

//    public static  final double E=2.718281828;
//    public static final double PI=3.14159;

//    public  static void main(String[] args){
//        Point p=new Point();
//        p.x=2;
//        p.y=3;
//        System.out.println(p.distance());
//    }
    public static void main(String[] args){
        Point p=new Point();
        p.setX(2);
        p.setY(3);
        System.out.println(p.distance());
    }


}
//class Point{
//    public int x;
//    public int y;
//    public double distance(){
//        return Math.sqrt(x*x+y*y);
//    }
//}

class Point
{
    private int x;
    private int y;
    public void setX(int x)
    {
        this.x=x;

    }
    public void setY(int y)
    {
        this.y=y;
    }
    public int getX()
    {
        return x;

    }
    public int getY()
    {
        return y;
    }
    public double distance()
    {
        return Math.sqrt(x*x+y*y);
    }
}

