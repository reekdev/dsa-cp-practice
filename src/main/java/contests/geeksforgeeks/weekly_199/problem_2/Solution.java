package contests.geeksforgeeks.weekly_199.problem_2;

import java.util.*;

public class Solution {
    public List<Long> uniqueSize(int n, int d, long[][] arr) {
        var ans = new ArrayList<Long>();

        /* In this array, we store the length for each node, i.e. sizes[2] = length of node 2 */
        var sizes = new long[n+1];
        var map = new HashMap<Long, Integer>();
        map.put(0L, n);

        for (int i = 0; i < d; i++) {
            var nodeNumber = (int) arr[i][0];
            var length = arr[i][1];

            var oldLengthOfCurrentNode = sizes[nodeNumber];

            var isOldLengthOfTheCurrentNodeExistsInMap = map.containsKey(oldLengthOfCurrentNode);
            if (isOldLengthOfTheCurrentNodeExistsInMap) {
                var count = map.get(oldLengthOfCurrentNode);
                var newCount = count - 1; // we need to decrease count of the old size, since it is not there anymore
                map.put(oldLengthOfCurrentNode, newCount);

                if (newCount == 0) {
                    map.remove(oldLengthOfCurrentNode);
                }
            }

            var newLengthOfCurrentNode = sizes[nodeNumber] + length;
            sizes[nodeNumber] = newLengthOfCurrentNode;
            map.put(newLengthOfCurrentNode, map.getOrDefault(sizes[nodeNumber], 0) + 1);

            var numberOfUniqueSizes = (long) map.size();
            ans.add(numberOfUniqueSizes);
        }

        return ans;
    }
}
