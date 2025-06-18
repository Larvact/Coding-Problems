package org.toby.personal.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurrenceString {

    public static int getFirstOccurrenceIndex(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        if (needleChars.length == 0) {
            return -1;
        }
        List<Integer> indexCache = getFirstCharIndexes(haystackChars, needleChars);
        for (int subsequentIndex = 1; subsequentIndex < needleChars.length && !indexCache.isEmpty(); subsequentIndex++) {
            indexCache = generateSubsequentIndexCache(indexCache, haystackChars, needleChars[subsequentIndex]);
        }
        return indexCache.stream()
                .findFirst()
                .map(index -> index - needle.length() + 1)
                .orElse(-1);
    }

    private static List<Integer> getFirstCharIndexes(char[] haystackChars, char[] needleChars) {
        List<Integer> firstCharIndexes = new ArrayList<>();
        for (int index = 0; index < haystackChars.length - needleChars.length + 1; index++) {
            if (needleChars[0] == haystackChars[index]) {
                firstCharIndexes.add(index);
            }
        }
        return firstCharIndexes;
    }

    private static List<Integer> generateSubsequentIndexCache(List<Integer> indexCache, char[] haystackChars, char subsequentNeedleChar) {
        List<Integer> subsequentIndexCache = new ArrayList<>();
        for (int index : indexCache) {
            int nextIndex = index + 1;
            if (subsequentNeedleChar == haystackChars[nextIndex]) {
                subsequentIndexCache.add(nextIndex);
            }
        }
        return subsequentIndexCache;
    }
}
