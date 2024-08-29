class a
{
     static int add(int a,int b)
     {
       return a+b;
     }
     static int add(int a,int b,int c)
     {
        return a+b+c;
     }
}
class t
{
      public static void main(String[]args)
      {
         System.out.println("Addition is: " + a.add(132,1));
         System.out.println("Addition is: " + a.add(135,2));
      }
}
