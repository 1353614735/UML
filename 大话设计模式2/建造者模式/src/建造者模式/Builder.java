package ������ģʽ;

//Builder�ࡪ���������࣬ȷ����Ʒ����������PartA��PartB��ɣ�������һ���õ���Ʒ��������ķ���getResult
public abstract class Builder
{
	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract Product getResult();
}