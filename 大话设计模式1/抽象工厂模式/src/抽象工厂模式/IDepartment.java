package 抽象工厂模式;

//IDepartment接口，用于客户端访问，解除与具体数据库访问的耦合  
public interface IDepartment  
{  
  void insert(Department department);  

  Department getDepartment(int id);  
} 