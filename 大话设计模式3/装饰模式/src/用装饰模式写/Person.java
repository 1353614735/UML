package ��װ��ģʽд;


/**
 * ��Ȼ��һ����һ��ʧ�ܵ����: ��ô����Ż���?
 * ����. ���ݷ�տ���ԭ��. ����仯��. ���ַ����Ǳ仯��. ���Խ���������. 
 *         
 * @author samsung
 *
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void show(){
        System.out.println("װ���" + this.getName());
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("С��");
        
        Clothes tShirts = new TShirts();
        Clothes bigTrouser = new BigTrouser();
        Clothes sneakers = new Sneakers();
        tShirts.show();
        bigTrouser.show();
        sneakers.show();
        person.show();
        
        
        Clothes suit = new Suit();
        Clothes tie = new Tie();
        Clothes leatherShoes = new LeatherShoes();
        
        suit.show();
        tie.show();
        leatherShoes.show();
        person.show();
        
    }
}