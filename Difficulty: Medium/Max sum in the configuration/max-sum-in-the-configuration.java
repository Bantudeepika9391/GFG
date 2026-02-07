class Solution {
    int maxSum(int[] arr) {
        int n = arr.length;

        // Step 1: Calculate sum of array elements
        int arrSum = 0;
        for (int x : arr) {
            arrSum += x;
        }

        // Step 2: Calculate value for first configuration
        int currVal = 0;
        for (int i = 0; i < n; i++) {
            currVal += i * arr[i];
        }

        int maxVal = currVal;

        // Step 3: Compute subsequent values using formula
        for (int i = 1; i < n; i++) {
            currVal = currVal + arrSum - n * arr[n - i];
            maxVal = Math.max(maxVal, currVal);
        }

        return maxVal;
    }
}
