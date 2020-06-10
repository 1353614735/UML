package 原型模式;

public class ConcretePrototype1 extends Prototype{
	public ConcretePrototype1(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	private String	id;

	public void Prototype(String id)
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
