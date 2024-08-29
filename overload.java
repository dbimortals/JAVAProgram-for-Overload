class o
{
   int add(int a,int b)
   {
      int c;
      c=a+b;
      System.out.println("The sum is :" + c );
      return 0;
   }
   double add (double a,double b,double c)
   {
       double d;
       d = a+b+c;
       System.out.println("ADD: "+d);
       return 0;
   }
}
class ov
{
    public static void main(String[]args)
    {
       o a = new o();
       double res;
       int r;
       a.add(10,8);
       a.add(10.5,7.5,2);
       res =a.add(10.5,7.5,2);
        r = a.add(10,8);
    }
}
