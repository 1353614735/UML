package 代理模式;

public class Proxy extends SendGift{
	 private Pursuit pu;
	    
	    public Proxy(SchoolGril sg){
	        pu = new Pursuit(sg);
	    }
	    
	    public void sendDolls() {
	        pu.sendDolls();
	    }

	    @Override
	    public void sendChocolate() {
	        pu.sendChocolate();
	    }

	    @Override
	    public void sendFlower() {
	        pu.sendFllower();
	    }
}
