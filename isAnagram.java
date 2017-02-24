import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {
		if (s1 == s2)
			return true;

		if (s1 != null &&s2!=null  && s1.length() != s2.length())
			return false;
		
		if (s1.length() != 0 && s2.length() != 0&& s1 != null &&s2!=null) 
		{
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < s1.length(); i++)
				if (!map.containsKey(s1.charAt(i)))
					map.put(s1.charAt(i), 1);

				else {
					int a = map.get(s1.charAt(i));
					map.put(s1.charAt(i), a + 1);

				}

			for (int j = 0; j < s1.length(); j++)
				if (!map.containsKey(s2.charAt(j)))
					return false;

				else {
					int b = map.get(s2.charAt(j));
					if (b <= 0)
						return false;
					else
						map.put(s2.charAt(j), b - 1);
				}

			for (Integer value : map.values()) {
				if (value != 0)
					return false;

			}

		}
		return true;

	}

	public static void main(String[] args) {

		System.out.println(isAnagram("apple", "apple"));
		System.out.println(isAnagram("apble", "apple"));
		System.out.println(isAnagram("aaabbb", "ab"));
		System.out.println(isAnagram("aaabbb", "abaaa"));
		System.out.println(isAnagram("", ""));
		System.out.println(isAnagram(null, null));
	//	System.out.println(isAnagram(null, ""));
	//	System.out.println(isAnagram(null, "ab"));

	}

}

/*
true
false
false
false
true
true

 */
