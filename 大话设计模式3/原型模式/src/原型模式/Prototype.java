package 原型模式;

public class Prototype implements Cloneable{
	private String	id;

	public Prototype(String id)
	{
		this.id = id;
	}

	public String getId()
	{
		return this.id;
	}

	public Prototype clonePrototype()
	{
		return null;
	}
}

