package һ����λ;

public class Person {
	  private String name;
	    
	    public void wearTshirts(){
	        System.out.println("��T��");
	    }
	    
	    public void wearBigTrouser(){
	        System.out.println("�����");
	    }
	    
	    public void wearSneakers(){
	        System.out.println("������Ь");
	    }
	    
	    public void wearSuit(){
	        System.out.println("����װ");
	    }
	    
	    public void wearTie(){
	        System.out.println("ϵ���");
	    }
	    
	    public void wearLeatherShoes(){
	        System.out.println("��ƤЬ");
	    }

	    public String getName() {
	        return name;
	    }


	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public static void main1(String[] args) {
	        Person person = new Person();
	        person.setName("С��");
	        
	        //��һ�ַ��δ���
	        person.wearSuit();
	        person.wearTie();
	        person.wearLeatherShoes();
	        
	        //�ڶ��ַ��δ���
	        person.wearBigTrouser();
	        person.wearTshirts();
	        person.wearSneakers();
	    }
	    public static void main(String[] args) {
	        Person person = new Person();
	        person.setName("С��");
	        
	        //��һ�ַ��δ���
	        System.out.println("��һ�ַ��δ���");
	        person.wearSuit();
	        person.wearTie();
	        person.wearLeatherShoes();
	        
	        //�ڶ��ַ��δ���
	        System.out.println("\n\n�ڶ��ַ��δ���");
	        person.wearBigTrouser();
	        person.wearTshirts();
	        person.wearSneakers();
	    }
}
