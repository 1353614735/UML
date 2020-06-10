package ���󹤳�ģʽ;

//AccessFactory�࣬ʵ��IFactory�ӿڣ�ʵ����AccessUser��AccessDepartment  
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
