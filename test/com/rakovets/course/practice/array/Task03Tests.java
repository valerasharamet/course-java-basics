package com.rakovets.course.practice.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task03Tests {
	static Stream<Arguments> testProvider() {
		return Stream.of(
				Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, Map.of("average", new double[]{4.67, 5.44, 5.44}, "min", new int[]{4, 4, 4}, "max", new int[]{5, 4, 4})),
				Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, Map.of("average", new double[]{6.0, 5.44, 5.44}, "min", new int[]{2, 4, 4}, "max", new int[]{8, 4, 4})),
				Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, Map.of("average", new double[]{7.67, 5.44, 5.44}, "min", new int[]{7, 4, 4}, "max", new int[]{9, 4, 4})),
				Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, Map.of("average", new double[]{72.0, 5.44, 5.44}, "min", new int[]{46, 4, 4}, "max", new int[]{100, 4, 4})),
				Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, Map.of("average", new double[]{5.67, 5.44, 5.44, 5.44}, "min", new int[]{0, 4, 4, 4}, "max", new int[]{7, 4, 4, 4}))
		);
	}

	@ParameterizedTest(name = "Marks: {0}")
	@MethodSource("testProvider")
	@DisplayName("Average mark for subject")
	void getAverageMarkTest(int[][] marks, Map actual) {
		assertArrayEquals(Task03.getAverageMark(marks), (double[]) actual.get("average"));
	}

	@ParameterizedTest(name = "Marks: {0}")
	@MethodSource("testProvider")
	@DisplayName("Min mark for subject")
	void getMinMarkTest(int[][] marks, Map actual) {
		assertArrayEquals(Task03.getMinMark(marks), (int[]) actual.get("min"));
	}

	@ParameterizedTest(name = "Marks: {0}")
	@MethodSource("testProvider")
	@DisplayName("Max mark for subject")
	void getMaxMarkTest(int[][] marks, Map actual) {
		assertArrayEquals(Task03.getMaxMark(marks), (int[]) actual.get("max"));
	}
}