package 用装饰模式写;


/**
 * 既然第一步是一个失败的设计: 那么如何优化呢?
 * 首先. 根据封闭开放原则. 抽象变化点. 各种服饰是变化点. 所以将其抽象出来. 
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
        System.out.println("装扮的" + this.getName());
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小菜");
        
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