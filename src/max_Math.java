public class max_Math  {
    public static  void main(String[] args)
    {
        char a='a';
        char b='b';
        System.out.println(Math.max(a,b));
        System.out.println(factorial(10));
        System.out.println(factorial1(10));
    }
    public static long factorial(int n)
    {
        if(n==0) {return 1;}
        else{
            return n*factorial(n-1);

        }
    }
    public static long factorial1(int n)
    {
        long result =1;
        for(int i=1;i<=n;i++)
        {
            result=result*i;

        }
        return result;
    }

}
