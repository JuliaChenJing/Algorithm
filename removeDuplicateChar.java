import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	 public static String removeDuplicateChar_HashSet(String str)
	 {
		 if (str == null) return str;
		 int len = str.length();
		 if (len < 2) return str;

		 char[] chars = str.toCharArray();
		 Set<Character> re = new HashSet<>();
		 int l = 0;
		 for (char c : chars)
		     if (re.add(c))
		         chars[l++] = c;
		 return new String(chars, 0, l);
	 }
	 
	 public static String removeDuplicateChar_HashMap(String s) 
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
    	
    	System.out.println("hashset:-----------");
    	System.out.println(removeDuplicateChar_HashSet("apple") );
    	System.out.println(removeDuplicateChar_HashSet("aaabbb" ));
    	System.out.println(removeDuplicateChar_HashSet("") );
    	System.out.println(removeDuplicateChar_HashSet(null) );
    	System.out.println();
    	
    	System.out.println("hashmap:------------");
    	System.out.println( removeDuplicateChar_HashMap("apple "));
    	System.out.println( removeDuplicateChar_HashMap("aaabbb"));
    	System.out.println( removeDuplicateChar_HashMap(""));
    	System.out.println( removeDuplicateChar_HashMap(null));
    	
    }
	
}

 /*
hashset:-----------
aple
ab

null

hashmap:------------
aple 
ab
null
null
  */

