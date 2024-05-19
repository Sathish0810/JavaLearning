package Javastreams;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumber {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4);
       double avg= list.stream().mapToInt(e -> e).average().getAsDouble();
       System.out.println(avg);

	}

}
