package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

//Product�ࡪ��Ʒ�࣬�ɶ���������
public class Product
{
	List<String>	parts	= new ArrayList<String>();

	public void add(String part)
	{
		parts.add(part);
	}

	public void show()
	{
		System.out.println("��Ʒ ����----");
		
		for (String part : parts)
		{
			System.out.println(part);
		}
	}
}