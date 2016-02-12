
public class RemoveDuplicatesfromSortedArray26 {
	
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		int before = 0;
		int end = 1;
		int duplicate = 0;
		while(end <= (nums.length - 1)) {
			if(nums[end] == nums[before]) {
				duplicate++;
				end++;
				if(end > nums.length - 1) {
					break;
				} else {
					nums[end - duplicate] = nums[end];
				}
			} else {
				nums[end - duplicate] = nums[end];
				end++;
				before++;
			}
		}
        return nums.length - duplicate;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,3};
		System.out.println(new RemoveDuplicatesfromSortedArray26().removeDuplicates(nums));
	}

}
