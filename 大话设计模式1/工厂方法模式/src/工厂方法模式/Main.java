package 工厂方法模式;

import java.rmi.server.Operation;

public class Main {
	 public static void main(String[] args)  
	    {  
	        IFactory operFactory = new AddFactory();  
	        Operation oper = operFactory.createOperation();  
	  
	        ((Object) oper).setNumberA(1);  
	        ((Object) oper).setNumberB(2);  
	  
	        try  
	        {  
	            double result = ((Object) oper).getResult();  
	            System.out.println("结果是:" + result);  
	        }  
	        catch (Exception e)  
	        {  
	            e.printStackTrace();  
	        }  
	    }
}
