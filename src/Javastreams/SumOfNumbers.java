package Javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4);
        Optional<Integer>sum=list.stream().reduce((a,b) ->a+b);
        System.out.println(sum.get());
	}

}
