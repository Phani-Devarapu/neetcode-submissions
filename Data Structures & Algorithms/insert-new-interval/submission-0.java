class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if (intervals.length == 0) {
            return new int[][] { newInterval };
        }

        int index = 0;
        boolean added = false;
        for (int i = 0; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] < newInterval[0]) {
                index++;
            }
        }

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (i == index) {
                list.add(newInterval);
                added = true;
            }
            list.add(intervals[i]);
        }

        if (!added) {
            list.add(newInterval);
        }

        ArrayList<int[]> mer = merge(list);
        return mer.toArray(new int[mer.size()][]);
    }

    public ArrayList<int[]> merge(List<int[]> list) {
        ArrayList<int[]> result = new ArrayList<>();
        int[] current = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int[] next = list.get(i);
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(current);
                current = next;
            }
        }
        result.add(current);
        return result;
    }
}
