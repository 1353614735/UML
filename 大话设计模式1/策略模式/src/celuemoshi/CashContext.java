package celuemoshi;

//CashContext��
public class CashContext
{
	CashSuper	cashSuper;

	public CashContext(CashSuper cashSuper)
	{
		this.cashSuper = cashSuper;
	}

	public double acceptCash(double money)
	{
		return cashSuper.acceptCash(money);
	}
}
//�ͻ��˴���
public class Main{
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
		CashContext cashContext = null;

		if ("�����շ�".equals(type))
		{
			cashContext = new CashContext(new CashNormal());
		}
		else if ("��300��100".equals(type))
		{
			cashContext = new CashContext(new CashReturn());
		}
		else if ("��8��".equals(type))
		{
			cashContext = new CashContext(new CashRebate());
		}

		double totalPrices = cashContext.acceptCash(num * price);
		total += totalPrices;
		
		System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);
	}
}
