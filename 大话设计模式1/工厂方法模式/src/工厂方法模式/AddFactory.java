package 工厂方法模式;

import java.rmi.server.Operation;

public class AddFactory  implements IFactory{

	 public Operation createOperation()  
	    {  
	        return new OperationAdd(null);  
	    }  
 
	public class SubFactory implements IFactory  
	{  
	    public Operation createOperation()  
	    {  
	        return new OperationSub(null);  
	    }  
	}  
	public class MulFactory implements IFactory  
	{  
	    public Operation createOperation()  
	    {  
	        return new OperationMul(null);  
	    }  
	}  
	public class DivFactory implements IFactory  
	{  
	    public Operation createOperation()  
	    {  
	        return new OperationDiv(null);  
	    }
	}
	
	}

