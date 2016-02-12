
public class RemoveElement27 {
	
	public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
        	return 0;
        int mark = 0;
        for(int i = 0 ; i < nums.length ; i++ ) {
        	if(nums[i] == val) {
        		mark++;
        	} else {
        		nums[i - mark] = nums[i];
        	}
        }
        return nums.length - mark;
    }

}
