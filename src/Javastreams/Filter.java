package Javastreams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(900,8,5,6,4,3,2,4);
        double filterAvg=list.stream().map(e -> e*e).filter(e ->  e>100)
        .mapToInt(e -> e).average().getAsDouble();
        System.out.println(filterAvg);
	}

}
