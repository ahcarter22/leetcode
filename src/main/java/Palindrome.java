
// given an integer x, return true if x is a palindrome, and false otherwise
public class Palindrome {
    // method checks iff the given integer x is a palindrome
    public boolean isPalindrome(int x) {
        // convert the integer x to a string representation
        String str = String.valueOf(x);
        // create a new StringBuilder object and reverse the string
        // reverse the string representation of x and convert it back to the original string
        String reverse = new StringBuilder(str).reverse().toString();

        return str.equals(reverse);
        }
    }

// the time complexity of this solution is O(n) where n is the number of digits in the integer x