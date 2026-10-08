class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character letter : s.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (Character letter : t.toCharArray()) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) - 1);
            } else {
                map.put(letter, 1);
            }
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}