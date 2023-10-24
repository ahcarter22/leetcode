
// approach using Moore's voting algorithm based on the fact that if there is a majority element in an array,
// it will always remain in the lead, even after encountering a non-majority element

public class MajorityElement {
    public int majorityElement( int [] nums) {
        int count = 0;
        int candidate = 0;

        for (int num: nums) {
            if(count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}

// sorting approach suggesting if an element occurs more than n/2 times in the array (where n is the size of the array),
// it will always occupy the middle position when the array is sorted. This approach is not as efficient as the Moore's voting algorithm

//class Solution {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }
//}


