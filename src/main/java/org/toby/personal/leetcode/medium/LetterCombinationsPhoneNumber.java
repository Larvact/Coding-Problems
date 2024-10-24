package org.toby.personal.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class LetterCombinationsPhoneNumber
{
    private static final Map<String, List<String>> NUMBER_LETTERS_MAP = new HashMap<>();

    static
    {
        NUMBER_LETTERS_MAP.put("2", List.of("a", "b", "c"));
        NUMBER_LETTERS_MAP.put("3", List.of("d", "e", "f"));
        NUMBER_LETTERS_MAP.put("4", List.of("g", "h", "i"));
        NUMBER_LETTERS_MAP.put("5", List.of("j", "k", "l"));
        NUMBER_LETTERS_MAP.put("6", List.of("m", "n", "o"));
        NUMBER_LETTERS_MAP.put("7", List.of("p", "q", "r", "s"));
        NUMBER_LETTERS_MAP.put("8", List.of("t", "u", "v"));
        NUMBER_LETTERS_MAP.put("9", List.of("w", "x", "y", "z"));
    }

    public static List<String> letterCombinations(final String digits)
    {
        if(digits.isBlank())
        {
            return Collections.emptyList();
        }
        final var digitsSplit = splitDigits(digits);
        var combinations = NUMBER_LETTERS_MAP.get(digitsSplit.get(0));
        for(int splitIndex = 1; splitIndex < digitsSplit.size(); splitIndex ++)
        {
            combinations = calculateCombinations(combinations, NUMBER_LETTERS_MAP.get(digitsSplit.get(splitIndex)));
        }
        return combinations;
    }

    private static List<String> splitDigits(final String digits)
    {
        List<String> splitDigits = new ArrayList<>();
        final var pattern = Pattern.compile("\\d");
        final var matcher = pattern.matcher(digits);
        while(matcher.find())
        {
            splitDigits.add(matcher.group(0));
        }
        return splitDigits;
    }

    private static List<String> calculateCombinations(final List<String> currentCombinations, final List<String> lettersToAdd)
    {
        final List<String> newCombinations = new ArrayList<>();
        for(var combination : currentCombinations)
        {
            for(var letter : lettersToAdd)
            {
                newCombinations.add(combination + letter);
            }
        }
        return newCombinations;
    }
}
