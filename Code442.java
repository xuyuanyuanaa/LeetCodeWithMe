import java.util.ArrayList;
import java.util.List;

public class Code442 {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> list = findDuplicates(nums);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
        	int before = Math.abs(nums[i]);
        	int after = nums[before - 1];
            if(after < 0){
                list.add(before);
            }else {
            	//不能使用after，使用after数组里的数据并没有记录该位为负数
            	//after = - after;
            	nums[before - 1] = - after;
            }
            
        }
        return list;
    }
}
