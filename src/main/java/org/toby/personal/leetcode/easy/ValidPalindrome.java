package org.toby.personal.leetcode.easy;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if(s == null){return false;}
        String alphaOnlyCharString = s.replaceAll("[^a-zA-Z\\d]", "").toLowerCase();
        return isWordPalindrome(alphaOnlyCharString);
    }

    private static boolean isWordPalindrome(String s){
        char[] charArray = s.toCharArray();
        for(int index = 0; index < charArray.length/2; index++){
            if (charArray[index] != charArray[charArray.length - 1 - index]){
                return false;
            }
        }
        return true;
    }
}
