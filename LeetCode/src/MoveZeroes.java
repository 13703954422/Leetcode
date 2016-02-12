



public class MoveZeroes {

	 public void moveZeroes(int[] nums) {
	        int zeroNum = 0 , start = 0;
	        int len = nums.length;
	      
	   while(start != (len - 1) ) {
		   
		   		if(zeroNum < len ) {
		   			while(nums[zeroNum] == 0) {
						   zeroNum++;
						   if(zeroNum == len)
							   break;
					   }  
		   		}
			   
		   if(zeroNum < len) {
			   int temp = nums[zeroNum];
			   nums[zeroNum] = nums[start];
			   nums[start] = temp;
			   
		   }
		   start++;
		   if(start > zeroNum)
			   zeroNum = start;
		   
	   }
	    
	   		
	   
	 }
	 
	 public static void main(String[] args) {
		// int nums[] = {1,0,0};
		 //int nums[] = {0, 1, 0, 3, 12};
		// int nums[] = {0,1,0};
		 int nums[] = {0,0};
		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
