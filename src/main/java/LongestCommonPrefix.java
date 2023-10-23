import java.util.Arrays;
// find the longest common prefix string amongst an array of strings

//approach
// sort the elements in the array to a string variable s1
// assign the first element of the sorted array to a string variable s1
// assign the last element of the sorted array to a string variable s2
// initialize an integer variable idx to )
// start a while loop that continues while idx is less than the length of s1 and s2
// within the while loop, check if the character at index idx of s1 is equal to the character at index idx of s2
// if the characters are not equal, exit the while loop
// return the substring of s1 that starts from the first character and ends at the idxth character
public class LongestCommonPrefix {
    public String longestCommonPrefix(String [] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()) {
            if(s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

}
