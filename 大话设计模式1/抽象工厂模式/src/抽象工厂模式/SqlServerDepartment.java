package ���󹤳�ģʽ;

//SqlServerDepartment�࣬���ڷ���SQL Server��Department  
public class SqlServerDepartment implements IDepartment  
{  
  public void insert(Department department)  
  {  
      System.out.println("��SQL Server�и�Deaprtment������һ����¼");  
  }  

  public Department getDepartment(int id)  
  {  
      System.out.println("��SQL Server�и���ID�õ�Deaprtment��һ����¼");  
      return null;  
  }  
}  