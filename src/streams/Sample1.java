package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample1 {

	public static void main(String[] args) {
		
		Stream<String> st = Stream.empty();
		
		String[] sa = {"hari", "ravi", "sam v"};
		
		List<String> ls = new ArrayList<>();
		
		ls.addAll(Arrays.asList(sa));
		ls.add("kay");
		
		ls.stream().forEach(e -> {System.out.println(e);} );
		
		List<String> op = ls.stream().filter( e -> e.matches("^\\w+\\s{1}\\w+$")).collect(Collectors.toList());
		
		op.stream().forEach(e -> {e += " ***1 ";System.out.println(e);});
		
		
		ls.stream().forEach(e -> {System.out.println(e);} );
	}

}
