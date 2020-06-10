package jiandangongchang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.server.Operation;

public class Main
{
	public static void main(String[] args)
	{
		InputStreamReader stdin = null;
		BufferedReader buffer = null;

		stdin = new InputStreamReader(System.in);
		buffer = new BufferedReader(stdin);

		try
		{
			System.out.print("����������A:");
			double numberA = Double.parseDouble(buffer.readLine());
			System.out.print("��ѡ�������(+��-��*��/):");
			String operator = buffer.readLine();
			System.out.print("����������B:");
			double numberB = Double.parseDouble(buffer.readLine());

			OperationAdd oper = OperationFactory.createOperation(operator);
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			System.out.println("�����:" + oper.getResult());
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}