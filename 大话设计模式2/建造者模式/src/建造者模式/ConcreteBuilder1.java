package ������ģʽ;

//ConcreteBuilder1�ࡪ���彨������
public class ConcreteBuilder1 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("����A");
	}

	public void buildPartB()
	{
		product.add("����B");
	}

	public Product getResult()
	{
		return product;
	}

}