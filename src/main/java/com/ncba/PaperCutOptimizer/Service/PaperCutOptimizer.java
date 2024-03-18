package com.ncba.PaperCutOptimizer.Service;

public class PaperCutOptimizer {
    public static int largestN(String s) {
        int maxLength = s.length();
        int maxSum = 0;

        for (int i = 1; i < maxLength; i++) {
            String firstPart = s.substring(0, i);
            String secondPart = s.substring(i);

            int xCount = countOccurrences(firstPart, 'x');
            int oCount = countOccurrences(secondPart, 'o');

            int currentSum = xCount + oCount;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    // Function to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
