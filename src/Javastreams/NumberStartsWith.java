package Javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(900,9908,5,6,4,3,2,4);
        
        List StartsWith9=list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("9"))
        .map(e  -> Integer.parseInt(e)).collect(Collectors.toList());
        System.out.println(StartsWith9);
        

	}

}
