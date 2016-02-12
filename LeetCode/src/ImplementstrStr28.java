
public class ImplementstrStr28 {
	
	public int strStr(String haystack, String needle) {
        
		return haystack.indexOf(needle);
    }
	
	public static void main(String[] args) {
		String h = "";
		String n = "a";
		System.out.println(new ImplementstrStr28().strStr(h, n));
	}

}
