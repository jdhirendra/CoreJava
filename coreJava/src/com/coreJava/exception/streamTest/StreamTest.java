package com.coreJava.exception.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> nos1 = Arrays.asList(100, 400, null, 900);
		Function<Integer, Optional<Double>> f1 = number -> Optional.of(Double.valueOf(number));

		List<Double> nos2 = Arrays.asList(100.0, 400.0, null, 900.0, 1000.0);
		Function<Double, Optional<Double>> f2 = number -> Optional.of(Double.valueOf(number));

		List<Double> result = null;
		result = nos1.stream().map(no -> numberCheck(f1, no)).filter(Optional::isPresent).map(Optional::get)
				.map(no -> Math.sqrt(no.get())).collect(Collectors.toList());
		System.out.println(result);

		result = nos2.stream().map(no -> numberCheck(f2, no)).filter(Optional::isPresent).map(Optional::get)
				.map(no -> Math.sqrt(no.get())).collect(Collectors.toList());
		System.out.println(result);
	}

	private static Double numberCheck(Integer no) {
		try {
			return Double.valueOf(no);
		} catch (Exception e) {
			return 0d;
		}
	}

	private static <I, O> Optional<O> numberCheck(Function<I, O> op, I no) {
		try {
			return Optional.of(op.apply(no));
		} catch (Exception e) {
			return Optional.empty();
		}
	}
}
