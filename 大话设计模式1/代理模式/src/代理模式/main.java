package 代理模式;

public class main {
	public static void main(String[] args) {
		   SchoolGril sg = new SchoolGril();
		   sg.setName("娇娇");
		        
		   Pursuit pursuit = new Pursuit(sg);
		        
		   pursuit.sendChocolate();
		   pursuit.sendDolls();
		   pursuit.sendFllower();
		}
}
