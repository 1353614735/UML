package ������ģʽ;

import java.awt.Graphics;

//���˵ĳ�����
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
