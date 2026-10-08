class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < strs[0].length(); i++) {
            for (String str : strs) {
                if (i == str.length() || (str.charAt(i) != strs[0].charAt(i))) {
                    return result.toString();
                }
            }

            result.append(strs[0].charAt(i));
        }

        return result.toString();
    }
}