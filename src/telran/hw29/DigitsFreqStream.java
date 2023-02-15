package telran.hw29;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class DigitsFreqStream {
	private static final int N_NUMBER = 1_000_000;
	
	public static void main(String[] args) {

		new Random().ints(0, Integer.MAX_VALUE)
					.limit(N_NUMBER)
					.mapToObj(Integer::toString)
					.flatMap(w -> Arrays.stream(w.split("")))
					.collect(Collectors.groupingBy(n -> n, Collectors.counting()))
					
					.entrySet()
					.stream()
					.sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
					.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
	}
}
