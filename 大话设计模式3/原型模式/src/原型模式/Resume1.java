package ԭ��ģʽ;

//������
public class Resume1 implements Cloneable
{
	private String			name;
	private String			sex;
	private String			age;
	private WorkExperience	work	= new WorkExperience();

	public Resume1(String name)
	{
		this.name = name;
	}

	public void setPersonalInfo(String sex, String age)
	{
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExperience(String workDate, String company)
	{
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	public void display()
	{
		System.out.println(name + "		" + sex + "		" + age);
		System.out.println("����������" + work.getWorkDate() + "	"
				+ work.getCompany());
	}

	public Resume1 clone() throws CloneNotSupportedException
	{
		return (Resume1) super.clone();
	}
}
