package 原型模式;

public class Main1
{
	public static void main(String[] args)
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = a.clone();
		c.setPersonalInfo("男", "24");

		a.display();
		b.display();
		c.display();
	}
}
