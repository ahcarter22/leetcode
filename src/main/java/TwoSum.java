import java.util.HashMap;
import java.util.Map;


// given an array of integers `nums` and integer `target`,
// return indices of the two numbers such that they add up to `target`
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // this is the result array which stores indices of two numbers
        int [] result = new int [2];
        // map to store number and its indices
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            // put number and indices into hashmap
            map.put(nums[i], i);
        }
        // iterate through the array//
        for (int i=0; i<nums.length; i++){
            // check diff = target - nums[i] is in the map and the index of diff is not equal to i
            if(map.containsKey(target-nums [i]) && map.get(target-nums [i]) !=i){
                // get the index of target_x
                int index = map.get(target-nums[i]);
                // store index (input_y)
                result[0] = i;
                // store index (input_x)
                result[1] = index;
                break;
            }
        }
        return result;

    }
}