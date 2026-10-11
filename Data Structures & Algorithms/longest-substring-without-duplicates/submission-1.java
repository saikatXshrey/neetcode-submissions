class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> window = new HashSet<>();

        for (int low = 0, high = 0; high < s.length(); high++) {
            if (window.contains(s.charAt(high))) {
                while (window.contains(s.charAt(high))) {
                    window.remove(s.charAt(low));
                    low ++;
                }
            }
            
            window.add(s.charAt(high));
            res = Math.max(res, window.size());
        }

        return res;
    }
}
