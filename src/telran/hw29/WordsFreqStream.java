package telran.hw29;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordsFreqStream {
	
	private static final String[] words = { "abc", "ab", "limn", "limn", "ab", "limn", "a" };
	
	public static void main(String[] args) {
		Arrays.asList(words).stream()
							.collect(Collectors.groupingBy(n -> n, Collectors.counting()))
							.forEach((k,v) -> System.out.println(k + " -> " + v));

	}

}
