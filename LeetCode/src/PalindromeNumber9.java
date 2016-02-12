
public class PalindromeNumber9 {
	
	public boolean isPalindrome(int x) {
		
		String s = x + "";
		char[] chars = s.toCharArray();
		if(x < 0) {
			return false;
		} else {
			return check(chars, 0, chars.length - 1);
		}
    }
	
	public boolean check(char[] chars,int begin,int end) {
		while(begin < end) {
			if(chars[begin] != chars[end]) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int i = -2147447412;
		System.out.println(new PalindromeNumber9().isPalindrome(i));
	}
}
