package 建造者模式;

//ConcreteBuilder2类—具体建造者类
public class ConcreteBuilder2 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("部件X");
	}

	public void buildPartB()
	{
		product.add("部件Y");
	}

	public Product getResult()
	{
		return product;
	}

}