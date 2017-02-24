public class ReplaceSpace {
	
	public static String replaceSpace(String s) {
		
		if((s!=null &&s.length()==0 )|| s==null)
			return s;
		StringBuffer re=new StringBuffer();
		
		for(int i=0;i<s.length();i++)
			
			if(s.charAt(i)==' ')
				re.append("%20");
			
			else
				re.append(s.charAt(i));
		
		return re.toString();
	}
	public static void main(String[] args) {

		
		System.out.println(replaceSpace("ab"));
		System.out.println(replaceSpace(""));
		System.out.println(replaceSpace("  "));
		System.out.println(replaceSpace("a b"));
		System.out.println(replaceSpace(null));
	}
}

/*
ab

%20%20
a%20b
null
 */
