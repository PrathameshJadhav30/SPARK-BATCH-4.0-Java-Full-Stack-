
import java.util.*;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0, count = t.length();

        while (right < s.length()) {
            char c = s.charAt(right++);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) count--;
                map.put(c, map.get(c) - 1);
            }

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char ch = s.charAt(left++);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) > 0) count++;
                }
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen));
    }
}
