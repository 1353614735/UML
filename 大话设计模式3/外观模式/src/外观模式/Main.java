package 外观模式;

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Facade facade = new Facade();
		
		facade.methodA();
		facade.methodB();
	}
}
