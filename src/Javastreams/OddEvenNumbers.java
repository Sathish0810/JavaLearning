package Javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
        List<Integer>list=Arrays.asList(9,8,5,6,4,3,2,4);
       List evenNumberList= list.stream().filter(e -> e%2==0).collect(Collectors.toList());
       List oddNumberList= list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
       
       System.out.println(evenNumberList);
       System.out.println(oddNumberList);

	}
	

}
