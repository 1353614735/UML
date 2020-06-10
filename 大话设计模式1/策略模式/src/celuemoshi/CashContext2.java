package celuemoshi;

//改造后的CashContext
public class CashContext2
{
	CashSuper	cashSuper;

	public CashContext2(CashSuper cashSuper)
	{
		this.cashSuper = cashSuper;
	}
	
	public CashContext2(String type)
	{
		if ("正常收费".equals(type))
		{
			cashSuper = new CashNormal();
		}
		else if ("满300返100".equals(type))
		{
			cashSuper = new CashReturn();
		}
		else if ("打8折".equals(type))
		{
			cashSuper = new CashRebate();
		}
	}

	public double acceptCash(double money)
	{
		return cashSuper.acceptCash(money);
	}
}
//客户端代码
public class Main
{
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("正常收费", 1, 1000);
		consume("满300返100", 1, 1000);
		consume("打8折", 1, 1000);

		System.out.println("总计:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashContext2 cashContext = new CashContext2(type);

		double totalPrices = cashContext.acceptCash(num * price);
		total += totalPrices;

		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}
}
