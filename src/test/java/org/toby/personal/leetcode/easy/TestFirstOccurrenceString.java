package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class TestFirstOccurrenceString {

    public static Stream<Arguments> provideFirstOccurrenceString() {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("sadbutsad", "but", 3),
                Arguments.of("adbutsad", "sad", 5),
                Arguments.of("leetcode", "leeto", -1));
    }

    @MethodSource("provideFirstOccurrenceString")
    @ParameterizedTest
    void first_occurrence_string_correct(String haystack, String needle, int expectedIndex){
        Assertions.assertEquals(expectedIndex, FirstOccurrenceString.getFirstOccurrenceIndex(haystack, needle));
    }
}