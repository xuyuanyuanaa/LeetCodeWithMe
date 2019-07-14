
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num0015 {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
//		int[] nums1 = {1,-1,-1,0};
//		int[] nums2 = {0,0,0,0};
		List<List<Integer>> threeSum = threeSum(nums);
		for (List<Integer> list : threeSum) {
			System.out.println("res");
			for (Integer integer : list) {
				System.out.print(integer + ",");
			}
			System.out.println();
		}
	}
    public static List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> lists = new ArrayList<>();
    	
    	for(int i = 0; i < nums.length - 2 ;i ++) {
    		if (i > 0 && nums[i] == nums[i - 1]) continue;
    		int left = i + 1;
    		int right = nums.length - 1;
    		while(left < right) {
    			if(nums[right] > -nums[i] - nums[left]) {
    				while(left < right && nums[right] == nums[right - 1]) right --;
    				right --;
    			}else if (nums[right] < -nums[i] - nums[left]) {
    				while(left < right && nums[left] == nums[left + 1]) left ++;
    				left ++;
				}else {
					lists.add(Arrays.asList(nums[i],nums[right],nums[left]));
					while(left < right && nums[right] == nums[right - 1]) right --;
					while(left < right && nums[left] == nums[left + 1]) left ++;
					right --;
					left ++;
				}
    		}
    	}
    	
    	return lists;
    }
}
