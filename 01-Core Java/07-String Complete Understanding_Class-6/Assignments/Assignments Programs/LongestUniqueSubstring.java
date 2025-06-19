import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int maxLen = 0, left = 0;
        String result = "";

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                result = s.substring(left, right + 1);
            }
        }
        System.out.println(result);
    }
}
