package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsRunner {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bunny", "Sunny", "Rekha", "Roshan");
		
		String collect = names.stream().collect(Collectors.joining(":"));
		System.out.println(collect);

	}

}
