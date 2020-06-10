package 建造者模式;

import java.awt.Graphics;

//画人的抽象类
public abstract class PersonBuilder
{
	protected Graphics	g;

	public PersonBuilder(Graphics g)
	{
		this.g = g;
	}

	public abstract void buildHead();

	public abstract void buildBody();

	public abstract void buildArmLeft();

	public abstract void buildArmRight();

	public abstract void buildLegLeft();

	public abstract void buildLegRight();
}
