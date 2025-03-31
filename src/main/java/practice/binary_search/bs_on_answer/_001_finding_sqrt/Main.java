package practice.binary_search.bs_on_answer._001_finding_sqrt;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var ans = solution.floorSqrt(30000);
        System.out.println(ans);
    }
}

class Solution {

    /*
    Here, the monotonic predicate function is f(x) = (x * x) > n
     */
    int floorSqrt(int n) {
        int start = 1, end = n;
        int ans = 1;

        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if ((mid * mid) > n) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }
}


