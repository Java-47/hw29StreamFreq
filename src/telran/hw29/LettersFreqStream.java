package telran.hw29;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LettersFreqStream {
	private static final String words = "Lorem ipsum dolor sit amet, consectetur! adipiscing elit, sed? do eiusmod tempor incididunt ut labore et dolore magna aliqua. Malesuada nunc vel risus commodo viverra maecenas accumsan lacus vel. Massa ultricies mi quis hendrerit dolor magna eget est lorem. Nec tincidunt praesent semper feugiat nibh sed pulvinar. Aliquam eleifend mi in nulla posuere sollicitudin aliquam. Sem integer vitae justo eget magna fermentum iaculis eu non. Tincidunt arcu non sodales neque sodales ut etiam. Massa sed elementum tempus egestas sed sed risus. Etiam dignissim diam quis enim lobortis scelerisque fermentum dui. Ultrices gravida dictum fusce ut. Mi bibendum neque egestas congue quisque egestas diam in. Quisque non tellus orci ac. Sed egestas egestas fringilla phasellus faucibus scelerisque eleifend donec. Scelerisque viverra mauris in aliquam sem fringilla. Quis viverra nibh cras pulvinar mattis. Erat pellentesque adipiscing commodo elit at imperdiet. Viverra ipsum nunc aliquet bibendum enim facilisis.";

	public static void main(String[] args) {

		Arrays.stream(words.split("[^a-zA-Z]+"))
							 .map(w -> w.toString().toLowerCase())
							 .flatMap(w -> Arrays.stream(w.split("")))
							 .collect(Collectors.groupingBy(l -> l, Collectors.counting()))
							 .forEach((k,v) -> System.out.println(k + " -> " + v));
	}

}
