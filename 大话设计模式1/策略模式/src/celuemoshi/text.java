package celuemoshi;

public class text {
	//Strategy�࣬��������֧�ֵ��㷨�Ĺ����ӿ�
	public interface Strategy
	{
		public void algorithmInterface();
	}
	//ConcreteStrategy��װ�˾�����㷨����Ϊ���̳���Strategy
	public class ConcreteStrategyA implements Strategy
	{
		public void algorithmInterface()
		{
			System.out.println("�㷨Aʵ��");
		}
	}
	public class ConcreteStrategyB implements Strategy
	{
		public void algorithmInterface()
		{
			System.out.println("�㷨Aʵ��");
		}
	}
	public class ConcreteStrategyC implements Strategy
	{
		public void algorithmInterface()
		{
			System.out.println("�㷨Cʵ��");
		}
	}
	//Context��һ��ConcreteStrategy�����ã�ά��һ����Strategy���������
	public class Context
	{
		private Strategy	strategy;

		public Context(Strategy strategy)
		{
			this.strategy = strategy;
		}

		public void contextInterface()
		{
			strategy.algorithmInterface();
		}
	}
	//�ͻ��˴���
	public class Main
	{
		public void main(String[] args)
		{
			Context context;
			context = new Context(new ConcreteStrategyA());
			context.contextInterface();
			
			context = new Context(new ConcreteStrategyB());
			context.contextInterface();
			
			context = new Context(new ConcreteStrategyC());
			context.contextInterface();
		}
	}
}
