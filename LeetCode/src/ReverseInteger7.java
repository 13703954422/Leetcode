

public class ReverseInteger7 {
	
	public int reverse(int x) {  //思路将int转化成为String 然后反转
		try {
			if(x == 0)
	        	return 0;
	        else {
	        	String s = x + "";
	        	char[] chars = s.toCharArray();
	        	if(x < 0) {
	        		reverse(chars, 1, chars.length - 1);
	        		return Integer.parseInt(new String(chars));
	        	} else {
	        		reverse(chars, 0, chars.length - 1);
	        		return Integer.parseInt(new String(chars));
	        	}
	        }
		} catch (NumberFormatException e) {
			return 0;
		}
			
        
    }
	
	/**反转*/
	private void reverse(char[] chars,int begin,int end) {
		while(begin < end) {
			char temp = chars[end];
			chars[end] = chars[begin];
			chars[begin] = temp;
			begin++;
			end--;
		}
	}
	
	
	public static void main(String[] args) {
//		int i = 9646324351;
//		System.out.println(new ReverseInteger7().reverse(i));
	}

}
