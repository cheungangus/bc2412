public class Exercisefromleetcode {
  
}

/**
 * 
 * #3110
 * class Solution {
    public int scoreOfString(String s) {
        // for loop, when to stop, i and i+1
        // char vs int
        // Math.abs (not a must)
        int value = 0;
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            value = s.charAt(i) - s.charAt(i + 1);
            value = value < 0 ? value * -1 : value;
            sum += value;
            // if (value < 0) {
            //     value *= -1;
            // }
        }
        return sum;
    }
}
 * // 1684
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int failCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (!isAllowed(words[i], allowed)) {
                failCount++;
            }
        }
        return words.length - failCount;
    }

    // "ad" "ab"
    public static boolean isAllowed(String str, String allowed) {
        boolean found = false;
        for (int j = 0; j < str.length(); j++) {
            found = false;
            for (int k = 0; k < allowed.length(); k++) { // "ab"
                if (str.charAt(j) == allowed.charAt(k)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }
}
    // 1221
class Solution {
    public int balancedStringSplit(String s) {
        int rCount = 0, lCount = 0, balanced = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                rCount++;
            else
                lCount++;
            if (rCount == lCount) {
                balanced++;
                rCount = 0;
                lCount = 0;
            }
        }
        return balanced;
    }
}
 * 
 */