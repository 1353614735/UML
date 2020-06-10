package ������ģʽ;

/*���˻�߸�����ʵ���������ƵĴ���ȥʵ�������Ϳ����ˣ��ڿͻ��˵���ʱ��
������Ҫ֪��ͷ���ֽ���Щ���������Ի�ȱ�ٽ�����ģʽ��һ������Ҫ���ָ࣬���ߣ�Director����
���������ƽ�����̣�Ҳ�����������û��뽨����̵Ĺ�����*/
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

