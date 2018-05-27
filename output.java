import java.lang.*;
class A
       {
        int a,b,c;

        A()
        {
         a=10;
         b=20;
        }
        void add()
        {
        c=a+b;
        }
        void display()
        {
         System.out.println("sum is "+c);
         }
         }
class B extends A
       {
        B()
        {
        super();
        }
        @Override
        void add()
        {
        super.add();
        }
        @Override
        void display()
        {
        super.display();
        }
              }
  class output
  {
   public static void main(String args[])
   {
   B obj=new B();
   obj.add();
   obj.display();
   }
   }
