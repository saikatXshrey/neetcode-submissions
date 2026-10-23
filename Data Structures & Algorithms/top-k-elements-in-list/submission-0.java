class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count the frequency of each number
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // buckets[i] contains numbers that appear i times
        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);

        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            buckets.get(count).add(num);
        }

        // Collect the k most frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int count = nums.length; count >= 1 && index < k; count--) {
            for (int num : buckets.get(count)) {
                result[index++] = num;

                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
}