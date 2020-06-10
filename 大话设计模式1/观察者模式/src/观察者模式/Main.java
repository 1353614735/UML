package 观察者模式;

//客户端代码  
public class Main  
{  
  public static void main(String[] args)  
  {  
      ConcreteSubject s = new ConcreteSubject();  

      s.attach(new ConcreteObserver("X", s));  
      s.attach(new ConcreteObserver("Y", s));  
      s.attach(new ConcreteObserver("Z", s));  

      s.setSubjectState("ABC");  
      s.announce();  
  }  
} 
