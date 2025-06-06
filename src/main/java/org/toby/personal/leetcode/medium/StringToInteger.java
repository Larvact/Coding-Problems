package org.toby.personal.leetcode.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {

    public static int myAtoi(String string){
        String stringWithoutLeadingEmpties = string.strip();
        boolean isNegative = stringWithoutLeadingEmpties.startsWith("-");
        boolean startWithSign = isNegative;
        if(!isNegative && stringWithoutLeadingEmpties.startsWith("+")){
            startWithSign = true;
        }
        if(startWithSign){
            stringWithoutLeadingEmpties = stringWithoutLeadingEmpties.substring(1);
        }
        Pattern pattern = Pattern.compile("^(\\d+)");
        Matcher matcher = pattern.matcher(stringWithoutLeadingEmpties);
        if(matcher.find()){
            String number = matcher.group(1);
            int numberStartIndex = getStartNumberIndex(number);
            number = number.substring(numberStartIndex);
            return calculateIntegerFromNumberString(number, isNegative);
        }
        return 0;
    }

    private static int getStartNumberIndex(String numberString){
        char[] numberArray = numberString.toCharArray();
        int currentIndex = 0;
        while (numberArray[currentIndex] == '0' && currentIndex + 1 < numberArray.length){
            currentIndex++;
        }
        return currentIndex;
    }

    private static int calculateIntegerFromNumberString(String numberString, boolean isNegative){
        try {
            return isNegative ? Integer.parseInt(numberString) * -1 : Integer.parseInt(numberString);
        }
        catch (NumberFormatException nfe){
            return isNegative ? Integer.MIN_VALUE :Integer.MAX_VALUE;
        }
    }
}
