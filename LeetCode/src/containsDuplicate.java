import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class containsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		
		if(nums.length <= 1)
			return false;
		Set<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		if(list.size() < nums.length)
			return true;
		else
			return false;
    }
	
	public static void main(String[] args) {
		containsDuplicate cd = new containsDuplicate();
		int nums[] = {3,3};
		 System.out.println(cd.containsDuplicate(nums));
	}

}
