package routines;
import java.util.*;
/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */
public class EnitityFileRuleParamID {



	
	
	
	public static String fileRuleParam(String str1,String str2,String str3)
	{
		List<String> li=new ArrayList<String>();
		String s=null;
		li.add(str1);
		li.add(str2);
		li.add(str3);
		int[] myarr=arr(li) ;
		//switch(int a)
		for(int i=0;i<li.size();i++)
		{
			s=":"+myarr[1]+":"+":"+myarr[2]+":"+":"+myarr[3]+":";
		
	
	}
		return s;
	}
	public static int[] arr(List refli)
	{
	int[] arr=new int[10];
	for(int i=1;i<=refli.size();i++)
	{arr[i]=i;
	}
	return arr;
	}
}
