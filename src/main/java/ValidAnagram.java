public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int [] count = new int [26];

        // count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x -'a']++;
        }

        //decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
    }
