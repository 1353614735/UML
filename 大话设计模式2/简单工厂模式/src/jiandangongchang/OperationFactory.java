package jiandangongchang;

import java.rmi.server.Operation;

public class OperationFactory
{
	public static OperationAdd createOperation(String operate)
	{
		OperationAdd oper = null;

		if ("+".equals(operate))
			oper = new OperationAdd();
//		else if ("-".equals(operate))
//	 	    //oper = new OperationSub();
//		else if ("*".equals(operate))
//			//oper = new OperationMul();
//		else if ("/".equals(operate))
//			//oper = new OperationDiv();

		return oper;
	}
}