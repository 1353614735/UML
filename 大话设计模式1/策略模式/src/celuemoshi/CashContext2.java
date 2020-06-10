package celuemoshi;

//������CashContext
public class CashContext2
{
	CashSuper	cashSuper;

	public CashContext2(CashSuper cashSuper)
	{
		this.cashSuper = cashSuper;
	}
	
	public CashContext2(String type)
	{
		if ("�����շ�".equals(type))
		{
			cashSuper = new CashNormal();
		}
		else if ("��300��100".equals(type))
		{
			cashSuper = new CashReturn();
		}
		else if ("��8��".equals(type))
		{
			cashSuper = new CashRebate();
		}
	}

	public double acceptCash(double money)
	{
		return cashSuper.acceptCash(money);
	}
}
//�ͻ��˴���
public class Main
{
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("�����շ�", 1, 1000);
		consume("��300��100", 1, 1000);
		consume("��8��", 1, 1000);

		System.out.println("�ܼ�:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashContext2 cashContext = new CashContext2(type);

		double totalPrices = cashContext.acceptCash(num * price);
		total += totalPrices;

		System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);
	}
}
