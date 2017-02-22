import java.util.HashMap;

public class RemoveDuplicateChar {


	 public static char [] removeDuplicateChar(char[] str)
	 {
		 if (str == null) return str;
		 int len = str.length;
		 if (len < 2) return str;

		int  tail = 1;
		

		for (int i = 1; i < len; ++i) 
		{
			int j;
		 
			for (j = 0; j < tail; ++j) 
			{
				if (str[i] == str[j]) break;//same char
			}
		 
			if (j == tail) 
			{
				str[tail] = str[i];
		 
				++tail;
			}
		}
		//str[tail] = 0;
		return str;
	 }
    
    public static void main(String []args)
    {
    	char [] str1={'a','a','a'};
    	char [] str2={'a','b'};
    	char [] str3=null;
    	char [] str4={'a','a','b','b'};
    	System.out.println( removeDuplicateChar(str1));
    	System.out.println( removeDuplicateChar(str2));
    	System.out.println( removeDuplicateChar(str3));
    	System.out.println( removeDuplicateChar(str4));
    	
    	
    }
	
}

 /*
import java.util.HashMap;

public class RemoveDuplicateChar {


	 public static char [] removeDuplicateChar(char[] str)
	 {
		 if (str == null) return str;
		 int len = str.length;
		 if (len < 2) return str;

		int  tail = 1;
		

		for (int i = 1; i < len; ++i) 
		{
			int j;
		 
			for (j = 0; j < tail; ++j) 
			{
				if (str[i] == str[j]) break;//same char
			}
		 
			if (j == tail) 
			{
				str[tail] = str[i];
		 
				++tail;
			}
		}
		str[tail] = 0;
		return str;
	 }
    
    public static void main(String []args)
    {
    	char [] str1={'a','a','a'};
    	char [] str2={'a','b'};
    	char [] str3=null;
    	char [] str4={'a','a','b','b'};
    	System.out.println( removeDuplicateChar(str1));
    	System.out.println( removeDuplicateChar(str2));
    	System.out.println( removeDuplicateChar(str3));
    	System.out.println( removeDuplicateChar(str4));
    	
    	
    }
	
}

 /*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at RemoveDuplicateChar.removeDuplicateChar(RemoveDuplicateChar.java:31)
	at RemoveDuplicateChar.main(RemoveDuplicateChar.java:42)

  */


  */

