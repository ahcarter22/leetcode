// initialize index to 0, which represents the current position for the next non-target elemet
// iterate through each element of the element of the input array using the i pointer
// for each element nums[i], check if it is equal to the target value
// if it is not equal to the target value, then move it to the index position
// so we assign nums[index] = nums[i]
//
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums [index] = nums [i];
                index++;
            }
        }
        return index;
    }
}
