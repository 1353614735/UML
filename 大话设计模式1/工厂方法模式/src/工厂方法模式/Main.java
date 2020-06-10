package ��������ģʽ;

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
	            System.out.println("�����:" + result);  
	        }  
	        catch (Exception e)  
	        {  
	            e.printStackTrace();  
	        }  
	    }
}
