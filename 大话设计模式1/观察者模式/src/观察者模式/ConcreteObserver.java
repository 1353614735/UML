package 观察者模式;

/*//ConcreteObserver类，具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。
具体观察者角色可以保存一个指向具体主题对象的引用。具体观察者角色通常用一个具体子类实现。  */
public class ConcreteObserver extends Observer  
{  
  private String          name;  
  private String          observerState;  
  private ConcreteSubject subject;  

  public ConcreteObserver(String name, ConcreteSubject subject)  
  {  
      this.name = name;  
      this.subject = subject;  
  }  

  public void update()  
  {  
      observerState = subject.getSubjectState();  
      System.out.println("观察者" + name + "的新状态是" + observerState);  
  }  

  public ConcreteSubject getSubject()  
  {  
      return subject;  
  }  

  public void setSubject(ConcreteSubject subject)  
  {  
      this.subject = subject;  
  }  
}  