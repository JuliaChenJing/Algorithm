import java.util.HashMap;

public class RemoveDuplicateChar {


    public static String removeDuplicateChar(String s) 
    {
    	if(s==null||s.length()==0)
    	return null;
    	StringBuffer re=new StringBuffer ();
    	
    	HashMap <Character, Integer> map=new HashMap<Character, Integer>();
    	for(int i=0;i<s.length();i++)
    	{
    		if(map.containsKey(s.charAt(i)))
    			;
    		else	
    		{
    			map.put(s.charAt(i), 0);
    			re.append(s.charAt(i));
    		}
    	}
    
    	return re.toString();
    		
  }
    
    public static void main(String []args)
    {
    	System.out.println( removeDuplicateChar("apple "));
    	System.out.println( removeDuplicateChar("banana"));
    	System.out.println( removeDuplicateChar(""));
    	System.out.println( removeDuplicateChar(null));
    	
    }
	
}

 /*
aple 
ban
null
null
  */

