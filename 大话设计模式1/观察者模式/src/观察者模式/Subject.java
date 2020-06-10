package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/*//Subject类，可翻译为主题或抽象通知者，一般用一个抽象类或一个接口实现。
它把所有对观察者对象的引用保存在一个聚集里面，每个主题都可以有任何数量的观察者。
抽象主题提供一个接口，可以拉回和删除观察者对象。  */
public abstract class Subject  
{  
  private List<Observer>    observers   = new ArrayList<Observer>();  

  public void attach(Observer observer)  
  {  
      observers.add(observer);  
  }  

  public void detach(Observer observer)  
  {  
      observers.remove(observer);  
  }  

  public void announce()  
  {  
      for (Observer obj : observers)  
      {  
          obj.update();  
      }  
  }  
}  