package 代理模式;
/**
 * 场景描述:

1. 卓贾易喜欢娇娇, 但是, 娇娇并不认识卓贾易, 那么他给娇娇送花, 送巧克力,送洋娃娃

2. 卓贾易也可以不这么做, 他喜欢娇娇, 找一个人, 让这个人吧鲜花, 巧克力和洋娃娃送给娇娇. 

这是两种方式, 但达到的目的是一样的。我们下面来看看这两个代码的实现:

第一种: 卓贾易喜欢娇娇, 那么他给娇娇送花, 送巧克力,送洋娃娃
 * @author Administrator
 *
 */
/*
 * 追求者
 */
public class Pursuit  extends SendGift{
	//追求的对象
    private SchoolGril sg;
    
    public Pursuit(SchoolGril sg){
        this.sg = sg;
    }
    
    // 行为: 给被追求者送花,送巧克力, 送洋娃娃
    public void sendFllower(){
        System.out.println(sg.getName() + " 送你鲜花");
    }
    
    public void sendDolls(){
        System.out.println(sg.getName() + " 送你洋娃娃");
    }
    
    public void sendChocolate(){
        System.out.println(sg.getName() + " 送你巧克力");
    }

	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		
	}
}












