package 抽象工厂模式;

//AccessFactory类，实现IFactory接口，实例化AccessUser和AccessDepartment  
public class AccessFactory implements IFactory  
{  
  public IUser createUser()  
  {  
      return new AccessUser();  
  }  

  public IDepartment createDepartment()  
  {  
      return new AccessDepartment();  
  }  
}  
