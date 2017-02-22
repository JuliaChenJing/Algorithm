import java.util.HashMap;

public class BinarySearch {


    public static boolean allUniqueChar(String s) 
    {
    	if(s==null||s.length()==0)
    	return true;
    	
    		
    	HashMap <Character, Integer> map=new HashMap<Character, Integer>();
    	for(int i=0;i<s.length();i++)
    	{
    		if(map.containsKey(s.charAt(i)))
    			return false;
    		else	
    		
    			map.put(s.charAt(i), 0);
    	}
    		return true;
    	
  }
    
    public static void main(String []args)
    {
    	System.out.println(allUniqueChar("apple"));
    	System.out.println(allUniqueChar("aple"));
    	
    }
	
}

 /*
false
true
  */
