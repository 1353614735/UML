package ������ģʽ;

//ConcreteBuilder2�ࡪ���彨������
public class ConcreteBuilder2 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("����X");
	}

	public void buildPartB()
	{
		product.add("����Y");
	}

	public Product getResult()
	{
		return product;
	}

}