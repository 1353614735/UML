package celuemoshi;

public class text {
	//Strategy类，定义所有支持的算法的公共接口
	public interface Strategy
	{
		public void algorithmInterface();
	}
	//ConcreteStrategy封装了具体的算法或行为，继承于Strategy
	public class ConcreteStrategyA implements Strategy
	{
		public void algorithmInterface()
		{
			System.out.println("算法A实现");
		}
	}
	public class ConcreteStrategyB implements Strategy
	{
		public void algorithmInterface()
		{
			System.out.println("算法A实现");
		}
	}
	public class ConcreteStrategyC implements Strategy
	{
		public void algorithmInterface()
		{
			System.out.println("算法C实现");
		}
	}
	//Context用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
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
	//客户端代码
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
