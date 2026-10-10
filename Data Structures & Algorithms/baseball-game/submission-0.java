class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Stack<Integer> record = new Stack<>();

        for (String operation : operations) {
            if (operation.equals("+")) {
                int last = record.pop();
                int secondLast = record.pop();
                record.addAll(List.of(secondLast, last, last + secondLast));
            }
            else if (operation.equals("D")) {
                record.add(record.peek() * 2);
            } 
            else if (operation.equals("C")) {
                record.pop();
            }
            else {
                record.add(Integer.valueOf(operation));
            }
        }

        while (!record.isEmpty()) {
            sum += record.pop();
        }

        return sum;
    }
}