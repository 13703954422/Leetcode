
public class LongestCommonPrefix14 {
	
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
				return "";
		if(strs.length == 1)
			return strs[0];
		
		int longest = strs[0].length();    //最长字符串下标
		int mark = 0;
		for(int i = 0 ; i < strs.length ; i++) {
			if(longest < strs[i].length()) {
				longest = strs[i].length();
				mark = i;
			}
		}
		
		boolean b = true;
		int h = 0;
		for(int i = 0 ; i < longest ; i++) {
			char temp = strs[mark].charAt(i);
			for(int j = 0 ; j < strs.length ; j++) {
				try {
					char current = strs[j].charAt(i);
					if(current != temp) {
						h = i;
						b = false;
						break;
					}
						
				} catch(Exception e) {
					h = i;
					b = false;
					break;
				}
				
			}
			if(!b) 
				break;
		}
		if(b) 
			return strs[mark];
		return strs[mark].substring(0, h);
    }
	
	public static void main(String[] args) {
		String[] strs = {"abab","aba",""};
//		String[] strs = {"aa","ab"};
//		String[] strs = {"aa","aa"};
//		String[] strs = {"a","b"};
//		String[] strs = {"c","c"};
//		String[] strs = {"","c"};
//		String[] strs = {"c"};
		System.out.println(new LongestCommonPrefix14().longestCommonPrefix(strs));
	}
	

}
