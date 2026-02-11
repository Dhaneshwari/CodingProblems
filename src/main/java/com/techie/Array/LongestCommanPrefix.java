package com.techie.Array;

import java.util.Arrays;

public class LongestCommanPrefix {
    public static void main(String[] args) {
        String arr[] = {"line", "codex", "codevork"};
     System.out.println(findLongestCommonPrefix(arr));
    }

        public static String findLongestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            // Sort the array
            Arrays.sort(strs);

            // Compare the first and last string in the sorted array
            String first = strs[0];  //codeline
            String last = strs[strs.length - 1]; //codevork
            int i = 0;

            // Find the common prefix between first and last
            while (i < first.length() && i < last.length() &&
                    first.charAt(i) == last.charAt(i)) {
                i++;
            }

            return first.substring(0, i);
        }


}
