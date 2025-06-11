package org.toby.personal.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestSquareRootFloor {


    private static Stream<Arguments> provideSquareRootFloorTest() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(4, 2),
                Arguments.of(8, 2),
                Arguments.of(2147395600, 46340)
        );
    }

    @MethodSource("provideSquareRootFloorTest")
    @ParameterizedTest
    void square_root_floor_returns_correct_result(int numberToSquareRoot, int expectedResult){
        Assertions.assertEquals(expectedResult, SquareRootFloor.mySqrt(numberToSquareRoot));
    }

}