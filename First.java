import java.lang.*;

class PlusNos
{
	int a;
	int b;
	int c;

	PlusNos(int a,int b)
	{
		this.a=a;
		this.b=b;

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
public class First
{
	public static void main(String args[])
    {
   PlusNos obj = new PlusNos(10,40);
   obj.add();
   obj.display();
    }
}
