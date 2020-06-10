package 一步到位;

public class Person {
	  private String name;
	    
	    public void wearTshirts(){
	        System.out.println("穿T恤");
	    }
	    
	    public void wearBigTrouser(){
	        System.out.println("穿垮裤");
	    }
	    
	    public void wearSneakers(){
	        System.out.println("穿破球鞋");
	    }
	    
	    public void wearSuit(){
	        System.out.println("穿西装");
	    }
	    
	    public void wearTie(){
	        System.out.println("系领带");
	    }
	    
	    public void wearLeatherShoes(){
	        System.out.println("穿皮鞋");
	    }

	    public String getName() {
	        return name;
	    }


	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public static void main1(String[] args) {
	        Person person = new Person();
	        person.setName("小菜");
	        
	        //第一种服饰搭配
	        person.wearSuit();
	        person.wearTie();
	        person.wearLeatherShoes();
	        
	        //第二种服饰搭配
	        person.wearBigTrouser();
	        person.wearTshirts();
	        person.wearSneakers();
	    }
	    public static void main(String[] args) {
	        Person person = new Person();
	        person.setName("小菜");
	        
	        //第一种服饰搭配
	        System.out.println("第一种服饰搭配");
	        person.wearSuit();
	        person.wearTie();
	        person.wearLeatherShoes();
	        
	        //第二种服饰搭配
	        System.out.println("\n\n第二种服饰搭配");
	        person.wearBigTrouser();
	        person.wearTshirts();
	        person.wearSneakers();
	    }
}
