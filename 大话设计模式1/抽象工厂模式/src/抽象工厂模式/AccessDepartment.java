package 抽象工厂模式;

//AccessDepartment类，用于访问Access的Department  
public class AccessDepartment implements IDepartment  
{  
  public void insert(Department department)  
  {  
      System.out.println("在Access中给Deaprtment表增加一条记录");  
  }  

  public Department getDepartment(int id)  
  {  
      System.out.println("在Access中根据ID得到Deaprtment表一条记录");  
      return null;  
  }  
}  