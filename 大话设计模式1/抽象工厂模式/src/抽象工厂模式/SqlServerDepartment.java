package 抽象工厂模式;

//SqlServerDepartment类，用于访问SQL Server的Department  
public class SqlServerDepartment implements IDepartment  
{  
  public void insert(Department department)  
  {  
      System.out.println("在SQL Server中给Deaprtment表增加一条记录");  
  }  

  public Department getDepartment(int id)  
  {  
      System.out.println("在SQL Server中根据ID得到Deaprtment表一条记录");  
      return null;  
  }  
}  