class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> frequency = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {
            Map<Character, Integer> map = new HashMap<>();

            for (char letter : str.toCharArray()) {
                map.put(letter, map.getOrDefault(letter, 0) + 1);
            }

            if (!frequency.containsKey(map)) {
                frequency.put(map, new ArrayList());
            }

            frequency.get(map).add(str);
        }

        for (List<String> values : frequency.values()) {
            result.add(values);
        }

        return result;
    }
}