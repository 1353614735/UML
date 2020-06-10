package 建造者模式;

/*胖人或高个子其实都是用类似的代码去实现这个类就可以了，在客户端调用时，
还是需要知道头身手脚这些方法，所以还缺少建造者模式中一个很重要的类，指挥者（Director），
用它来控制建造过程，也用它来隔离用户与建造过程的关联。*/
public class PersonDirector
{
	private PersonBuilder	pb;

	public PersonDirector(PersonBuilder pb)
	{
		this.pb = pb;
	}

	public void createPerson()
	{
		pb.buildHead();
		pb.buildBody();
		pb.buildArmLeft();
		pb.buildArmRight();
		pb.buildLegLeft();
		pb.buildLegRight();
	}
}

