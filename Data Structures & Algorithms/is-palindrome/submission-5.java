class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !isValid(s.charAt(left))) {
                left++;
            }

            while (right > left && !isValid(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    public boolean isValid(char c) {
        return String.valueOf(c).matches("^[a-zA-Z0-9]+$");
    }
}
