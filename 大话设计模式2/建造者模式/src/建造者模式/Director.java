package 建造者模式;

//Director类—指挥类
public class Director
{
	public void construct(Builder builder)
	{
		builder.buildPartA();
		builder.buildPartB();
	}
}